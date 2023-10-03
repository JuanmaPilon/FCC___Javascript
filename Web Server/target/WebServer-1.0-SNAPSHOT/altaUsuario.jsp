<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="styles.css" src="styles.css"">
    <title>Turismo.uy - Reserva de Paquetes Turísticos</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

    <header>
        <div id="logo">
            <h1>Turismo.uy</h1>
        </div>
        <div id="search">
            <form action="buscar.jsp" method="post">
                <input type="text" name="query" placeholder="Buscar turistas o paquetes">
                <button type="submit">Buscar</button>
            </form>
        </div>
        <div id="login">
        <a href="index.jsp" src="index.jsp">Cancelar Alta Usuario</a>
        </div>
    </header>
    
 
    <aside>
        <h2>Departamentos</h2>
        <ul>
            <li><a href="#">Montevideo</a></li>
            <li><a href="#">Canelones</a></li>
            <li><a href="#">Maldonado</a></li>
            <li><a href="#">Colonia</a></li>
            <li><a href="#">Rocha</a></li>
       
        </ul>
        
        <h2>Categorías</h2>
        <ul>
            <li><a href="#">Aventura y Deporte</a></li>
            <li><a href="#">Campo y Naturaleza</a></li>
            <li><a href="#">Cultura y Patrimonio</a></li>
            <li><a href="#">Gastronomia</a></li>
            <li><a href="#" target="_blank">Turismo Playas</a></li>
            


        
        </ul>
    </aside>
    

    <main>
        <h2>Alta de Usuario</h2>
        <form action="SvTurista" method="POST" enctype="multipart/form-data">
            <label for="nickname">Nickname único:</label>
            <input placeholder="JuanitoKpo777" type="text" id="nickname" name="nickname" required>
            
            <label for="nombre">Nombre:</label>
            <input placeholder="Juan" type="text" id="nombre" name="nombre" required>
            
            <label for="apellido">Apellido:</label>
            <input placeholder="Sito" type="text" id="apellido" name="apellido" required>
            
            <label for="contrasenia">Contraseña:</label>
            <input type="password" id="contrasenia" name="contrasenia" required>
            
            <label for="confirmacion">Confirmar Contraseña:</label>
            <input type="password" id="confirmacion" name="confirmacion" required>
            
            <label for="correo">Correo Electrónico único:</label>
            <input placeholder= "juanitopotter777@sucio.com" type="email" id="correo" name="correo" required>
            
            <label for="fechaNacimiento">Fecha de Nacimiento:</label>
            <input type="date" id="fechaNacimiento" name="fechaNacimiento" required>
            
            <label for="imagen">Imagen (opcional):</label>
            <input type="file" id="imagen" name="imagen">
            
            <label for="tipoUsuario">Tipo de Usuario:</label>
            <select id="tipoUsuario" name="tipoUsuario" required>
                <option value="turista">Turista</option>
                <option value="proveedor">Proveedor</option>
            </select>
            
       <!-- Turista -->
            <div id="camposTurista">
                <label  for="nacionalidad">Nacionalidad:</label>
                <input placeholder="Chile" type="text" id="nacionalidad" name="nacionalidad">
            </div>
            
      <!--Proveedor-->
            <div id="camposProveedor">
                <label for="descripcion">Descripción general:</label>
                <textarea placeholder="Escribe aqui tu descripcion..." id="descripcion" name="descripcion" rows="4"></textarea>
                
                <label for="sitioWeb">Link a Sitio Web:</label>
                <input type="url" id="sitioWeb" name="sitioWeb">
            </div>
            
            <button type="submit">Registrar</button>
        </form>
    </main>
    
  
    <footer>
        <p>Creado por Juan Martin Pilon - Carlos Santana - Natalia Lopez - Santiago Badiola</p>
        <p>&copy; 2023 Turismo.uy</p>
    </footer>
</body>
</html>
