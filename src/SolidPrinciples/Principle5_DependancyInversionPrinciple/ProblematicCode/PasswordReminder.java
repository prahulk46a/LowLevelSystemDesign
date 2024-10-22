package SolidPrinciples.Principle5_DependancyInversionPrinciple.ProblematicCode;
//Problem=> Tight coupling is there inside this below code.When we want to set suppose postgresql connection we need to change every single time when we needed
//Solution=> Dependancy inversion principle=> Entities must depend on abstraction rather than concrete classes

public class PasswordReminder {
    MySqlConnection connection;
    MongoDbConnection mongoDbConnection;
    public PasswordReminder(MySqlConnection connection) {
        this.connection = connection;
    }
    public PasswordReminder(MongoDbConnection mongoDbConnection) {
        this.mongoDbConnection = mongoDbConnection;
    }
//    public void reminder() {
//        System.out.println("Password reminder");
//        connection.connect();
//    }
    public void reminder() {
        System.out.println("Password reminder");
        mongoDbConnection.connect();
    }
}
