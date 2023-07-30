// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.io.IOException;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        if(str.length() == 0)
            throw new RuntimeException("Пустая строка");
        else
            System.out.println(str);
        
        sc.close();
    }
}