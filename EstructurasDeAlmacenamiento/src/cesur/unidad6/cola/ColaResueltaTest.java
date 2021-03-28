package cesur.unidad6.cola;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

public class ColaResueltaTest {
    public static void main(String[] args) throws ColaVaciaException {
        FileReader f = null; // to read files
        BufferedReader reader = null; // reading buffer
        String line = null; // read lines
        Cola cola = new ColaResuelta(); // initialization

        // opens the file
        final ClassLoader loader = ColaResueltaTest.class.getClassLoader();

        // in some function
        URL resource = loader.getResource("file.txt");
        try {
            f = new FileReader(resource.getPath());
            reader = new BufferedReader(f);
            while ((line = reader.readLine()) != null)
                cola.enqueue(line);
        } catch (Exception e) {
            System.err.println("Archivo no encontrado " + resource);
            return;
        }

        // Gets the strings from the cola and prints them
        while (!cola.isEmpty()) {
            line = (String) cola.dequeue();
            System.out.println(line);

        }
    }
}
