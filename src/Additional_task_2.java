public class Additional_task_2 {
    public static void main(String[] args) {

        double money = 100;
        int years = 10;
        int index = 3;

        for (int i=1; i<=years; i++) {
            money += money * index / 100;
        }

        System.out.println("Через " + years + " вы получите " + money + "$");
    }
}
