package strings.KarpRabin;

import java.lang.foreign.MemoryLayout;

public class KarpRabin {
    private static final int PRIME = 43;
    private int patternLength;
    private double calculateHash(String str){
        double hash = 0;
        for(int i = 0;i<str.length();i++){
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }
    private double updateHash(double prevHash,char prevChar,char newChar){
        double hash = (prevHash - prevChar)/PRIME;
        hash += newChar * Math.pow(PRIME, patternLength-1);
        return hash;
    }
    public  int search(String str,String pattern){
        this.patternLength = pattern.length();
        double patternHash = calculateHash(pattern.substring(0,patternLength));
        double stringHash = calculateHash(str.substring(0,patternLength));

        for(int i = 0;i<str.length() - patternLength;i++){
            if(patternHash == stringHash){
                return i;
            }
            stringHash = updateHash(stringHash, str.charAt(i), str.charAt(i+patternLength));
        }

        return -1;
    }

}
