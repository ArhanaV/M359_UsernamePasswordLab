import java.util.Scanner;
public class UserInfoLab {
    public static void main(String[] args) {

        // Part 1
        String firstName;
        String lastName;
        String passWord;
        String creditCard;

        // Create a Scanner for keyboard input
        Scanner scan = new Scanner(System.in);

        // Ask the user to enter their first and last name and pass these
        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();

        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();

        // values to the generateUsername method and save the returned result.
        System.out.println(generateUsername(firstName, lastName));


        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        System.out.println("Enter a password: ");
        passWord = scan.nextLine();

        // The validatePassword method will check if the password meets the criteria:
        System.out.println(validatePassword(passWord));

        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.
        System.out.println("Enter your credit card number: ");
        creditCard = scan.nextLine();

        System.out.println(maskCreditCard(creditCard));

        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        // as shown in the demo video
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing

    }

    public static String generateUsername(String firstName, String lastName) {
        // Fill in this method and return an appropriate username
        String result = "";
        for(int i = 0; i <= 3; i++){

        }
        return "";
    }
    public static boolean validatePassword(String password) {
        // Fill in this method and return true/false if the password is valid
        return true;
    }
    public static String maskCreditCard(String creditCardNumber) {
        // Fill in this method and if the credit card is valid, return a masked CC
        return "";
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
