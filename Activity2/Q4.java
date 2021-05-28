import java.util.*;
class Company {
    private String name;
    private String employees;
    private String teamlead;
    String getName(){
        return this.name;
    }
    void setName(String str){
        this.name = str;
    }
    String getEmployees(){
        return this.employees;
    }
    void setEmployees(String str){
        this.employees = str;
    }
    String getTeamlead(){
        return this.teamlead;
    }
    void setTeamlead(String str){
        this.teamlead = str;
    }
}

class CompanyMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = "", employees = "", teamlead = "";
        System.out.println("Enter the company name:");
        name = sc.nextLine();
        System.out.println("Enter the employees:");
        employees = sc.nextLine();
        System.out.println("Enter TeamLead:");
        teamlead = sc.nextLine();

        int flag = 0;
        for(String str: employees.split(",")){
            if(teamlead.equals(str)){
                flag = 1;
            }
        }

        if(flag == 0){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }


        Company abc = new Company();
        abc.setName(name);
        abc.setEmployees(employees);
        abc.setTeamlead(teamlead);

        
        System.out.println("Name: " + abc.getName());
        System.out.println("Employees: " + abc.getEmployees());
        System.out.println("TeamLead: " + abc.getTeamlead());

        sc.close();
    }
}
