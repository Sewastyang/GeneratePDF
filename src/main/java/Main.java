import Service.Service;
        import java.io.IOException;

/**
 * Starts XML to PDF converter on http://localhost:8080
 *
 * @author Zolotukhin Sergey
 */
public class Main {
    private static final int PORT = 8080;

    /**
     * Method starts service
     * @param args no args expected
     */
    public static void main(String[] args) {
        try {
            Service service = new Service(PORT);
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
