package shutdown;

import java.io.IOException;

public class Shutdown{
    public static void main(String[] args) {
        try {
            // Execute system command to shutdown the PC
            Runtime.getRuntime().exec("shutdown -s -t 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
