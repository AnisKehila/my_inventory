import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel=\"stylesheet\" href=\"./styles/bootstrap.min.css\" />");
        out.println("<title>Tableau HTML dynamique</title>");
        out.println("</head>");
        out.println("<body>");
        if(req.getParameter("lignes").isBlank() || req.getParameter("colonnes").isBlank()) {
            out.println("<h1>"
                    + "<span class=\"text-danger\">ERR:</span>"
                    + " lignes et colonnes not specified!</h1>");
            return;
        }
            
        int nbLignes = Integer.parseInt(req.getParameter("lignes"));
        int nbColonnes = Integer.parseInt(req.getParameter("colonnes"));
        
       
        out.println("<h1 class=\"container mt-4\">Affichage Tableau:</h1>");
        out.println("<table class=\"container mt-4 table table-striped table-hover shadow-sm\">");
        out.println("<tr>");
        for (int j = 0; j < nbColonnes; j++) {
            out.println("<th>");
            out.println("Colonne " + (j + 1));
            out.println("</th>");
        }
        out.println("</tr>");
        for (int i = 0; i < nbLignes; i++) {
            out.println("<tr>");
            for (int j = 0; j < nbColonnes; j++) {
                out.println("<td>");
                out.println("Ligne " + (i + 1));
                out.println("</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
