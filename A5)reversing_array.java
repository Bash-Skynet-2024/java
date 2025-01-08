import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter number of elements in  array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] array2 = new int[n];
        for(int i =0 ; i < n ; i++){
            System.out.println("Enter element at "+i+" index in array");
            array[i] = sc.nextInt();
        }
        int j = 0;
        for(int i = n-1 ; i>=0 ; i--){
            array2[j] = array[i];
            j++;
        }
        System.out.println("Original array : "+ Arrays.toString(array));
        System.out.println("reversed array : "+ Arrays.toString(array2));

    }
}
