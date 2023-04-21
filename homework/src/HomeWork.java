import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

         Scanner A = new Scanner(System.in);

        System.out.println("Hello! What is your´e firstname?");
        String FName = A.nextLine();
        System.out.println("What is your´e secondname?");
        String SName = A.nextLine();
        System.out.println("Your´e full Name is " + FName + " " + SName);

    }

}
