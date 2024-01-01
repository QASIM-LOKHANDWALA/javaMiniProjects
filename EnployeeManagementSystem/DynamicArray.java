package EnployeeManagementSystem;

import java.util.Scanner;

public class DynamicArray {
    Scanner sc = new Scanner(System.in);

    int size;
    int capacity = 10;
    Employee[] array;
    DynamicArray(int capacity){
        this.capacity = capacity;
        array = new Employee[capacity];
    }
    DynamicArray(){
        array = new Employee[capacity];
    }

    public void add(Employee e){
        if(size>=capacity){
            grow();
        }
        array[size++] = e;
    }
    public void getData(int x){
        String name = array[x].name;
        String city = array[x].city;
        int id = array[x].id;
        System.out.println(name + "\t" + id + "\t" + city);

    }
    public int size(){
        return size;
    }
    public Employee getEmp(int n){
        return array[n];
    }
    public String getName(int n){
        return array[n].name;
    }
    public void getDetailedData(int x){
        String name = array[x].name;
        String city = array[x].city;
        int id = array[x].id;
        int exp = array[x].experience;
        int salary = array[x].salary;
        System.out.println(name + "\t" + id + "\t" + city + "\t" + salary + "\t" + exp);

    }
    public void grow(){
        Employee[] temp = new Employee[capacity*2];
        capacity *= 2;
        for(int i=0 ; i<array.length ; i++){
            temp[i] = array[i];
        }
        array = temp;
    } 
    public void remove(int n){
        Employee[] temp = new Employee[size];
        for(int i=0 ; i<size ; i++){
            if(array[i].id == n){
                continue;
            }
            temp[i] = array[i];
        }
        array = temp;
    }  
    public void sortAlphabetically(){
        for(int i=0 ; i<size ; i++){
            for(int j=1 ; j<size ; j++){
                if(array[j-1].name.toLowerCase().charAt(0) > array[j].name.toLowerCase().charAt(0)){
                    Employee temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    } 
}
