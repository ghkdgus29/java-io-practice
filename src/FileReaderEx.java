import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("C:\\Users\\ghkdg\\projects\\java-io-practice\\file_test.txt")) {

            int readCharNo;
            char[] cbuf = new char[100];

            while ((readCharNo = fr.read(cbuf)) != -1) {
                String data = new String(cbuf, 0, readCharNo);
                System.out.println(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
