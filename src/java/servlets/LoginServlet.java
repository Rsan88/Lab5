
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import service.AccountService;

/**
 *
 * @author Raj
 */
public class LoginServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String logout = request.getParameter("logout");
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user1");
         
        if(logout == null){
            if(user != null){
                response.sendRedirect("home");
                return;
            }
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else if(logout==null||logout==""){
            String message = "You have logged out.";
            request.setAttribute("message", message);
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        AccountService user = new AccountService ();
        
        User user1 = user.login(username, password);
        
        if (user1 == null){
            String error = "invalid login";
            request.setAttribute("error", error);
            request.setAttribute("username", username);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }else{
            session.setAttribute("user1", user1);
            response.sendRedirect("home");
        }
        
    }

}
