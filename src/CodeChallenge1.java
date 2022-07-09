import java.util.Scanner;

class CodeChallenge1 {
    public static void main(String[] args) {

        // Generate number between 1 and 10.


        // Ask user question.
        System.out.println("give a num from 1 to 4");

        // Get their answer by using input scanner.
  /*
  Print 8 different happy fortunes if the user types Yes.
  Provide a sad fortune as the default. Hint: Use a SWITCH STATEMENT by
  testing variable num as the condition. Use either format provided in class.
  */

        // Ask question.

        // Create Java input.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        String message;

        switch (num){
            case 1:
                message="You go into your room, then your mom yeets you with a slipper";
                break;
            case 2:
                message ="Your mom takes away your electronics also, don't lie to me that you don't have one, cause if you don't then how are you looking at this fricking replit right now ;-;";
                break;
            case 3:
                message = "Uh oh, mom is here to ruin your day!";
                break;
            case 4:
                message = "U picked the lucky number 4";
                break;
            case 5:
                message = "Uh oh mom is amazing";
                break;
            default:
                message = "chose a number 4 or under";
                break;
        }

        System.out.println(message); // prints message based
    }
}