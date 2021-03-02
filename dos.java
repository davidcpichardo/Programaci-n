import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class dos {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try(BufferedWriter bwr = new BufferedWriter(new FileWriter("C:\\EjerciciciosStreams\\datos2.txt"))){
            System.out.println("Introduce la base ");
            float base = scn.nextFloat();
            System.out.println("Introduce la altura");
            float altura = scn.nextFloat();
            String str = "Área del triángulo: " + ((base * altura) / 2) + " cm";
            bwr.write(str);
            System.out.println(str);
        } catch(IOException e) {
            System.out.println(e);
        }
    }

}