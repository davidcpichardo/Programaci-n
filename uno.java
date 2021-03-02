import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class uno
{

    public static void main(String[] args) {
        File archive = new File("C:\\EjerciciciosStreams\\datos.txt");

        try {
            if (archive.createNewFile()) {
                System.out.println("Archivo creado: " + archive.getName());

                FileWriter writer = new FileWriter("C:\\EjerciciciosStreams\\datos.txt", true);
                int num_max_escribir = 10;
                int num = 0;
                while (num <= num_max_escribir){
                    writer.write(String.valueOf(num));
                    writer.write("\n");
                    num++;
                }
                writer.close();

            } else {
                System.out.println("Archivo ya existente");
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
