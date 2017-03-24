<%-- 
    Document   : RegisCliente
    Created on : 1/03/2017, 08:36:43 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../css/bootstrap.css">
        <link rel="stylesheet" href="../css/estilos2.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
           <%@include file="../headerModulos.jspf" %>

        <section class="main container-fluid">
            <form class="navbar-left" role="search">
                <p>Ingresar Numero de Documento</p>
                <input type="number" class="form-control" value="">
                <br>
                <button type="submit" class="btn btn-success">REGISTRAR</button>
                <button type="submit" class="btn btn-info">CONSULTAR</button>
            </form>

            <div style="margin-top: 100px">
                <h2 style="text-align: center;">Registro del Cliente</h2><br><br>
            </div>
            <form>
                <div class="container">
                    <label class="form-control-label" for="index-form-4-4name">
                        <span class="titulo">Seleccione el tipo de documento</span></label>
                    <select class="form-control">
                        <option>Cédula de Ciudadanía</option>
                        <option>Tarjeta de Identidad</option>
                        <option>Registro Civil </option>
                        <option>Cédula de Extranjería</option>
                        <option>Otros</option>
                    </select><br>

                    <div class="container">
                        <label class="form-control-label" for="index-form1-1-name"><span class="titulo">Número de documento</span></label><br>
                        <input type="option" class="form-control" name="name"required="" data-form-field="Name" id="index-form1-1-name" placeholder="Ingrese su número de documento"><br>

                        <label class="form-control-label" for="index-form1-1-name"><span class="titulo">Nombres</span></label><br>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form1-1-name" placeholder="Ingrese los nombres del empleado"><br>

                        <labe2 class="form-control-label" for="index-form2-2-name"><span class="titulo"><b>Apellidos</b></span></labe2><br>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form2-2-name" placeholder="Ingrese los apellidos del empleado"><br>

                        <labe2 class="form-control-label" for="index-form2-2-name"><span class="titulo"><b>Fecha de Nacimiento</b></span></labe2><br>
                        <input type="date" class="form-control" name="name"required="" data-form-field="Name" id="index-form2-2-name" placeholder="Ingrese los apellidos del empleado"><br>

                        <label class="form-control-label" for="index-form-4-4name">
                            <span class="titulo">Sexo</span></label>
                        <select class="form-control">
                            <option>Masculino</option>
                            <option>Femenino</option>
                        </select><br>

                        <label class="form-control-label" for="index-form1-1-name"><span class="titulo">Municipio</span></label><br>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form1-1-name" placeholder="Ingrese el Municipio donde actualmente vive"><br>

                        <label class="form-control-label" for="index-form1-1-name"><span class="titulo">Dirección</span></label><br>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form1-1-name" placeholder="Ingrese su Dirección completa"><br>

                        <label class="form-control-label" for="index-form3-3-name"><span class="titulo">Barrio</span></label>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form3-3-name" placeholder="Ingrese el barrio donde vive"><br>

                        <labe2 class="form-control-label" for="index-form2-2-name"><span class="titulo"><b>Teléfono</b></span></labe2><br>
                        <input type="text" class="form-control" name="name"required="" data-form-field="Name" id="index-form2-2-name" placeholder="Ingrese su teléfono"><br>




                        <label class="form-control-label" for="index-form-4-4name"><span class="titulo">Celular</span></label>
                        <input type="tel" class="form-control" name="name"required="" data-form-field="Name" id="index-form4-4-name" placeholder="Ingrese su número"><br>

                        <label class="form-control-label" for="index-form-4-4name"><span class="titulo">Email</span></label>
                        <input type="tel" class="form-control" name="name"required="" data-form-field="Name" id="index-form4-4-name" placeholder="Ingrese su cuenta de correo electrónico"><br><br><br>

                        </form>
                        <button type="submit" class="btn btn-primary">MODIFICAR</button> <button type="submit" class="btn btn-success">ACEPTAR</button>

                        </section>



           
      <%@include file="../footer.jspf" %>
       
    </body>
</html>