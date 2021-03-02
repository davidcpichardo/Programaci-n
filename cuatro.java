import java.io.*;
import java.nio.charset.StandardCharsets;

class Cuatro {
    public static void main(String[] args) throws IOException {

        File origen = new File("c:\\EjerciciciosStreams\\datos3.txt");
        File destino = new File("c:\\EjerciciciosStreams\\datosAleatorios.txt");

        BufferedReader br = new BufferedReader(new FileReader(origen));

        RandomAccessFile randomAccessFile = new RandomAccessFile(destino, "rw");

        String st;
        while ((st = br.readLine()) != null) {
            randomAccessFile.write(st.getBytes(StandardCharsets.UTF_8));
        }

        randomAccessFile.close();

    }

}
