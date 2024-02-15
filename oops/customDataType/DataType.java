package oops.customDataType;

import oops.principles.polymorphism.Circle;

public class DataType extends Circle{

    public static void main(String[] args) {
        Student s1 = new Student(10, "subramanian", 100);
        s1.printAttr();

        DataType c = new DataType();
        System.out.println(c.c);

    }   
}
class Student {
    int roll;
    String name;
    int marks;

    void printAttr(){
        System.out.println(roll+" "+name+" "+marks);
    }
    Student(int roll, String name,int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
