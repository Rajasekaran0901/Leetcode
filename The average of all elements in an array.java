
import java.util.Scanner;

public class array1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int sum = 0;
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum+= arr[i];
        }
        System.out.print("Average:"+ sum/arr.length);
    }
}
