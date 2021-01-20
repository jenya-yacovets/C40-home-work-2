public class Task_2 {
    public static void main(String[] args) {

        int amoeba = 1;

        for (int i = 3; i<=24; i+=3) {
            amoeba = amoeba * 2;
            System.out.println("Через " + i + " часов будет амеоб: " + amoeba);
        }
    }
}
