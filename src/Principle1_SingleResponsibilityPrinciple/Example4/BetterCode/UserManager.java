package Principle1_SingleResponsibilityPrinciple.Example4.BetterCode;
//Class responsible to handle user db i.e. single responsibility to hndle user
public class UserManager {

    // UserRepository userRepo;
    public void createUser(String username) {
        // Code to create a user
        // this.userRepo.create(...);
    }

    public void deleteUser(String username) {
        // Code to delete a user
        // this.userRepo.remove(...);
    }
}
