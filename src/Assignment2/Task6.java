package Assignment2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum+=number;
            }else if(scanner.hasNextLine()){
                String text = scanner.nextLine();
                if(text.equals("Enter")){
                    break;
                }
            }
        }
        System.out.print(sum);
        scanner.close();
    }}