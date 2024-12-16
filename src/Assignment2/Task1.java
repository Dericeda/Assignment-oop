package Assignment2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature ");
        int temperature = scanner.nextInt();
        if(temperature>=0){
            System.out.print("it’s warm outside");
        }else
            System.out.print("it’s cold outside");
        scanner.close();
    }}