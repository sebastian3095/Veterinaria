package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.Caninos;
import modelo.Felinos;


@WebServlet(name = "srvControlador", urlPatterns = {"/srvControlador b n"})
public class SrvControlador extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //canino
            String caninoNombre = request.getParameter("txtCaninoNombre");
            String caninoRaza = request.getParameter("txtCaninoRaza");
            String caninoColor = request.getParameter("txtCaninoColor");
            int caninoEdad = Integer.parseInt(request.getParameter("txtCaninoEdad"));
            int caninoNvEntrenamiento = Integer.parseInt(request.getParameter("txtCaninoNvEntrenamiento"));
            
            //felino
            String felinoNombre = request.getParameter("txtfelinoNombre");
            String felinoRaza = request.getParameter("txtfelinoRaza");
            String felinoColor = request.getParameter("txtfelinoColor");
            int felinoEdad = Integer.parseInt(request.getParameter("txtfelinoEdad"));
            boolean toxoplasmosis = Boolean.parseBoolean(request.getParameter("txtFelinoToxoplasmosis"));
            
            
            Caninos canino = new Caninos();
            canino.setNombre(caninoNombre);
            canino.setRaza(caninoRaza);
            canino.setColor(caninoColor);
            canino.setEdad(caninoEdad);
            
            
            Felinos felino = new Felinos();
            felino.setNombre(felinoNombre);
            felino.setRaza(felinoRaza);
            felino.setColor(felinoColor);
            felino.setEdad(felinoEdad);
            
            
            ControladorMascotas cM = new ControladorMascotas();
            cM.agregarMascota(canino);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet srvControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet srvControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}