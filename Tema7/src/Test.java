import java.sql.SQLOutput;

public class Test {


    public static void main(String[] args) {
        Producto producto1 = new Producto("5678-VHW", "Blanco", "Focus");
        Km0 cocheKm0 = new Km0("5678-FGR", "Verde", "KA+", "20000");
        Nuevo cocheNuevo1 = new Nuevo("5677-HWD", "Azul", "Turismo");
        SegundaMano segundaMano1 = new SegundaMano("7834-LKI", "Rosa", "Turismo", "56000", "Antonio Martín");
        System.out.println(producto1);
        System.out.println(cocheKm0);
        System.out.println(cocheNuevo1);
        System.out.println(segundaMano1);
    }
}
