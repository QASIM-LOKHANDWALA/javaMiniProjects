package CollegeManagementSystem;
import java.util.*;

public class Main {
    public static void main(String[] args){
        college c = new college();
        if(c.login()){
            System.out.println("Successful Login");
            c.resetPassword();
            System.out.println("Successful Reset");
            Student[] arr = new Student[5];
            for(int i=0 ; i<5 ; i++){
                arr[i] = new Student();
            }
            c.enterMarks(arr);
            c.calculateSubjectTotal(arr);
            c.display();
        }else{
            System.out.println("Your account is locked for 1 hour");
        }
    }
}
class college{
    Scanner sc = new Scanner(System.in);
    String def_pass = "1234";
    String new_Pass = "";

    public boolean login(){
        int i=0;
        System.out.println("Welcome to online Result Portal");
        String check_pass = "";
        do{
            System.out.print("Enter your password: ");
            check_pass = sc.next();
            if(!check_pass.equals(def_pass)){
                System.out.println("Invalid password");
                i++;
            }else{
                return true;
            }
        }while(i<3);
        return false;
    }

    public void resetPassword(){
        String newPass = "";
        boolean flag = true;
        boolean check = true;
        while(flag){
            System.out.print("Enter new Password: ");
            newPass = sc.next();
            char[] ch = newPass.toCharArray();
            for(char x:ch){
                if(x>='a' || x>='A'){
                    System.out.println("Invalid combination");
                    check = false;
                    break;
                }else{
                    continue;
                }
            }
            if(check){
                break;
            }
        }
        return;
    }

    void enterMarks(Student[] arr){
        for(int i=0 ; i<arr.length ; i++){
            System.out.println("Enter marks of student "+i+" : ");
            for(int j=0 ; j<3; j++){
                do{
                    System.out.print("Subject " + j + " : ");
                    arr[i].marks[j] = sc.nextInt();
                }while(arr[i].marks[j]>25);
            }
        }
    }

    double[] total = {0,0,0};
    String subject[] = {"java","maths","physics"};
    int idx = 0;
    void calculateSubjectTotal(Student[] a){
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<5 ; j++){
                total[i] += a[j].marks[i];
            }
        }
        for(int i=0 ; i<3 ; i++){
            total[i] = (total[i]*100)/125;
        }
        double max = total[0];
        for(int i=0 ; i<total.length ; i++){
            if(total[i]>max){
                idx = i;
            }
        }
    }

    void display(){
        System.out.println("Maximun max are in "+subject[idx] + " with percentage " + total[idx]);
    }
}
class Student{
    int[] marks = new int[3];
}