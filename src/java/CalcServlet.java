import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        PrintWriter out = response.getWriter();
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        int resultat = 0;

        // Effectuer l'opération demandée
        switch(operation) {
            case "addition":
                resultat = num1 + num2;
                break;
            case "soustraction":
                resultat = num1 - num2;
                break;
            case "multiplication":
                resultat = num1 * num2;
                break;
            case "division":
                if(num2 != 0) {
                    resultat = num1 / num2;
                } else {
                    out.println("Erreur: division par zero");
                    return;
                }
                break;
            default:
                out.println("Opération non reconnue");
                return;
        }

        // Afficher le résultat
        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("Résultat de l'opération: " + resultat);
        out.println("</body></html>");
    }
}
