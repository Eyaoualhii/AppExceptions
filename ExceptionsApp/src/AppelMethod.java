public class AppelMethod {


    public void method1() {
        this.method2();
    }

    public void method2() {
        try {
            this.method1();
        } catch (StackOverflowError e) {
            System.out.println("Appel recursive de la methode");
        }
    }


    public static void main(String[] args) {

                AppelMethod appel = new AppelMethod();
                appel.method1();

            }
}
