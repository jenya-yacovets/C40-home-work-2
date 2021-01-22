public class Additional_task_5 {
    public static void main(String[] args) {
        int n = 10;

        for (int i=1; i<n; i++) {
            if (i%2 != 0 && i%3 != 0 && i%5 != 0) {
                System.out.println(i);
            }
        }
    }
}
