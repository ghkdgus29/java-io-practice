import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/BufferedReaderAndWriter.java");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            for (int i = 1; (line = br.readLine()) != null; i++) {
                System.out.println(i + ":" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
