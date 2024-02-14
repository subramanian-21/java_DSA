package oops.staticvar;

public class StaticVariables {

    public static void main(String[] args) {
        Human h1 = new Human(10, "sub");
        Human h2 = new Human(20, "ram");
        Human h3 = new Human(30, "man");
        Human h4 = new Human(20, null);
        // System.out.println(Human.population);
        // printAll(h1,h2,h3,h4);
        // StaticVariables obj =new StaticVariables();

        // obj.printAll(h1, h2, h3, h4);

        System.out.println(h2);
        

    }
   

    void printAll(Human h1,Human h2,Human h3,Human h4){
        System.out.println(h1.name +" "+h1.age);
        System.out.println(h2.name +" "+h2.age);
        System.out.println(h3.name +" "+h3.age);
        System.out.println(h4.name +" "+h4.age);
        print();

    }
    void print(){
        System.out.println("hello");
    }
    
}
class Human {
    int age;
    String name;
    static int population;

    @Override
    public String toString(){
        return this.name+ " "+this.age+" "+Human.population;
    }
    Human(int age, String name) {
        this.age = age;

        this.name = name;

        Human.population += 1;
    }
}

