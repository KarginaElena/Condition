public class Main {
    public static void main(String[] args) {

        int amount = 200;
        int refill = 3000;
        int bonus = refill / 100;


        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int check = amount + bonus;

        System.out.println(" Ваш итоговый счет " + check);

    }
}
