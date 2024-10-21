package Principle1_SingleResponsibilityPrinciple.TakeHomeTask.SchoolManagement.ProblematicCode;

class Student {
    // .. some properties
}
// 4 different responsibilities in single class hence violation of srp
public class SchoolManager {
    public void enrollStudent(Student student) {
        // Code for student enrollment
    }

    public void scheduleClasses() {
        // Code to schedule classes
    }

    public void manageTeacherSalaries() {
        // Code for managing teacher salaries
    }

    public void maintainSchoolInfrastructure() {
        // Code for maintaining infrastructure
    }
}
