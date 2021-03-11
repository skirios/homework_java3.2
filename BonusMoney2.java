public class BonusMoney2 {
    public static void main(String[] args) {
        int Balance = 10000;
        int ReplenishmentAmount = 150000;
        int BalanceAfter = Balance + ReplenishmentAmount;
        if (ReplenishmentAmount >= 100000) {
            BalanceAfter = (Balance + ReplenishmentAmount + ReplenishmentAmount / 100) / 100;
        }
        System.out.println("Баланс счета: " + BalanceAfter);
    }
}
