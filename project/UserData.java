package project;
import java.util.Scanner;

public class UserData {
    String username;
    String password;

    UserData(String user,String pass){
        this.username = user;
        this.password = pass;
    }
    public String printUsername(){
        //System.out.println(this.username);
        return this.username;
    }
    private String printPass(){
        return this.password;
    }
    public static UserData inputUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = scanner.next();
        scanner.nextLine();
        System.out.println("Enter your password: ");
        String passw = scanner.next();
        scanner.nextLine();
        UserData user = new UserData(email,passw);
        return user;
    }
}
