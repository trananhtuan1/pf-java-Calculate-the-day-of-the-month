import java.util.Scanner;

public class daysInMoth {
    public static void main(String[] args) {
        System.out.println("Program Calculation Days In Month");
        System.out.println("Enter Month");
        int month;
        Scanner scanner = new Scanner(System.in);
        month = scanner.nextInt();

        switch (month) {
            case 2:
                System.out.println(month + "has 28 or 29 day");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "has 30 day");
                break;
            default:
                System.out.println("Invite Again Month");
        }
    }
}
