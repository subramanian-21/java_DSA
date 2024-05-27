package zoho.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    public static void main(String[] args) throws IOException {
        fw();
    }
    static void isr(){
        try (InputStreamReader is = new InputStreamReader(System.in)){
            int letters = is.read();
            while (is.ready()) {
                System.out.print((char)letters);
                letters = is.read();
            }
            is.close();
        } catch (Exception e) {
        }
    }
    static  void fr(){
        
        try(BufferedReader br = new BufferedReader(new FileReader("hi.txt"))) {
            int c = 1;
            String re =br.readLine();
            while (re!=null) { 
                System.out.println(c+":"+re);
                re = br.readLine();
                c++;
            }
            if(c == 1){
                System.out.println("nothing to read");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static  void fw() throws  IOException{
        BufferedReader br=  new BufferedReader(new FileReader("hi.txt"));
        String line = br.readLine(); 
        String full = "";
        while (line != null) {
            full+=line+"\n";
            line = br.readLine();
        }
        try(FileWriter fw = new FileWriter("hi.txt",true)) {
            
            fw.write("HI this is the new line added");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
