import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static float average(int[] array, int size){
        int sum =0 ;
        for(int ele : array){
            sum += ele;
        }
        return (float)(sum)/size;

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i =0 ;
        int[] array = new int[50];
        while(true){
            System.out.println("Enter number to find average | enter -1 to exit ");
            int num = sc.nextInt();
            if(num == -1){
                break;
            }
            else {
                i++;
                array[i] = num;
            }
        }
        float average = average(array, i);
        System.out.println("Average is : "+ (float)(average));
    }
}
