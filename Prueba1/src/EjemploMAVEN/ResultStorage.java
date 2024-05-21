package EjemploMAVEN;
import java.io.*;

public class ResultStorage {
    private static final String FILE_NAME = "result.txt";

    public static void saveResult(String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getLastResult() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}