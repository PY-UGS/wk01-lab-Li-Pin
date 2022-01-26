import java.util.Scanner;

public class Lab1_Qn2_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a module code: ");
        String module = input.nextLine();

        switch (module) {
            case "CSC1006":
                System.out.println("Mathematics II");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structures & Algorithms");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }
        System.out.println("After switch");

        input.close();
    }
}
