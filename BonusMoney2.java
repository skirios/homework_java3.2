public class BonusMoney2{
    public static void main(String[] args) {
        int balance = 10000;
        int replenishmentAmount = 15000;
        int balanceAfter = (balance + replenishmentAmount) / 100;
        if (replenishmentAmount >= 100000) {
            balanceAfter = (balance + replenishmentAmount + replenishmentAmount / 100) / 100;
        }
        System.out.println("Баланс счета: " + balanceAfter);
    }
}

