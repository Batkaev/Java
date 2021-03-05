package GeekLesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VysokosniyGod {
    public static void main(String[] args) throws IOException {
        VisGod();

    }
    public static void VisGod() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int god = Integer.parseInt(reader.readLine());
        if(god%400==0){
            System.out.println("Високосный");
        }
        else if (god%100==0){
            System.out.println("Невисокосный");
        }
        else if(god%4==0){
            System.out.println("Високосный");
        }
        else{
            System.out.println("Невисокосный");
        }

    }
}
