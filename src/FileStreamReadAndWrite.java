import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamReadAndWrite {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("hi.txt");
        FileOutputStream fos = new FileOutputStream("hi_copy.txt");

        int data = 0;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
    }
}
