import java.util.*;

class Q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String lname1 = "", lname2 = "";
        for(String lname : name1.split(" ")){
            lname1 = lname;
        }
        for(String lname : name2.split(" ")){
            lname2 = lname;
        }

        if(lname1.equals(lname2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}