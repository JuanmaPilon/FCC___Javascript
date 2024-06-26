<%@page import="java.util.Locale"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="logica.DTProveedor"%>
<%@page import="logica.DTTurista"%>
<%@page import="logica.Usuario"%>

<%@page import="logica.Usuario" %>
<%@page import="logica.Proveedor" %>
<%@page import="logica.Turista" %>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%      String usua = (String) request.getSession().getAttribute("usuario");
            Usuario usi = (Usuario) request.getSession().getAttribute("usu");
        %>
        <meta charset="UTF-8">
        <link href="styles.css" rel="stylesheet">
        <title>Turismo.uy - Modificar Usuario</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
    </head>
    <body>
        <div class="container">

        <header>
            <div id="logo">
                <h1>Turismo.uy - Modificar mis Datos</h1>
            </div>
            <div id="login">
                <a href="logedUser.jsp">Volver al inicio</a>
            </div>
        </header>
        
        <aside>
                      <h2>Mi perfil</h2>
            <ul>
                <%
                    if (usi instanceof Proveedor) {
                %>
                <li><a href="consultaUsuario.jsp">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="SvModificarUsuario?usuario=<%= usua%>">Modificar mis datos</a></li> <!-- Proveedor, Turista -->
                <li><a href="altaActividadTuristica.jsp?usuario=<%= usua%>">Alta Actividad Turistica</a></li> <!-- Proveedor -->
                <li><a href="consultaActividadTuristica.jsp">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="altaSalidaTuristica.jsp">Alta de Salida Turistica</a></li> <!-- Proveedor -->
                <li><a href="consultaSalidaTuristica.jsp">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="consultaPaqueteActividadesTuristicas.jsp">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="inscripcionSalida.jsp">Inscripcion Salida Turistica</a></li> <!-- Visitante, Proveedor, Turista -->

                <%
                    }
                %>


                <%
                    if (usi instanceof Turista) {
                %>
                <li><a href="consultaUsuario.jsp">Consulta de Usuario</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="SvModificarUsuario?usuario=<%= usua%>">Modificar mis datos</a></li> <!-- Proveedor, Turista -->
                <li><a href="consultaActividadTuristica.jsp">Consulta de Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="consultaSalidaTuristica.jsp">Consulta Salida Turistica</a></li> <!--Visitante, Proveedor, Turista -->
                <li><a href="inscripcionSalida.jsp">Inscripcion a Salida Turistica</a></li> <!-- Turista -->
                <li><a href="consultaPaqueteActividadesTuristicas.jsp">Consulta Paquete Actividad Turistica</a></li> <!-- Visitante, Proveedor, Turista -->
                <li><a href="compraPaquete.jsp">Compra de Paquete</a></li> <!-- Turista -->
                    <%
                        }
                    %>
                </aside>
        <main>
            <%
                String usuario = request.getParameter("usuario"); // Para tener el nickname del usuario al acceder a la página
                Usuario usu = (Usuario) request.getSession().getAttribute("usuarioConsulta"); // Usuario devuelto del servlet SvModificarUsuario
                String tipoUsuario = (String) request.getSession().getAttribute("tipoUsuario"); // Usuario: turista o proveedor
                String errorMensaje = (String) request.getAttribute("errorMensaje");
                String rutaImagenPerfil =  (String) request.getSession().getAttribute("rutaImagen");
            %>




            <%
                if (tipoUsuario.equals("turista")) {
                    DTTurista infoTurista = (DTTurista) request.getSession().getAttribute("infoTurista");
                    Date fNacimiento = null;
                    String fechaNacimientoString = infoTurista.getfNacimiento();

                    // Realiza la conversión de "dd/MM/yyyy" a "yyyy-MM-dd"
                    SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
                    SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechaNacimientoDate = formatoEntrada.parse(fechaNacimientoString);
                    String fechaFormateada = formatoSalida.format(fechaNacimientoDate);
                    fNacimiento = formatoSalida.parse(fechaFormateada);
                    System.out.print("fNcimiento: " + fNacimiento);
                    System.out.print("fechaFormateada " + fechaFormateada);
            %>   
            <form action="SvModificarUsuario" method="POST" enctype="multipart/form-data">

                <label for="TipoUsuario">Tipo Usuario: </label>
                <input type="text" id="TipoUsuario" name="TipoUsuario" value="<%= tipoUsuario%>" readonly>

                <label for="nickname">Nickname</label>
                <input type="text" id="nickname" name="nickname" value="<%= infoTurista.getNickname()%>" readonly>

                <label for="nombre">Nombre</label>
                <input type="text" id="nombre" name="nombre" value="<%= infoTurista.getNombre()%>">

                <label for="apellido">Apellido</label>
                <input type="text" id="apellido" name="apellido" value="<%= infoTurista.getApellido()%>">

                <label for="correo">Correo</label>
                <input type="email" id="correo" name="correo" value="<%= infoTurista.getCorreo()%>" readonly> 

                <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input type="date" id="fechaNacimiento" name="fechaNacimiento" value="<%= fechaFormateada%>">

                <label for="imagen">Imagen (opcional):</label>
                <input type="file" name="file" id="file">

                <label for="nacionalidad">Nacionalidad</label>
                <input type="text" id="nacionalidad" name="nacionalidad" value="<%= infoTurista.getNacionalidad()%>">

                <button type="submit">Modificar</button>
            </form>




            <%
            } else {
                DTProveedor infoProveedor = (DTProveedor) request.getSession().getAttribute("infoProveedor");
                Date fNacimiento = null;
                String fechaNacimientoString = infoProveedor.getfNacimiento();

                // Realiza la conversión de "dd/MM/yyyy" a "yyyy-MM-dd"
                SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat formatoSalida = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaNacimientoDate = formatoEntrada.parse(fechaNacimientoString);
                String fechaFormateada = formatoSalida.format(fechaNacimientoDate);
                fNacimiento = formatoSalida.parse(fechaFormateada);
                System.out.print("fNcimiento: " + fNacimiento);
                System.out.print("fechaFormateada " + fechaFormateada);

            %>
            <form action="SvModificarUsuario" method="POST" enctype="multipart/form-data">
                <label for="TipoUsuario">Tipo Usuario: </label>
                <input type="text" id="TipoUsuario" name="TipoUsuario" value="<%= tipoUsuario%>" readonly>

                <label for="nickname">Nickname</label>
                <input type="text" id="nickname" name="nickname" value="<%= infoProveedor.getNickname()%>" readonly>

                <label for="nombre">Nombre</label>
                <input type="text" id="nombre" name="nombre" value="<%= infoProveedor.getNombre()%>">

                <label for="apellido">Apellido</label>
                <input type="text" id="apellido" name="apellido" value="<%= infoProveedor.getApellido()%>">

                <label for="correo">Correo</label>
                <input type="email" id="correo" name="correo" value="<%= infoProveedor.getCorreo()%>" readonly>  

                <label for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input type="date" id="fechaNacimiento" name="fechaNacimiento" value="<%= fechaFormateada%>">

                <label for="imagen">Imagen (opcional):</label>
                <input type="file" name="file" id="file">

                <label for="descripcion">Descripcion</label>
                <input type="text" id="descripcion" name="descripcion" value="<%= infoProveedor.getDescripcion()%>">

                <label for="link">Link a Sitio Web:</label>
                <input type="url" id="sitioWeb" name="sitioWeb" value="<%= infoProveedor.getLink()%>">

                <button type="submit">Modificar</button>
            </form>



            <%
                }
            %>
            
            <img src="<%= rutaImagenPerfil %>" alt="Imagen de perfil">


        </main>

        <footer>
            <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
            <p>&copy; 2023 Turismo.uy</p>
        </footer>
            </div>
    </body>
</html>


