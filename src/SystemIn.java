import java.io.IOException;

public class SystemIn {
    public static void main(String[] args) {
        int input = 0;
        try {
            while ((input = System.in.read()) != -1) {
                System.out.println("input : " + input + ", (char)input : " + (char) input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
