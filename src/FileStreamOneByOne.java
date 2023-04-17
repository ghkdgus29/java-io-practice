import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamOneByOne {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hi.txt");
        int data = 0;

        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }

    }
}
