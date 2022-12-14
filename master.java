import java.util.ArrayList;
import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        Laptop laptop = new Laptop("ASUS", "ROG Strix G15", 1080, 144, 8,
                "SSD", 512, 16, 4, 1100);
        laptops.add(laptop);
        laptop = new Laptop("Lenovo", "IdeaPad Gaming 3", 1080, 60, 6,
                "SSD", 512, 8, 4, 850);
        laptops.add(laptop);
        laptop = new Laptop("Lenovo", "Legion 5", 1080, 144, 8,
                "SSD", 512, 16, 6, 2100);
        laptops.add(laptop);
        laptop = new Laptop("Apple", "Macbook Air 13", 1600, 60, 8,
                "SSD", 256, 8, 0, 1000);
        laptops.add(laptop);
        laptop = new Laptop("HP", "250 G8", 768, 60, 2,
                "HDD", 500, 4, 0, 500);
        laptops.add(laptop);
        laptop = new Laptop("Acer", "Nitro 5", 1080, 144, 6,
                "HDD+SSD", 1256, 16, 4, 1200);
        laptops.add(laptop);
        laptop = new Laptop("Apple", "Macbook Pro 14", 1964, 120, 10,
                "SSD", 1024, 32, 0, 5000);
        laptops.add(laptop);
        laptop = new Laptop("Digma", "Eve 15", 1080, 60, 4,
                "SSD", 128, 4, 0, 300);
        laptops.add(laptop);

        while (true) {
            System.out.println("Для вывода всех доступных ноутбуков введите 1:");
            System.out.println("Для перехода к фильтрации введите 2:");
            System.out.println("Для выхода из программы введите 3:");
            Scanner scanner = new Scanner(System.in);
            String mode = scanner.nextLine();
            if (mode.equals("1")) {

                for (Laptop lap : laptops) {
                    System.out.println(lap);

                }
            }
            if (mode.equals("2")) {
                filtring(laptops);
            }
            if (mode.equals("3")) {
                break;
            } else {
                System.out.println("Проверьте правильность ввода");
            }

        }

    }

    public static void filtring(ArrayList<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);

        String brandFilter = "vawkfwef234";
        while (brandFilter == "vawkfwef234") {
            System.out.println("Для выбора марки введите следующее: ASUS-1, Lenovo-2, Apple-3, HP-4, Acer-5, Digma-6");
            System.out.println("Если хотите пропустить этот вопрос, введите 0:");
            String temp = scanner.nextLine();
            switch (temp) {
                case "0":
                    brandFilter = null;
                    break;
                case "1":
                    brandFilter = "ASUS";
                    break;
                case "2":
                    brandFilter = "Lenovo";
                    break;
                case "3":
                    brandFilter = "Apple";
                    break;
                case "4":
                    brandFilter = "HP";
                    break;
                case "5":
                    brandFilter = "Acer";
                    break;
                case "6":
                    brandFilter = "Digma";
                    break;

            }

        }
        int resolutionFilter = 12313131;
        while (resolutionFilter == 12313131) {
            System.out.println("Введите минимальное разрешение экрана (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                resolutionFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (resolutionFilter < 0) {
                resolutionFilter = 12313131;
                System.out.println("Разрешение не может быть отрицательным!");
            }
        }
        int frequencyFilter = 12313131;
        while (frequencyFilter == 12313131) {
            System.out.println(
                    "Введите минимальную частоту обновления экрана, Гц (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                frequencyFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (frequencyFilter < 0) {
                frequencyFilter = 12313131;
                System.out.println("Частота обновления не может быть отрицательной!");
            }
        }
        int coresAmmountFilter = 12313131;
        while (coresAmmountFilter == 12313131) {
            System.out
                    .println("Введите минимальное количество ядер процессора (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                coresAmmountFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (coresAmmountFilter < 0) {
                coresAmmountFilter = 12313131;
                System.out.println("количество ядер не может быть отрицательным!");
            }
        }
        String driveTypeFilter = "vawkfwef234";
        while (driveTypeFilter == "vawkfwef234") {
            System.out.println("Для выбора типа накопителя введите следующее: SSD -1, HDD -2, SSD+HDD -3");
            System.out.println("Если хотите пропустить этот вопрос, введите 0:");
            String temp = scanner.nextLine();
            switch (temp) {
                case "0":
                    driveTypeFilter = null;
                    break;
                case "1":
                    driveTypeFilter = "SSD";
                    break;
                case "2":
                    driveTypeFilter = "HDD";
                    break;
                case "3":
                    driveTypeFilter = "SSD+HDD";
                    break;

            }

        }
        int driveSizeFilter = 12313131;
        while (driveSizeFilter == 12313131) {
            System.out.println("Введите минимальный объем накопителя, ГБ (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                driveSizeFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (driveSizeFilter < 0) {
                driveSizeFilter = 12313131;
                System.out.println("Объем накопителя не может быть отрицательным!");
            }
        }

        int RamFilter = 12313131;
        while (RamFilter == 12313131) {
            System.out.println(
                    "Введите минимальный объем оперативной памяти, ГБ (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                RamFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (RamFilter < 0) {
                RamFilter = 12313131;
                System.out.println("Объем оперативной памяти не может быть отрицательным!");
            }
        }

        int videoMemoryFilter = 12313131;
        while (videoMemoryFilter == 12313131) {
            System.out.println("Введите минимальный объем видеопамяти, ГБ (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                videoMemoryFilter = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (videoMemoryFilter < 0) {
                videoMemoryFilter = 12313131;
                System.out.println("Объем видеопамяти не может быть отрицательным!");
            }
        }
        int maxPrice = 12313131;
        while (maxPrice == 12313131) {
            System.out.println("Введите максимальную стоимость ноутбука, $ (0-если желаете пропустить этот вопрос):");
            String temp = scanner.nextLine();
            try {
                maxPrice = Integer.parseInt(temp);

            } catch (Exception e) {
                System.out.println("Проверьте правильность ввода!");
            }
            if (maxPrice < 0) {
                maxPrice = 12313131;
                System.out.println("Цена не может быть отрицательной (к сожалению)!");
            }
        }
        System.out.println("По заданным критериям отобраны следующие модели:");
        for (Laptop lap : laptops) {
            if (brandFilter != null && !brandFilter.equals(lap.getBrand())) {
                continue;
            }
            if (resolutionFilter > lap.getResolution()) {
                continue;
            }
            if (frequencyFilter > lap.getFrequency()) {
                continue;
            }
            if (coresAmmountFilter > lap.getCoresAmmount()) {
                continue;
            }
            if (driveTypeFilter != null && !driveTypeFilter.equals(lap.getDriveType())) {
                continue;
            }
            if (driveSizeFilter > lap.getDriveSize()) {
                continue;
            }
            if (RamFilter > lap.getRAM()) {
                continue;
            }
            if (videoMemoryFilter > lap.getVideoMemory()) {
                continue;
            }
            if (maxPrice != 0 && maxPrice < lap.getPrice()) {
                continue;
            }
            System.out.println(lap);

        }

    }

}