import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
//        task1();
//        task2();
//        cycle();
        task6();

    }

    public static void task1(){
        // вывести в консоль Hello world!
        System.out.println("Hello world!");

//  вывести текущую дату и время
//        LocalTime now = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd:MM:yyyy г., Время: HH:mm:ss сек");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd:MMMM:yyyy г., Время: HH:mm:ss сек");
        System.out.println(formatter.format(LocalDateTime.now()));
//        System.out.println(LocalDateTime.now());    анонимный вызов функции

    }

    public static void cycle(){
        while (true) {
            task2();
        }

    }
    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как Вас зовут? ");
        String name = sc.next();
        if (name.startsWith("q")) System.exit(0);

        if (name.startsWith("Т")) {
            System.out.println("Рада тебя " + name + " видеть!");

//            else if(name.startsWith("T")){
//                System.out.println("hi");
//            }
        } else {
            System.out.println("Приятно познакомиться" + name + "!");
        }
    }
//вернуть строку в обратном порядке
    public static String task6() {
            String s = "Добро пожаловать на курс по Java";
            String[] split = s.split("\\s ");

            for (int i = split.length - 1; i >= 0; i--) {
                System.out.print(split[i] + " ");

            }
            return null;
        }



//        System.out.println("Привет " + name + "!");


    }







