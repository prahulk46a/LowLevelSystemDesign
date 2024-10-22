package SolidPrinciples.Principle1_SingleResponsibilityPrinciple.Example2.ProblematicCode;

// Any issue with this class ??? => All responsibilities are into one single employee class which is violation of single responsibility principle
// Solution=> separate  classes should be there for each responsibility.
public class Employee {

    private int id;
    public int getId() {
        return this.id;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performance related data");
    }

}
