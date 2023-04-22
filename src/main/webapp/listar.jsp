<%-- 
    Document   : Listar
    Created on : 20/04/2023, 3:06:02 p. m.
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.*" %>
<%@page import="servlets.*" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href= "stiloSrv.css" rel="stylesheet" type="text/css"/> 
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@500&display=swap" rel="stylesheet">


        <title>JSP Page</title>
    </head>
    <body>
        
        
        <article>
            <div>
                <h2>Buscar por nombre:</h2>
                <form action="pornombre.do" method="post">
                    Nombre:<input type="text" name="txtNombre">
                    <input type="submit" name="enviar" value="Buscar">
                </form>

            </div>
        </article>
            
        
        

        <article>
            <div>
                <h2>Lista mascotas</h2>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Raza</th>
                            <th>Color</th>
                            <th>Edad</th>
                            <th>Otros</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% 
                            ArrayList<Mascotas> lista = (ArrayList<Mascotas>) request.getSession().getAttribute("lista");
                            for(int i=0; i<lista.size(); i++){
                                Mascotas m = lista.get(i);
                               
                        %>
                        <tr>
                            <%=m.toString()%>
                            
                            <td>
                                <form method="post" action="eliminar.do">
                                    <input type="hidden" name="pos" value="<%=i%>">
                                    <input type="hidden" name="txtTipoMascota" value="<%=m.getTipoMascota()%>">
                                    <input type="submit" value="Eliminar">
                                </form>
                            </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
                <br>
                <a href="index.html">Volver a inicio</a>     

            </div>
            <%  int ms=CrearObjeto.getTotalMascotas(); 
                int g=CrearObjeto.getContadorFelinos();
                int c=CrearObjeto.getContadorCaninos();
            %>
                    <h2>Total mascotas</h2>
                    <p><%=ms%></p>
                    <h2>Total gatos</h2>
                    <p><%=g %></p>
                    <h2>Total Caninos</h2>
                    <p><%=c%></p>

        </article>
     

    </body>
</html>
