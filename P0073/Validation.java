/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0073;

/**
 *
 * @author Admin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    private static final Scanner in = new Scanner(System.in);

    public static int checkInt(int max, int min){   
        while (true){
            String input = checkInput();
            try {
                int result = Integer.parseInt(input);
                if (result < min || result > max){
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e){
                System.out.println("Invalid number");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.length() > 0) {
                return result;
            }
            System.err.println("Input can't be empty");
        }
    }
    public static double checkInputDouble() {
        while (true) {
            try {
                double value = Double.parseDouble(in.nextLine().trim());
                if (value <= 0) {
                    System.err.println("Amount must be greater than 0");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public static String checkInputDate() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
                format.setLenient(false);
                Date date = format.parse(result);
                if (result.equals(format.format(date))) {
                    return result;
                }
            } catch (ParseException ex) {
            }
            System.err.println("Re-input (format: dd-MMM-yyyy, e.g., 11-Apr-2009)");
        }
    }
}


