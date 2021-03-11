public class BonusMoney {
    public static void main(String[] args) {
        int Balance = 10000;
        int ReplenishmentAmount = 110000;
        int BalanceAfter;
        if (ReplenishmentAmount >= 100000) {
            BalanceAfter = (Balance + ReplenishmentAmount + ReplenishmentAmount / 100) / 100;
        }
        else {
             BalanceAfter = Balance + ReplenishmentAmount;
        }
        System.out.println("Баланс счета: " + BalanceAfter);
    }
}




