import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\ghkdg\\projects\\java-io-practice\\cat.jpg")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
