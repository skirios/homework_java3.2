public class BonusMoney2{
    public static void main(String[] args) {
        int balance = 10000;
        int replenishmentAmount = 150000;
        int balanceAfter = balance + replenishmentAmount;
        if (replenishmentAmount >= 100000) {
            balanceAfter = (balance + replenishmentAmount + replenishmentAmount / 100) / 100;
        }
        System.out.println("Баланс счета: " + balanceAfter);
    }
}

