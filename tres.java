import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class tres {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\EjerciciciosStreams\\datos3.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}