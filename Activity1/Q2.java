
import java.util.*;


public class Q2 {

    //Global array cricketer
    static int cricketer[] = new int[20];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20], scoreToBeat, n, count = 0;

        //Input for size of array
        n = sc.nextInt();

        //If size of array is negative or 0 then prints error
        if(n<=0){
            System.out.println("Invalid array size");
            sc.close();
            return;
        }

        //Input for array
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

            //If element of array is negative then prints error
            if(arr[i]<0){
                System.out.println("Invalid input");
                sc.close();
                return;
            }
        }

        scoreToBeat = sc.nextInt();

        //If score is negative then prints error
        if(scoreToBeat<0){
            System.out.println("Invalid input");
                sc.close();
                return;
        }

        sc.close();

        //Checks the cricketers whose scores are above the scoreToBeat and stores their ids' in global array cricketers
        for(int i=1; i<n; i+=2){
            if(arr[i]>scoreToBeat){
                cricketer[count++] = arr[i-1];
            }
        }

        //Print global array cricketers
        for(int i=0; i<count; i++){
            System.out.println(cricketer[i]);
        }
    }
}
