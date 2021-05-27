
import java.util.*;

public class Q1 {

    //Function to find the count of the chosen element in the array
    static int findElementCount(int arr[],int n,int a){

        int count = 0;

        for(int i=0;i<n;i++){

            //If the array has a negative number, the program halts
            if(arr[i]<0){
                System.out.println("Invalid Input");
                return -1;
            }
            //If the element is found, then the count is incremented
            else if(arr[i]==a){
                count++;
            }

        }

        return count;
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20], a, n, result;
        n = sc.nextInt();

        //If the size of the array is negative, the program halts.
        if(n<=0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }

        //Getting input for the array
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        a = sc.nextInt();
        sc.close();

        //Calling the function to find element count
        result = findElementCount(arr,n,a);

        //If the result is -1 it means that one of the element in the array is negative, so it stops
        if(result==-1){
            return;
        }else{
            System.out.println(result);
        }

    }



}

