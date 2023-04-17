import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyExample {
    public static void main(String[] args) {

        String originFileName = "C:\\Users\\ghkdg\\projects\\java-io-practice\\cat.jpg";
        String targetFileName = "C:\\Users\\ghkdg\\projects\\java-io-practice\\copy_cat.jpg";

        try (FileInputStream fis = new FileInputStream(originFileName);
             FileOutputStream fos = new FileOutputStream(targetFileName)) {

            int readByteNum;
            byte[] readBytes = new byte[100];
            while ((readByteNum = fis.read(readBytes)) != -1) {
                fos.write(readBytes, 0, readByteNum);
            }

            fos.flush();

            System.out.println("복사가 완료되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
