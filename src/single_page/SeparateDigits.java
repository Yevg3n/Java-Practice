package single_page;
/*
 * 		Write an application that inputs one number consisting of five digits from
 * user, separates the number into its individual digits and prints the digits
 * separated from one another by a comma (,) and one space each, except for
 * the last one.
 *
 */
import java.util.Scanner;

public class SeparateDigits {
    private static Scanner input;

    public static boolean isNumeric( ) {
        // This is a new change that I am practicing with
        int e = 0;
        int y = 5;


        while(!input.hasNextInt( )) {
            System.out.print("Invalid Input, try again: ");
            input.next( );
        }
        return true;
    }

    public static boolean checkLength(int userInput) {

        if(Integer.toString(userInput).length( ) != 5) {
            System.out.print("Invalid Input, must be five digit integer, try again: ");
            return false;
        }else{
            return true;
        }
    }

    public static void print(int userInput){

        String userInputToStr = Integer.toString(userInput);

        for(int i = 0; i < userInputToStr.length( ); i++){
            if(i < userInputToStr.length( ) - 1){
                System.out.printf("%s", userInputToStr.charAt(i));
                System.out.printf("%s", ", ");
            }else{
                System.out.printf("%s", userInputToStr.charAt(i));
            }
        }
    }

    /* Alternative solution
    public static void print(int userInput){

        int Length = Integer.toString(userInput).length( );
        for(int a = Length; a > 0; a--){
            int Digits = (int)((userInput % Math.pow(10 , a))/Math.pow(10, a-1));
            System.out.printf(" %d ", Digits);
        }
    }
    */

    public static void main(String[] args) {

        input = new Scanner( System.in );
        int userInput = 0;
        boolean validInput = false;

        System.out.print("\nEnter an arbitrary 5 digit number: ");
        do{
            if(isNumeric( )){
                userInput = input.nextInt( );

                if(checkLength(userInput)){
                    validInput = true;
                }
            }
        }while(!validInput);

        print(userInput);
    }
}
