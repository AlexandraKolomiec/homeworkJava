//Написать программу вычисления n-ого треугольного числа
// 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105,120 …
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner=new Scanner(System.in);
        System.out.println("Введите порядковый номер треугольного числа: ");
        int x= iScanner.nextInt();
        iScanner.close();
        
        int n=0;
       
        if ( x ==1){
            n=1;
            System.out.println(n); 
        } 
        else if (x>1){
            n=(x*(x+1))/2;
            System.out.println(n);
        }
        else {
            System.out.println("Введите значение больше 0");
        }
    }

}


