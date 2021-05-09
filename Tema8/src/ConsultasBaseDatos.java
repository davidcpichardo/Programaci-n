import java.util.Scanner;
import java.sql.*;

public class ConsultasBaseDatos {
    public static void main(String[] args)  throws SQLException {
        Connection connection = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sURL= "jdbc:mysql://localhost:3306/concesionario";
            connection = DriverManager.getConnection(sURL, "root", "root");
            Statement stmt = connection.createStatement();

            //3A) Obtener los empleados de Almería.
            ResultSet set = stmt.executeQuery("select nombre,apellido1,apellido2,direccion from empleados where empleados.direccion = 'Almeria'");
            while (set.next()) {
                String nombre = set.getString("nombre");
                String apellido1 = set.getString("apellido1");
                String apeliido2 = set.getString("apellido2");
                System.out.println("Empleados residentes en Almería:");
                System.out.println("Empleados de Almería: "+ nombre +" "+ apellido1 +" "+apeliido2);

            }
            System.out.println("-----------------------------------------------------------");

            //3B) Obtener el sueldo actualizado de los empleados un 5%.
            ResultSet set3 = stmt.executeQuery("select empleados.nombre, empleados.sueldo*1.05 from empleados");
            System.out.println("Empleados con aumento de sueldo:");
            while (set3.next()) {
                String nombreEmpleado = set3.getString("nombre");
                double sueldo = set3.getDouble("empleados.sueldo*1.05");
                System.out.println("Empleado: "+nombreEmpleado+ " Sueldo ampliado 5%: "+ sueldo);
            }
            System.out.println("-------------------------------------------------------");

            //3C) Obtener el modelo de un coche dada una matrícula
            System.out.println("Obtención de modelo de vehículo :");
            System.out.println("Introduzca una matrícula: ");
            String entradaTeclado = "";
            Scanner entradaScanner = new Scanner(System.in);
            entradaTeclado = entradaScanner.nextLine();
            System.out.println("La matrícula elegida es: "+ entradaTeclado+" ");
            ResultSet set2 = stmt.executeQuery("select coches.marca, coches.modelo from concesionario.coches where coches.matricula ='"+entradaTeclado+"' ");
            while (set2.next()){
                String modelo = set2.getString("modelo");
                String marca = set2.getString("marca");
                System.out.println( "El modelo del vehículo con matrícula " + entradaTeclado +" es "+ marca + " " + modelo );
            }
            System.out.println("-------------------------------------------------------");

            //4B) Seleccionar empleado y su sueldo
            System.out.println("Empleados y sueldo:");
            ResultSet set4 = stmt.executeQuery("select nombre, apellido1, sueldo from empleados");
            while (set4.next()){
                String nombr = set4.getString("nombre");
                String apellido1 = set4.getString("apellido1");
                double sueld = set4.getDouble("sueldo");
                System.out.println("Empleado: "+ nombr +" " + apellido1 +" " + sueld);

            }
            connection.close();
        }catch (ClassNotFoundException | SQLException e) {
            if (connection != null) connection.close();
            e.printStackTrace();
        }


    }
}