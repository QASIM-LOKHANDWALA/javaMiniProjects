package EnployeeManagementSystem;

import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);

    final static String USERNAME = "BOSS";
    final static String PASSWORD = "CLASSIFIED";

    int trial = 1;
    int id;
    String name;
    String city;
    int salary;
    int experience;
    static DynamicArray emp = new DynamicArray();
    Employee(int id,String name,String city,int salary,int experience){
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.experience = experience;
    }
    Employee(){}

    public void setData(int id,String name,String city,int salary,int experience){
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
        this.experience = experience;
    }
    public void showData(){
        System.out.println("NAME\tID\tCITY");
        for(int i=0 ; i<emp.size ; i++){
            emp.getData(i);
        }
    }
    public void getFullInfo(){
        trial = 0;
        String reply=null;
        if(trial > 1){
            System.out.print("Do you want to try again: ");
            reply = sc.next();
            if(reply.equals("no")){
                trial=0;
                return;
            }
        }
        
        trial++;
        System.out.print("Enter Username: ");
        String u = sc.next();
        System.out.print("Enter Password: ");
        String p = sc.next();
        if(u.equals(USERNAME) && p.equals(PASSWORD)){
            System.out.println("NAME\tID\tCITY\tSALARY\tEXPERIENCE");
            for(int i=0 ; i<emp.size ; i++){
                emp.getDetailedData(i);
            }
        }else{
            System.out.println("INCORRECT USERNAME OR PASSWORD.");
            getFullInfo();
        }
    }
    public void fill(int n){
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter name: ");
            String tname = sc.next();
            System.out.print("Enter id: ");
            int tid = sc.nextInt();
            System.out.print("Enter city: ");
            String tcity = sc.next();
            System.out.print("Enter salary: ");
            int tsalary = sc.nextInt();
            System.out.print("Enter experience: ");
            int texp = sc.nextInt();
            emp.add(new Employee(tid,tname,tcity,tsalary,texp));
            System.out.println();
        }
    }
    public void remove(int n){
        emp.remove(n);
    }
    public void sortAlphabetical(){
        emp.sortAlphabetically();
    }

}
