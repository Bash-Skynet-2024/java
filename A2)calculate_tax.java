import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your annual income in lacs : ");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0.0f;
        if (income < 2.5f){
            System.out.println("no income tax as out of income slab");
        }
        else if (income >= 2.5f && income <= 5.0f){
            tax = (float)((0.05f)*(income - 2.5f));
            System.out.println("tax to be paid is "+tax+" lacs");
        }
        else if(income > 5.0f && income <= 10.0f){
            tax = (float)((0.2)*(income - 2.5f));
            System.out.println("Tax to be paid is "+tax+ " lacs");
        }
        else if(income > 10.0f){
            tax = (float)((0.3)*(income-2.5f));
            System.out.println("tax to be paid is "+tax+" lacs");
        }

    }
}
