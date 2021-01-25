public class Task_8_1 {
    public static void main(String[] args) {

        int n = 4;
        int space = 0;

        for (int i=0; i<n; i++) {

            for (int x=0; x<=space; x++) {
                System.out.print("  ");
            }

            int count = n - space;

            for (int x=0; x<count; x++) {
                System.out.print("* ");
            }
            space++;
            System.out.println();
        }
    }
}
