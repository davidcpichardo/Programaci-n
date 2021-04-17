public class Km0 extends Producto {

    private String kilometros;

    public Km0(String matricula, String color, String modelo, String kilometros) {
        super(matricula, color, modelo);
        this.kilometros = kilometros;
    }

    public String getKilometros() {
        return kilometros;
    }

    public void setKilometros(String kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {

        return "Km0:" +
                "\n kilometros=" +getKilometros() +
                "\n matricula=" + getMatricula() +
                "\n color=" + getColor() +
                "\n modelo=" + getModelo() +
                ' ';
    }
}
