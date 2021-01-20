public class Task_1 {
    public static void main(String[] args) {

        double interval = 10;
        int days = 7;
        int index = 10;

        for (int i = 1; i<days; i++) {
            interval += interval*index/100;
        }

        System.out.println("Спротсмен пробежит " + interval + " км");
    }
}
