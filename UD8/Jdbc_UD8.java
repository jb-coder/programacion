package conectaBD;

import java.sql.*;

public class Jdbc_UD8 {

	public static void main(String[] args) {

		try {
			
//--------------------------------------------------------------INICIO-EJERCICIO2-------------------------------------
		// -CREAMOS LA CONEXIÓN CON LA BBDD
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal","root","");
			
//--------------------------------------------------------------FIN-EJERCICIO2----------------------------------------
			
			
			
//--------------------------------------------------------------INICIO-EJERCICIO1---------------------------------------------------------------------
			
		// -CREAMOS LOS OBJETOS STATEMENT
			
			Statement miStatement1 = miConexion.createStatement();
			Statement miStatement2 = miConexion.createStatement();
			Statement miStatement3 = miConexion.createStatement();
			
			
			
		// -CREAMOS LAS VARIABLES CON LAS SENTENCIAS SQL PARA CREAR LAS TABLAS
			
			String creacionTablaEmpleados = "CREATE TABLE EMPLEADOS (NIF VARCHAR(10) PRIMARY KEY,"
					+ "NOMBRE VARCHAR(20), APELLIDO1 VARCHAR(20), APELLIDO2 VARCHAR(20), DIRECCION VARCHAR(50),"
					+ "TELEFONO INT(10), EMAIL VARCHAR(30), SUELDO FLOAT)";

			String creacionTablaClientes = "CREATE TABLE CLIENTES (NIF VARCHAR(10) PRIMARY KEY,"
					+ "NOMBRE VARCHAR(20), APELLIDO1 VARCHAR(20), APELLIDO2 VARCHAR(20), DIRECCION VARCHAR(50),"
					+ "TELEFONO INT(10), EMAIL VARCHAR(30))";
			
			String creacionTablaCoches = "CREATE TABLE COCHES (MATRICULA VARCHAR(10) PRIMARY KEY,"
					+ "MARCA VARCHAR(20), MODELO VARCHAR(20), TIPO VARCHAR(20))";
			
			
		// -CREAMOS LAS VARIABLES CON LAS SENTENCIAS SQL PARA INSERTAR LOS DATOS
			
			
			String insercionDatosEmpleados = "insert into empleados (NIF,Nombre,Apellido1,Apellido2,Direccion,Telefono,Email,Sueldo)"
					+ " values ('43546576-S','Juan','Jimenez','Rodriguez','AV De la Paz 3 29010, Málaga',965678743,'juanitojr@coches.com',1325.76)";
			
			String insercionDatosClientes = "insert into clientes (NIF,Nombre,Apellido1,Apellido2,Direccion,Telefono,Email)"
					+ " values ('12345678-R','Alfredo','Sanchez','Roldan','Calle salamanca 3, 3º2, 04001, Almería',954342312,'alfredosarol@gmail.com')";
			
			String insercionDatosCoches = "insert into Coches (Matricula,Marca,Modelo,Tipo)"
					+ " values ('3456KYZ','Mazda','CX-3','SUV')";
			
			
		// -CREAMOS LAS VARIABLES CON LAS SETENCIAS SQL
			
			
			String instruccionSql = "UPDATE EMPLEADOS SET SUELDO = SUELDO*1.05";
			
		// -EJECUTAMOS EL METODO EXECUTEUPDATE PARA CREAR LAS TABLAS
			
			miStatement1.executeUpdate(creacionTablaEmpleados);
			miStatement1.executeUpdate(creacionTablaClientes);
			miStatement1.executeUpdate(creacionTablaCoches);
			System.out.println("TABLAS INSERTADAS CORRECTAMENTE");
			
		// -EJECUTAMOS EL METODO EXECUTEUPDATE PARA INSERTAR LOS DATOS
			
			miStatement1.executeUpdate(insercionDatosEmpleados);
			miStatement1.executeUpdate(insercionDatosClientes);
			miStatement1.executeUpdate(insercionDatosCoches);
			System.out.println("DATOS INSERTADOS CORRECTAMENTE");
			
//-----------------------------------------------------------------FIN-EJERCICIO1---------------------------------------------------------------------
			
			
//--------------------------------------------------------------INICIO-EJERCICIO3 y EJERCICIO4-------------------------------------
						
		// -INCREMENTAMOS EL SUELDO DE TODOS LOS EMPLEADOS EN UN 5%
			
			miStatement1.executeUpdate(instruccionSql);
			System.out.println("SUELDO INCREMENTADO CORRECTAMENTE");	

		// -CREAMOS LOS OBJETOS RESULTSET CON LAS CONSULTAS SQL
			
			ResultSet miResultset1 = miStatement1.executeQuery("SELECT * FROM clientes WHERE Direccion = 'almeria'");
			ResultSet miResultset2 = miStatement2.executeQuery("SELECT Modelo FROM coches WHERE Matricula='3456KYZ'");
			ResultSet miResultset3 = miStatement3.executeQuery("SELECT Nombre, Sueldo FROM Empleados");
		
		// -LEEMOS Y RECORREMOS LOS RESULSET
			
			while(miResultset1.next()) {

				System.out.println(miResultset1.getString("NOMBRE")+ " "+miResultset1.getString("APELLIDO1"));

			}

			while(miResultset2.next()) {

				System.out.println(miResultset2.getString("MODELO"));

			}
			
			while(miResultset3.next()) {

				System.out.println(miResultset3.getString("NOMBRE")+ " "+miResultset3.getString("SUELDO"));

			}
			
//--------------------------------------------------------------FIN-EJERCICIO3 y EJERCICIO4----------------------------------------
			
	// SI HAY UN FALLO EN LA EJECUCIÓN SALTA LA EXCEPCIÓN
			
		}catch(Exception e) {
		
			System.out.println(" Ups, Ocurrio un error inesperado :(");
			e.printStackTrace();
		}

	}

}
