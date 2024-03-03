import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private String[][] users = {
        {"admin", "password"},
        {"anis", "1234"},
    };
    private boolean isValidUser(String username, String password) {
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true;
            }
        }
        return false;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Check if username and password are correct
        if (isValidUser(username, password)) {
            // If correct, forward to welcome page
            request.setAttribute("username", username);
            //response.sendRedirect("welcome.jsp?username=" + username);
            request.getRequestDispatcher("welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("err", "Wrong Credentials");
            request.getRequestDispatcher("login.jsp").forward(request, response);        }
    }
}
