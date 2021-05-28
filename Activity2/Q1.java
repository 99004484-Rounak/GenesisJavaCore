import java.util.*;
class Employee {
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

class EmployeeMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name, address, mobile;
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter Address:");
        address = sc.nextLine();
        System.out.println("Enter Mobile:");
        mobile = sc.nextLine();

        Employee abc = new Employee();
        abc.setName(name);
        abc.setAddress(address);
        abc.setMobile(mobile);

        System.out.println("Employee Details");
        System.out.println("Name: " + abc.getName());
        System.out.println("Address: " + abc.getAddress());
        System.out.println("Mobile: " + abc.getMobile());

        sc.close();
    }
}
