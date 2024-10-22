package SolidPrinciples.Principle5_DependancyInversionPrinciple.BetterCode;

public class MySqlConnection implements DbConnection{
    @Override
    public void reminder() {
        System.out.println("Connecting to MySQL...");
    }
}
