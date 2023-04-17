import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStreamOneByOne {
    public static void main(String[] args) {

        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int data;

        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }

        byte[] outSrc = outputStream.toByteArray();

        System.out.println("input source : " + Arrays.toString(inSrc));
        System.out.println("output source : " + Arrays.toString(outSrc));
    }
}
