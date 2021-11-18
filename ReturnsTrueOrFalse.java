import java.util.Scanner;

public class  ReturnsTrueOrFalse {

    public static boolean  evenCheck(int number){
        if(number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        System.out.println(evenCheck(number));
    }
}