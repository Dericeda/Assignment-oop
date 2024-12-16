package Assignment2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int i = 0;
        while(i<firstNum){
            int j = 0;
            while(j<secondNum){
                System.out.print('Q');
                j++;
            }
            System.out.println();
            i++;
        }
    }}