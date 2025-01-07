import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mynum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Guess the number : (1-100) , enter '-1' to exit");
            int usernum = sc.nextInt();

            if(usernum == -1) {
                System.out.println("You lose .. the number is : " + mynum);
                break;
            }
            else if(usernum == mynum){
                System.out.println("Correct guess ");
                break;
            }
            else if(usernum > mynum){
                System.out.println("Wrong , guessed number too high ");
            }
            else if(usernum < mynum){
                System.out.println("Wrong , guessed number too low");
            }

        }while(true);
    }
}
