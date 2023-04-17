import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassExample {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\ghkdg\\projects\\java-io-practice\\cats");
        File file1 = new File("C:\\Users\\ghkdg\\projects\\java-io-practice\\cats\\cat.jpg");
        File file2 = new File("C:\\Users\\ghkdg\\projects\\java-io-practice\\cats\\cat_2.jpg");

        if (!dir.exists()) {
            dir.mkdirs();
        }
        if (!file1.exists()) {
            file1.createNewFile();
        }
        if (!file2.exists()) {
            file2.createNewFile();
        }

        File fileDir = new File("C:\\Users\\ghkdg\\projects\\java-io-practice\\cats");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        File[] contents = fileDir.listFiles();

        System.out.println("날짜           시간       형태      크기      이름");
        System.out.println("----------------------------------------------------------------");

        for (File file : contents) {
            System.out.println(sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.println("\t<DIR>\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
