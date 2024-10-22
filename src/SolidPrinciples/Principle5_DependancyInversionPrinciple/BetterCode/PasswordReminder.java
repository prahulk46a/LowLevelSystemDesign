package SolidPrinciples.Principle5_DependancyInversionPrinciple.BetterCode;

public class PasswordReminder {
    DbConnection connection;
    public PasswordReminder(DbConnection connection) {
        this.connection = connection;
    }
    //During executing PasswordReminder method it will decide what method should get executed by parameter that passed
    //No need to change every time when we want to add other similar connections
    public void reminder() {
        System.out.println("Password reminder");
        connection.reminder();
    }
}