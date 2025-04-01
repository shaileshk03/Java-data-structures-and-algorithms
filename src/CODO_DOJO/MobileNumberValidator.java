package CODO_DOJO;

import java.util.Scanner;

/**
 * @author Shailesh
 */
public class MobileNumberValidator {

    private static boolean isValidMobileNumber(String number) {
        // regex will check the first digit should start from (7, 8, 9) + 9 digits = 10 digits and will return the match
        return number.matches("^[789]\\d{9}$");
    }

    public static void main(String[] args) {
        // Scanner object created
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String number = scanner.nextLine();
            if (isValidMobileNumber(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
