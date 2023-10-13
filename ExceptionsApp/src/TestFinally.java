import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {

        System.out.println("entrer votre code ");
        try {
            try {
                int x = System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
                System.in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Merci de votre visite");

    }
}
