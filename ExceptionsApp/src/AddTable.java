public class AddTable {
    public static void main(String[] args) {

        int[] array = new int[3];
        try {
            for (int i = 0; i < 4; ++i) {
                array[i] = i;
            }
            System.out.println(array);
        }catch(Exception e ){
            System.out.println("passe la taille du tabeau");
        }
        }
}
