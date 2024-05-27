package zoho;

public class Family {
 
    public static void main(String[] args) {
        String[][] fam = { { "luke", "shaw" },
        { "wayne", "rooney" },
        { "rooney", "ronaldo" },
        { "shaw", "rooney" },
        { "shaw", "rooney" }
};
System.out.println(grandChild(fam, "ronaldo"));

    }
    static int grandChild(String[][] fam,String str){
        int sum = 0;
        String son = "";
        for (int i = 0; i < fam.length; i++) {
            if(fam[i][1].equals(str)){
                son = fam[i][0];
            }
        }
        for(int i = 0;i<fam.length;i++){
            if(fam[i][1].equals(son)){
                sum++;
            }
        }
        return sum;
    }
}
