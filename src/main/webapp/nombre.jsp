<%-- 
    Document   : patente
    Created on : 18/04/2023, 6:06:43 p. m.
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.Mascotas" %>
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
                <h2>Lista de caninos</h2>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Raza</th>
                            <th>Color</th>
                            <th>Edad</th>
                            <th>Toxoplasmosis</th>
                            <th>Nivel entrenamiento</th>
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
                            <td><%=m.getNombre()%></td>
                            <td><%=m.getRaza()%></td>
                            <td><%=m.getColor()%></td>
                            <td><%=m.getEdad()%></td>
                            <td><%=m.getTieneToxoplasmosis()%></td>
                            <td><%=m.getNivelEntrenamiento()%></td>
                            <td>
                                <form method="post" action="eliminar.do">
                                    <input type="hidden" name="pos" value="<%=i%>">
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

        </article>

                    
                    

    </body>
</html>
