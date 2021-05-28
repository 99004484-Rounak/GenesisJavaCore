import java.util.*;
class Customer {
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

class CustomerMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = "", address = "", mobile = "", all = "";
        int count = 0;
        System.out.println("Enter the details:");
        all = sc.nextLine();

        for(String str : all.split(",")){
            if(count == 0){
                name = str;
            } else if (count == 1){
                address = str;
            } else {
                mobile = str;
            }
            count++;
        }


        Customer abc = new Customer();
        abc.setName(name);
        abc.setAddress(address);
        abc.setMobile(mobile);

        
        System.out.println("Name: " + abc.getName());
        System.out.println("Address: " + abc.getAddress());
        System.out.println("Mobile: " + abc.getMobile());

        sc.close();
    }
}
