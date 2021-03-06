package GeekLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusMinus2 {
    public static void main(String[] args) throws IOException {
        System.out.println(PlusIliMinus());

    }
    public static boolean PlusIliMinus() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if(i<0){
            return true;
        }
        else {

        return false;}
    }
}
