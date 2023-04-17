import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayStreamChunk {
    public static void main(String[] args) {

        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int data;

        byte[] temp = new byte[inSrc.length];

        inputStream.read(temp, 0, temp.length);

        outputStream.write(temp, 5, 5);

        byte[] outSrc = outputStream.toByteArray();

        System.out.println("input source : " + Arrays.toString(inSrc));
        System.out.println("temp source : " + Arrays.toString(temp));
        System.out.println("output source : " + Arrays.toString(outSrc));
    }
}
