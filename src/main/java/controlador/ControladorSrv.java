/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.*;

/**
 *
 * @author sebas
 */
@WebServlet(name = "ControladorSrv", urlPatterns = {"/ControladorSrv"})
public class ControladorSrv extends HttpServlet {
    ListMascotas p=new ListMascotas();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            //mascota
            String tipoMascota = request.getParameter("txtTipoMascota");
            boolean toxoplasmosis = Boolean.parseBoolean(request.getParameter("txtFelinoToxoplasmosis"));
            int nivelEntranamiento = Integer.parseInt(request.getParameter("txtCaninoNvEntrenamiento"));
             
            String nombre = request.getParameter("txtNombre");
            String raza = request.getParameter("txtRaza");
            String color = request.getParameter("txtColor");
            int edad = Integer.parseInt(request.getParameter("txtEdad"));
            
            CrearObjeto mascota= new CrearObjeto(nombre, raza, color, edad, tipoMascota, toxoplasmosis, nivelEntranamiento);
            mascota.definirMascota();
            
            HashMascotas lista=new HashMascotas();
            
            lista.agregarMascota(nombre, mascota.getMascota());
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorSrv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorSrv at " + p.prueba() + "</h1>");
            out.println("<a href=\"index.html\">home</a>");
            out.println("</body>");
            out.println("</html>");
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
