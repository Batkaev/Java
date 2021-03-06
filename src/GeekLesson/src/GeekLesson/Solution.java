package GeekLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(PlusMinus());

    }
    public static int PlusMinus() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if(i<0){
            System.out.println("Число отрицательное");
        }
        else{
            System.out.println("Писло положительное");
        }
        return i ;
    }
}
