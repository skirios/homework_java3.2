public class BonusMoney {
    public static void main(String[] args) {
        int balance = 10000;
        int replenishmentAmount = 1000;
        int balanceAfter;
        if (replenishmentAmount >= 100000) {
            balanceAfter = (balance + replenishmentAmount + replenishmentAmount / 100) / 100;
        }
        else {balanceAfter = (balance + replenishmentAmount) / 100;
        }
        System.out.println("Баланс счета: " + balanceAfter);
    }
}




