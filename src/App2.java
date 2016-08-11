import java.io.*;

/**
 * Created by LordwolF on 8/10/2016.
 */
public class App2 {
    public static void main(String[] args) {

        File file = new File("test.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Unable to Read File");
        }


    }
}
