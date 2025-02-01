import java.util.*;
class Register{
    Scanner sc = new Scanner(System.in);
    private String email;
    private String pass;
    public void details(){
    System.out.print("Enter Username:");
    String user = sc.nextLine();
    System.out.print("Enter Name:");
    String name = sc.nextLine();
    while(true) {
        System.out.print("Enter Email Address:");
        email = sc.next();
        if(email.contains("@gmail.com")){
           break;
        }
        System.out.println("Invalid Email Address.please try again");
    }
    System.out.print("Enter Mobile Number:");
    String number = sc.next();
    System.out.print("Enter Password:");
    pass = sc.next();
    String conpass;
    while(true) {
        System.out.print("Enter to Confirm Password:");
        conpass = sc.next();
        if (conpass.contains(pass)) {
            break;
        }
        System.out.println("Password is not matching...Enter Again");
    }
    System.out.println("Account Created Sucessfully.");
    }
    public String getemail(){
        return email;
     }
     public String getpass(){
        return pass;
     }   
}
public class Login{
    public static void logout(){
        return;
    }
    public static void login(Register r){
        Scanner sc = new Scanner(System.in);
        System.out.println("LOGIN PAGE\nWelcome Back...");
        System.out.print("Enter the email address:");
        String e = sc.next();
        System.out.print("Enter the Password:");
        String pass = sc.next();
        if(r.getemail()==null || r.getpass() == null){
            System.out.println("Registration have done yet.");
        }
        else if (e.equals(r.getemail()) && pass.equals(r.getpass())) {
            System.out.println("Login Sucessfully..");
            System.out.print("Type logout if want to logout.");
            if (sc.next().equals("logout")) {
                logout();
            }
        }
        else{
            System.out.println("Credintials are not found.");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Register r = new Register();
        System.out.println("Welcome To Login Credintials:");
        System.out.print("1.Login\n2.Register");
        System.out.print("\nEnter value:");
        int n = sc.nextInt();
        switch(n){
          case 1:
          login(r);
          break;
          case 2:
          r.details();
          System.out.print("Do You want to Login(Say Yes/No):");
          String s = sc.next();
          if(s.equals("yes")) {
          login(r);
          }
          else{
            System.out.println("Thank You see you soon.");
          }
          break;
          default:
          System.out.println("You have Entered Invalid Number.");
        }
        
    }
}