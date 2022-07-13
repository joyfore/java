import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    // HINT: initialize score before asking input from the user.
    int score = 0;
    Scanner scanner = new Scanner(System.in); 
    
    while (score <= 0 || score >= 100) {

      System.out.println("What is your score?");
      score = scanner.nextInt();
        
      
      if (score >= 0 && score <= 59) {
        System.out.println("you got an F, try harder next time");
        break;
      }
      else if (score >= 60 && score <= 69) {
        System.out.println("you got an D, Not bad but not good");
        break;
      }
      else if (score >= 70 && score <= 79) {
        System.out.println("you got an C, good job");
        break;
      }
      else if (score >= 80 && score <= 89) {
        System.out.println("you got an B, Great job, keep on working hard");
        break;
      }   
      else if (score >= 90 && score <= 100) {
        System.out.println("you got an A, awesome work");
        break;
      }   
    } 
    
    scanner.close();  
  }
}
