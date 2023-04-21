package servlets;

import Clases.Caninos;
import Clases.Mascotas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "registrar", urlPatterns = {"/registrar.do"})
public class Registrar extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String tipoMascota = request.getParameter("txtTipoMascota");
            boolean tieneToxoplasmosis = Boolean.parseBoolean(request.getParameter("txtFelinoToxoplasmosis"));
            int nivelEntranamiento = Integer.parseInt(request.getParameter("txtCaninoNvEntrenamiento"));

            String nombre = request.getParameter("txtNombre");
            String raza = request.getParameter("txtRaza");
            String color = request.getParameter("txtColor");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));

            CrearObjeto.pp(nombre, raza, color, edad, tipoMascota, tieneToxoplasmosis, nivelEntranamiento);
            CrearObjeto.definirMascota();

            //verificar si existe la lista si no se crea
            ArrayList<Mascotas> lista;
            if (request.getSession().getAttribute("lista") == null) {
                lista = new ArrayList<>();
            } else {
                //si existe se recupera 
                lista = (ArrayList) request.getSession().getAttribute("lista");
            }
            lista.add(CrearObjeto.getMascota());

            CrearObjeto.definirNumeroM(lista.size());

            //SE carga la lista en sesion
            request.getSession().setAttribute("lista", lista);

            //Se redirecciona a usuario
            request.getRequestDispatcher("index.html").forward(request, response);

            

            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
