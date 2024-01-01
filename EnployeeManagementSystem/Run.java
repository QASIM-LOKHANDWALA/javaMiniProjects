package EnployeeManagementSystem;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        Employee e1 = new Employee(101, "Qasim", "dhd", 123, 2);
        Employee e2 = new Employee(102, "shabbir", "dhd", 123, 0);
        Employee e3 = new Employee(103, "hussein", "dhd", 1233, 1);
        Employee e4 = new Employee(104, "zainab", "dhd", 123, 0);
        Employee.emp.add(e1);
        Employee.emp.add(e2);
        Employee.emp.add(e3);
        Employee.emp.add(e4);

        System.out.println("WELCOME TO THE EMPLOYEE MANAGEMENT SYSTEM:");
        int r=-1;
        do{
            menu();
            r = sc.nextInt();
            System.out.println();
            if(r==1){

                emp.showData();

            }else if(r==2){

                System.out.print("ENTER THE NUMBER OF EMPLOYEE YOU WANT TO ADD: ");
                int x = sc.nextInt();
                emp.fill(x);

            }else if(r==3){

                System.out.print("ENTER EMPLOYE ID: ");
                int x = sc.nextInt();
                System.out.println("OPERATION COMPLETED SUCCESSFULLY");
                emp.remove(x);

            }else if(r==4){

                emp.getFullInfo();

            }else if(r==5){

                emp.sortAlphabetical();
                emp.showData();

            }

        }while(r!=6);
        System.out.println("\nALL THE TASKS COMPLETED SUCCESSFULLY\n");

        sc.close();
    }
    static void menu(){
        System.out.println("\nENTER 1: TO VIEW EMPLOYEE LIST");
        System.out.println("ENTER 2: TO ADD EMPLOYEE ");
        System.out.println("ENTER 3: TO REMOVE EMPLOYEE ");
        System.out.println("ENTER 4: TO VIEW FULL EMPLOYEE DETAILS");
        System.out.println("ENTER 5: TO SORT EMPLOYEE LIST ALPHABETICALLY ");
        System.out.println("ENTER 6: TO EXIT");
        System.out.print("WHAT WOULD YOU LIKE TO DO? ");

    }
}
