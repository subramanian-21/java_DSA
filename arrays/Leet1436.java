import java.util.ArrayList;
import java.util.List;

/**
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there
 * exists a direct path going from cityAi to cityBi. Return the destination
 * city, that is, the city without any path outgoing to another city.
 * 
 * It is guaranteed that the graph of paths forms a line without any loop,
 * therefore, there will be exactly one destination city.
 */
public class Leet1436 {
    public static void main(String[] args) {
        List<List<String>> arr = new ArrayList<>();

        arr.add(List.of("London", "New York"));
        arr.add(List.of("New York", "Lima"));
        arr.add(List.of("Lima", "Sao Paulo"));

        System.out.println(destCity(arr));
    }

    static String destCity(List<List<String>> paths) {

        String[] start = new String[paths.size()];
        String[] end = new String[paths.size()];
        for (int i = 0; i < paths.size(); i++) {
            start[i] = paths.get(i).get(0);
            end[i] = paths.get(i).get(1);
        }
        String str = end[0];
        for (int j = 0; j < end.length; j++) {
            for (int i = 0; i < end.length; i++) {
                if (str.equals(start[i])) {
                str = end[i];
            }
            }
            
        }
       
        return str;
    }
}
