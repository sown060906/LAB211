/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0065;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Validation {
    public static final Scanner sc = new Scanner(System.in);
    public static String getString(){
        while(true){
            String input = sc.nextLine().trim();
            if(!input.isEmpty()){
                return input;
            }
            System.out.println("Input cannot be Empty");
        }
    }
    public static double getDouble(double min,double max){
        while(true){
            try{
                String input = sc.nextLine().trim();
                double value = Double.parseDouble(input);
                if(value >= min && value<= max){
                    return value;
                }
                System.out.println("Value must between"+min+"and"+max);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid number format.");
            }
        }
    }
    public static boolean getYesNo(){
        while(true){
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("Y")) return true;
            if (input.equalsIgnoreCase("N")) return false;
            System.out.println("Please enter Y or N");
        }
    }
}
