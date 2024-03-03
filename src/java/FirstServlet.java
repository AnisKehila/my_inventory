import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel=\"stylesheet\" href=\"./styles/bootstrap.min.css\" />");
        out.println("<title>Informations du client et du serveur</title>");
        out.println("</head>");
        out.println("<body class=\"container mt-4\">");
        out.println("<h1>Informations du client</h1>");
        out.println("<ul>");
        out.println("<li>Protocole : " + req.getProtocol() + "</li>");
        out.println("<li>Port : " + req.getRemotePort() + "</li>");
        out.println("<li>Adresse IP : " + req.getRemoteAddr() + "</li>");
        out.println("<li>Nom de client : " + req.getHeader("User-Agent") + "</li>");
        out.println("</ul>");
        out.println("<h1>Informations du serveur</h1>");
        out.println("<ul>");
        out.println("<li>Nom de serveur : " + req.getServerName() + "</li>");
        out.println("<li>Port du serveur : " + req.getServerPort() + "</li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
        }
    }
}
