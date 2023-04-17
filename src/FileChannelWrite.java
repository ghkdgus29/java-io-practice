import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWrite {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\ghkdg\\projects\\java-io-practice\\filechannel_test.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            String data = "show me the money";
            Charset charset = Charset.defaultCharset();

            ByteBuffer byteBuffer = charset.encode(data);
            int byteCount = fileChannel.write(byteBuffer);

            System.out.println("file.txt : " + byteCount + " bytes written");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
