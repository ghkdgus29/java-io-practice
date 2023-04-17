import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelRead {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\ghkdg\\projects\\java-io-practice\\filechannel_test.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {

            ByteBuffer byteBuffer = ByteBuffer.allocate(100);

            Charset charset = Charset.defaultCharset();
            StringBuilder data = new StringBuilder();

            int byteCount;

            while (true) {
                byteCount = fileChannel.read(byteBuffer);
                if(byteCount == -1)
                    break;

                byteBuffer.flip();
                data.append(charset.decode(byteBuffer).toString());
                byteBuffer.clear();
            }

            System.out.println("file.txt : " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
