package oops.singleton;

public class Students {
        int roll;
        String name;
        int marks;
    
        void printAttr(){
            System.out.println(roll+" "+name+" "+marks);
        }
        private Students(int roll, String name,int marks){
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        private static Students instance;
        public static Students getInstance(int roll, String name,int marks){
            if (instance == null) {
                instance = new Students(roll, name, marks);
            }
            return instance;
        }
}
