package J1.S.P0024;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

class Validation {
    private static final Scanner sc = new Scanner(System.in);

    // Check user input integer limit
    public static int checkLimitInput(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.err.println("Please input number in range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }

    // Check user input string
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    // Check user input yes/no
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input Y/y or N/n");
            System.out.print("Enter again: ");
        }
    }

    // Check user input update/delete
    public static boolean checkUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input U/u or D/d");
            System.out.print("Enter again: ");
        }
    }

    // Check user input course
    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Java") || 
                result.equalsIgnoreCase(".Net") || 
                result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.err.println("Please input Java, .Net or C/C++");
            System.out.print("Enter again: ");
        }
    }
}
