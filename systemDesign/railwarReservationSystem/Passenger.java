package systemDesign.railwarReservationSystem;

public class Passenger {
    static int count = 1;

    String name;
    int age;
    String status;
    String id;
    Passenger(String name,int age){

        this.name = name;
        this.age = age;
        
        this.status = "";
        this.id = "";
    }
}
