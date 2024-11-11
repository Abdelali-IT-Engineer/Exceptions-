import java.io.*;

public class RessourceManagement {
    public static void main(String[] args) {
        readFile("src/testfile.txt");
        readFile("nonexistent.txt");
    }

    public static void readFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
