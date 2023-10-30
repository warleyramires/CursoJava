import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\temp\\hello.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null){
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}