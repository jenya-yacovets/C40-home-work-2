public class Additional_task_7 {
    public static void main(String[] args) {
        int m = 500;
        int s = 900;
        int index = 20;

        int countYears = 0;
        int calculation = m;

        while (calculation <= s) {

            calculation += calculation * index / 100;
            countYears++;
        }

        System.out.println("Через " + countYears + " лет долг бизнесмена превысит " + s + " рублей и составит " + calculation + " рублей");
    }
}
