public class Task_1 {
    public static void main(String[] args) {

        double interval = 10;
        double result = interval;
        int days = 7;
        int index = 10;

        for (int i = 2; i<=days; i++) {
            interval += interval*index/100;
            result += interval;
        }

        System.out.println("Спортсмен пробежит " + result + " км");
    }
}
