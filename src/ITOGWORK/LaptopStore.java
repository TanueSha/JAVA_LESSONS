package ITOGWORK;

import java.util.*;

public class LaptopStore {
    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<LAPTOP> laptops = new HashSet<>();
        laptops.add(new LAPTOP("Dell", 512, "Windows"));
        laptops.add(new LAPTOP("Apple", 256, "macOS"));
        laptops.add(new LAPTOP("HP", 1024, "Windows"));
        laptops.add(new LAPTOP("Asus", 512, "Linux"));

        // Вызов метода для фильтрации ноутбуков
        filterLaptops(laptops);
    }

    // Метод для фильтрации ноутбуков
    public static void filterLaptops(Set<LAPTOP> laptops) {
        Scanner scanner = new Scanner(System.in);

        // Map для хранения критериев фильтрации
        Map<String, Object> filters = new HashMap<>();

        // Запрос критериев у пользователя
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - Объем ЖД");
        System.out.println("2 - Операционная система");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Переход на новую строку

        if (choice == 1) {
            System.out.println("Введите минимальный объем ЖД (в ГБ):");
            int minHdd = scanner.nextInt();
            filters.put("hdd", minHdd);
        } else if (choice == 2) {
            System.out.println("Введите операционную систему:");
            String os = scanner.nextLine();
            filters.put("os", os);
        }

        // Фильтрация ноутбуков
        for (LAPTOP laptop : laptops) {
            boolean matches = true;

            // Фильтрация по объему ЖД
            if (filters.containsKey("hdd")) {
                int minHdd = (int) filters.get("hdd");
                if (laptop.hdd < minHdd) {
                    matches = false;
                }
            }

            // Фильтрация по ОС
            if (filters.containsKey("os")) {
                String os = (String) filters.get("os");
                if (!laptop.os.equalsIgnoreCase(os)) {
                    matches = false;
                }
            }

            // Вывод подходящих ноутбуков
            if (matches) {
                System.out.println(laptop);
            }
        }
    }
}
