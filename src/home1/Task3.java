package home1;

public class Task3 {
    public static void main(String[] args) {

        int result = sumDigits( 123); // Вызов метода
        System.out.println(result);  // Вывод результата

    }
    public static int sumDigits( int n){

        String str = String.valueOf(n);
        String[] split = str.split("");  // делаю из строки массив ['1', '2', '3']
        int x = 0;
        for (String digit : split) {  // Итерация по массиву foreach
            x += Integer.parseInt(digit);  // Преобразование в int и суммирование



        }
        return x; // Возврат суммы цифр

    }
}
