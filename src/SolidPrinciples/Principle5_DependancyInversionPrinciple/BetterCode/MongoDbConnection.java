package SolidPrinciples.Principle5_DependancyInversionPrinciple.BetterCode;

public class MongoDbConnection implements DbConnection{
    @Override
    public void reminder() {
        System.out.println("Connecting to MongoDb...");
    }
}
