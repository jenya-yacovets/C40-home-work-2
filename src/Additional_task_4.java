public class Additional_task_4 {
    public static void main(String[] args) {

        int n = 7;
        int m = 5;

        int timeMin = m * 60;
        int allTimeMin = timeMin;

        for (int i=2; i<=n; i++) {
            timeMin += 10;
            allTimeMin += timeMin;
        }

        System.out.println("В сумме вся бригада проработает " + (allTimeMin/60) + " часов");
    }
}
