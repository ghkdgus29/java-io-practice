import java.io.FileWriter;

public class FileWriterEx {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("C:\\Users\\ghkdg\\projects\\java-io-practice\\file_writer_test.txt")) {

            fw.write("FileWriter는 한글로된 \r\n");
            fw.write("문자열을 바로 출력할 수 있다.\r\n");
            fw.write("show me the money");

            fw.flush();

            System.out.println("파일에 저장되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
