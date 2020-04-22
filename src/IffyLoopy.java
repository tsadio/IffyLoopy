import java.util.Scanner;

public class IffyLoopy {
    public static void main (String [] args ) {
        Scanner in = new Scanner(System.in);
        boolean redEyes;
        String response;
        String resp1 = "yes";
        String resp2 = "y";
        String resp3 = "no";
        String resp4 = "n";

        do {
            System.out.println("Are your eyes red? ");
            response = in.nextLine();
            if (response.equals(resp1) || response.equals(resp2)) {
                redEyes = true;
                System.out.println("Get some sleep!");
            }
            else if (response.equals(resp3) || response.equals(resp4)) {
                System.out.println("You look great!");
                redEyes = false;
            }
            else {
                System.out.println("Wrong response.");
            }
            System.out.println("Do you want to try again? ");
            response = in.nextLine();
        } while (response.equals(resp1) || response.equals(resp2));
    }
}
