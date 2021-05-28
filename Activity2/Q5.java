import java.util.*;
class Employee2 {
    private String name;
    private String address;
    private String mobile;
    String getName(){
        return this.name;
    }
    void setName(String str){
        this.name = str;
    }
    String getAddress(){
        return this.address;
    }
    void setAddress(String str){
        this.address = str;
    }
    String getMobile(){
        return this.mobile;
    }
    void setMobile(String str){
        this.mobile = str;
    }
}

class EmployeeMain2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        String name, address, mobile;
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter Address:");
        address = sc.nextLine();
        System.out.println("Enter Mobile:");
        mobile = sc.nextLine();




        Employee2 abc = new Employee2();
        abc.setName(name);
        abc.setAddress(address);
        abc.setMobile(mobile);
        while(ch!=4){
            System.out.println("Verify and Update the details:");
            System.out.println("Menu");
            System.out.println("1. Update Employee Name");
            System.out.println("2. Update Employee Address");
            System.out.println("3. Update Employee Mobile");
            System.out.println("4. All information correct/ Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Current Name is: " + abc.getName());
                    System.out.println("Enter the Name:");
                    name = sc.nextLine();
                    name = sc.nextLine();
                    abc.setName(name);
                    break;
                case 2:
                    System.out.println("Current Address is: " + abc.getAddress());
                    System.out.println("Enter the Address:");
                    address = sc.nextLine();
                    address = sc.nextLine();
                    abc.setAddress(address);
                    break;
                case 3:
                    System.out.println("Current Mobile is: " + abc.getMobile());
                    System.out.println("Enter the Mobile:");
                    mobile = sc.nextLine();
                    mobile = sc.nextLine();
                    abc.setMobile(mobile);
                    break;
                default:
                    break;
            }
        }
        System.out.println("The details are: ");
        System.out.println("Name: " + abc.getName());
        System.out.println("Address: " + abc.getAddress());
        System.out.println("Mobile: " + abc.getMobile());

        sc.close();
    }
}
