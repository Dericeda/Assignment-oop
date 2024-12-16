package Assignment2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("Enter")){
                break;
            }else{
                sum+=Integer.parseInt(userInput);
            }
        }
        System.out.print(sum);
    }}