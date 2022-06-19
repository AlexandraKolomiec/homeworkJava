//Написать программу возвращающую число, которое без остатка делится на сумму цифр этого числа
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.println("Введите число: ");
        int x= iScanner.nextInt();
        iScanner.close();

        int sum=0;
        
        while (x>0){
            sum=sum+x%10;
            x/=10;
            
        }
        System.out.println(sum);

        if (x%sum == 0){
            System.out.println(x%sum);
            System.out.println("число делится на сумму его цифр");
        }
        else{
            System.out.println("число не делится на сумму его цифр");
        }

    }
}

