package Assignment2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        while(i<=100){
            if(i%3 == 0){
                i++;
                continue;
            }else{
                sum+=i;
                i++;
            }
        }
        System.out.print(sum);

    }}