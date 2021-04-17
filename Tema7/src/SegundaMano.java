public class SegundaMano extends Km0 {

    private String antiguoPropietario;

    public SegundaMano(String matricula, String color, String modelo, String kilometros, String antiguoPropietario) {
        super(matricula, color, modelo, kilometros);
        this.antiguoPropietario = antiguoPropietario;
    }

    public String getAntiguoPropietario() {
        return antiguoPropietario;
    }

    public void setAntiguoPropietario(String antiguoPropietario) {
        this.antiguoPropietario = antiguoPropietario;
    }

    @Override
    public String toString() {
        return "SegundaMano: " +
                "\n antiguoPropietario=" + antiguoPropietario +
                "\n kilometros=" +getKilometros() +
                "\n matricula=" + getMatricula() +
                "\n color=" + getColor() +
                "\n modelo=" + getModelo();

    }
}
