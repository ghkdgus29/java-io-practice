import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamFixedChunk {
    public static void main(String[] args) {

        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] temp = new byte[4];
        byte[] outSrc = null;

        System.out.println("input source : " + Arrays.toString(inSrc));

        try {
            while (inputStream.available() > 0) {
                int len = inputStream.read(temp);

                System.out.println("temp source : " + Arrays.toString(temp));
                outputStream.write(temp, 0, len);

                outSrc = outputStream.toByteArray();
                System.out.println("output source : " + Arrays.toString(outSrc));
            }
        } catch (IOException e) {
            System.out.println("catched IOException " + e.getMessage());
        }
    }
}
