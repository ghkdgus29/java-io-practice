import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderAndWriter {
    public static void main(String[] args) {
        String inputData = "show me the money";
        try (StringReader input = new StringReader(inputData); StringWriter output = new StringWriter()) {

            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }

            System.out.println("Input Data : " + inputData);
            System.out.println("Output Data : " + output.toString());
            System.out.println("Output Data : " + output.getBuffer());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
