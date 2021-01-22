public class Additional_task_1 {
    public static void main(String[] args) {

        for (int i=1; i<=9; i++) {

            System.out.println("*** Умножение на " + i + " ***");
            for (int c=1; c<=9; c++) {
                System.out.println(c + " x " + i + " = " + (c*i));
            }
        }
    }
}
