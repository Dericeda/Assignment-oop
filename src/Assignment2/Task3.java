package Assignment2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        boolean isHigh;
        boolean isLow;
        isHigh = temperature>=38;
        isLow = temperature<=35;
        if(isHigh){
            System.out.print("High temperature");
        } else if (isLow) {
            System.out.print("Low temperature");
        }else System.out.print("normal temperature");
        scanner.close();
    }}