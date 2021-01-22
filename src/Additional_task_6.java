public class Additional_task_6 {
    public static void main(String[] args) {

        int money = 30;
        int price = 8;

        int spentMoney = 0;
        int countEaten = 0;

        while (spentMoney + price <= money) {
            spentMoney += price;
            countEaten++;
        }

        System.out.println("Петя съест " + countEaten + " мороженых и после у него останется " + (money - spentMoney) + " рублей");
    }
}
