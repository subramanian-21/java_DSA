package zoho.recursion;

import java.util.ArrayList;
import java.util.List;

public class RestoreIp {
    public static void main(String[] args) {
        System.out.println(restoreIPAddresses("25525511135"));
    }

    static List<String> restoreIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIP(s, 0, 0, "", result);
        return result;
    }

    static void restoreIP(String s, int start, int dots, String currentIP, List<String> result) {
        // Base case: if we have placed 3 dots and we are at the end of the string
        if (dots == 3 && start < s.length() && isValidSegment(s.substring(start))) {
            result.add(currentIP + s.substring(start));
            return;
        }

        // Place dots in valid positions
        for (int i = 1; i <= 3 && start + i <= s.length(); i++) {
            String segment = s.substring(start, start + i);
            if (isValidSegment(segment)) {
                restoreIP(s, start + i, dots + 1, currentIP + segment + ".", result);
            }
        }
    }

    static boolean isValidSegment(String segment) {
        // Check if the segment is valid
        if (segment.length() > 3 || segment.isEmpty() || (segment.length() > 1 && segment.charAt(0) == '0')) {
            return false;
        }
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}