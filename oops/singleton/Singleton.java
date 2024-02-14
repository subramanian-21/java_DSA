package oops.singleton;

public class Singleton {
    public static void main(String[] args) {
        Students s = Students.getInstance(1, "John", 90);
        Students s1 = Students.getInstance(2, "kohn", 80);
        s1.printAttr();
    }
}