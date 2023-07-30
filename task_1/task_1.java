// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
// необходимо повторно запросить у пользователя ввод данных.

import java.io.IOException;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        func();
    }

    static boolean flag = false;

    public static void func(){

        try {
            
            if (flag == false)
                System.out.print("Введите дробное число: ");                
            flag = true;

            Scanner sc = new Scanner(System.in);
            System.out.println(sc.nextDouble());
            System.out.println();
            flag = false;
            sc.close();
        }
        
        catch (Exception ex){
            System.out.print("Возникла ошибка при вводе. Пожалуйста введите число повторно: ");
            func();
        }

    }
}