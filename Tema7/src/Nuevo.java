public class Nuevo extends Producto {

    public Nuevo(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
    }
    @Override
    public String toString() {
        return "Nuevo: " +
                "\n matricula=" + getMatricula() +
                "\n color=" + getColor() +
                "\n modelo=" + getModelo() +
                ' ';
    }
}
