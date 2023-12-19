/**
 * You are given a 2D integer array logs where each logs[i] = [birthi, deathi]
 * indicates the birth and death years of the ith person.
 * 
 * The population of some year x is the number of people alive during that year.
 * The ith person is counted in year x's population if x is in the inclusive
 * range [birthi, deathi - 1]. Note that the person is not counted in the year
 * that they die.
 * 
 * Return the earliest year with the maximum population.
 */
public class Leet1854 {
    public static void main(String[] args) {
        int[][] arr = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        System.out.println(maximumPopulation(arr));
    }

    static int maximumPopulation(int[][] logs) {
        int count = 0;
        for (int i = 0; i < logs.length - 1; i++) {
            for (int j = 0; j < logs.length; j++) {
                if (logs[i][1] > logs[i + 1][0]) {
                    count = logs[i][0];
                }
            }
        }
        if (count == 0) {
            return logs[0][0];
        }
        return count;
    }
}
