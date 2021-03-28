package cesur.unidad6.pila;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

public class PilaTest {
    public static void main(String[] args) throws PilaVaciaException {
        FileReader f = null; // to read files
        BufferedReader reader = null; // reading buffer
        String line = null; // read lines
        Pila pila = new PilaResuelta(); // initialization

        // opens the file
        final ClassLoader loader = PilaTest.class.getClassLoader();

        // in some function
        URL resource = loader.getResource("file.txt");
        try {
            f = new FileReader(resource.getPath());
            reader = new BufferedReader(f);
            while ((line = reader.readLine()) != null)
                pila.push(line);
        } catch (Exception e) {
            System.err.println("Archivo no encontrado" + resource);
            return;
        }

        // Gets the strings from the pila and prints them
        while (!pila.isEmpty()) {
            line = (String) pila.pop();
            System.out.println(line);
            System.out.println(pila.size());
        }
    }
}
