import java.util.Scanner;
public class project1{
    public static void InnerNumberGuessingGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelect Difficulty Level: ");
        System.out.println("1.Easy(10 chances)");
        System.out.println("2.Medium(5 Chances)");
        System.out.println("3.Hard(3 Chances)");
        int choice = sc.nextInt();
        int number = 1+(int)(100*Math.random());
        int k;
        switch (choice) {
            case 1:
                k=10;
                break;
            
            case 2:
                k=5;
                break;
            case 3:
                k=3;
               break;
            default:
                System.out.println("Invalid Choice.Medium Selected");
                k= 5;
        }
        System.out.println("Please Choose a Number between 1 and 100");
        System.out.println("You have "+ k +" attempts to guess the correct number.");

        // timer:
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        double seconds = (endTime-startTime)/1000.0;
        

        for(int i=0;i<k;i++){
            System.out.println("Attempt "+(i+1)+ " of "+k);
            System.out.print("Enter your guess : ");
            int guess = sc.nextInt();

            if(guess==number){
                System.out.println("Congratulations! You guessed the correct number.");
                
                return;
            }else if(guess<number){
                System.out.println("The number is greater than "+guess);
            }else{
                System.out.println("The number is less than "+guess);
            }
            }
            
            System.out.println("You have exhausted all attempts. The correct number was: "+ number);
            System.out.println("Time Taken : "+seconds+"seconds");
            
        }
        public static void main(String[] args){
           InnerNumberGuessingGame();
            
        }
    }
    
        
    

