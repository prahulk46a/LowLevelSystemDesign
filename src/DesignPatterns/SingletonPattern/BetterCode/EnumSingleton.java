package DesignPatterns.SingletonPattern.BetterCode;

public class EnumSingleton {
    public static void main(String[] args) {
        DatabaseConnection  s1 = DatabaseConnection.INSTANCE;
        DatabaseConnection s2 = DatabaseConnection.INSTANCE;

        System.out.println(s1 == s2); // true ✅
        s1.connect();
        s2.connect();
    }
}
