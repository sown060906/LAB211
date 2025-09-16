/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0071;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Validation {
    private static final Scanner in = new Scanner(System.in);
    private static final String VALID_PLAN= "^[0-9]{1,2}\\.5$|^[0-9]{1,2}\\.0$";
    public static int checkIntLimit(int min,int max){
        while(true){
            try{
                int choice = Integer.parseInt(in.nextLine());
                if (choice < min || choice > max) throw new NumberFormatException();
                return choice;
            } catch (NumberFormatException ex){
                System.err.println("Re-input");
            }
        }
    }
    public static String checkInputDate(){
        while(true){
            try{
                String result = in.nextLine().trim();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(result);
                if(result.equals(format.format(date)))
                    return result;
            }
            catch(ParseException ex){}
            System.err.println("Re-input");
        }
    }
    public static String checkInputString(){
        while(true){
            String result =in.nextLine().trim();
            if(result.length()>0){
                return result;
            }
            System.err.println("Input can't be empty");
        }
    }
    public static int checkInputInt(){
        while(true){
            try{
                return Integer.parseInt(in.nextLine());
            }
            catch(NumberFormatException ex) {
                System.err.println("Re-input");    
            }
        }
    }
    public static String checkInputTaskId(){
        int choice = checkIntLimit(1,4);
        switch(choice){
            case 1: 
                return "Code";
            case 2:
                return "Test";
            case 3 :
                return "Design";
            case 4 :
                return "Review";
        }
        return "";
    }
    public static String checkInputPlan(){
        while(true){
            String result = checkInputString();
            try{
                double val = Double.parseDouble(result);
                if(result.matches(VALID_PLAN) && val >= 8.0 && val <= 17.5){
                    return result;
                }
            }
            catch(NumberFormatException e){}
                System.err.println("Re-input");
        }
    }
    public static double checkInputPlanTo(double planFrom) {
    while (true) {
        try {
            System.out.print("Enter To: ");
            double value = Double.parseDouble(in.nextLine().trim());
            if (value <= planFrom) {
                System.err.println("Plan To must be greater than Plan From.");
            } else if (value < 8.0 || value > 17.5) {
                System.err.println("Time must be in range 8.0 - 17.5");
            } else {
                return value;
            }
        } catch (NumberFormatException e) {
            System.err.println("Please input a number like 8.0, 8.5, ... 17.5");
        }
    }
}

}
