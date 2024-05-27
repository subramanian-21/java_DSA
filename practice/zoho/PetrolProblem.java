package zoho;

public class PetrolProblem {
    public static void main(String[] args) {
        int[] bunks = {1, 5, 3};
        int[] amt = {6, 4, 2};

        System.out.println(calculatePetrol(2, bunks, amt));
    }
    static int calculatePetrol(int p,int[] bunks,int[] amt){
        int petrol = p;
        int n = bunks.length;
        for (int i = 0; i < n; i++) {
            petrol -= bunks[i];
            petrol += amt[i];
        }
        return petrol;
    }
}
