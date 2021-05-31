import java.util.*;

class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String stringF = sc.nextLine();
        String stringL = sc.nextLine();
        stringF = stringF.toLowerCase();
        stringL = stringL.toUpperCase();
        char[] a = new char[20];
        a = stringF.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        System.out.print(a);
        System.out.print(" " + stringL);
        sc.close();
    }
}