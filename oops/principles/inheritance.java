package oops.principles;

public class inheritance {
    

    public static void main(String[] args) {
        child c= new child(40,50,60);
        System.out.println(c.a+" "+c.b+" "+c.c);
    }
}
class parent {
 int  a  = 10;
 int b = 20;
 void hello(){
    System.out.println("hello");
 }

 parent(int a,int b){
    this.a = a;
    this.b = b;
 }
    
}
class child extends parent {

    child(int a,int b,int c){
        super(a,b);
        this.c = c;
    }
    int c = 30;
}
