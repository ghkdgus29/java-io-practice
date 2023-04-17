import java.nio.ByteBuffer;

public class CompareSizeDirectAndNondirectBuffer {
    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(200 * 1024 * 1024);
        System.out.println("Created Direct Buffer - " + directBuffer.capacity());

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200 * 1024 * 1024);
        System.out.println("Created Non-Direct Buffer - " + nonDirectBuffer.capacity());
    }
}
