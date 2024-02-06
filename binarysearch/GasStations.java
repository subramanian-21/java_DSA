package binarysearch;
public class GasStations {
    public static void main(String[] args) {
        System.out.println(MinimiseMaxDistance(new int[] {1, 2, 3, 4, 5}, 4));
    }
    public static double MinimiseMaxDistance(int []arr, int K){
        int[] inserPos = new int[arr.length -1];

        for(int i = 1; i<=K ;i++){
            double station = -1;
            int pos = -1;
            for (int j = 0; j < arr.length - 1; j++) {
                double diff = arr[j+1] - arr[j];
                double minLel = diff/(double)(inserPos[j]+1);
                if(minLel > station){
                    station = minLel;
                    pos = j;
                }
            }
            inserPos[pos]++;
        }
        double out = -1;
        for (int i = 0; i < inserPos.length; i++) {
            double diff = arr[i+1] - arr[i];
            double minLel = diff/(double)(inserPos[i]+1);
            out = Math.max(out, minLel);
        }
        return out;
    }
}
