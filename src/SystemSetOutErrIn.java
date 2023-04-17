import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SystemSetOutErrIn {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("out_test.txt");
             PrintStream ps = new PrintStream(fos)) {

            System.setOut(ps);

            System.out.println("out - show me the money");
            System.err.println("err - show me the money");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
