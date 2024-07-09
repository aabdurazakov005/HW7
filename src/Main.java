public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        double accumulation = 15000;
        double total = 0;
        double i = 0;
        while (total <= 2_459_000) {
            total = total + accumulation;
            i++;
            total = total + total/100;
            System.out.println("Месяц " + i + ", сумма накомлений равна " + total + " рублей.");
        }
        System.out.println("");

        System.out.println("Task 2");
        int i1 = 1;
        while (i1 <= 10) {
            System.out.print(" " + i1);
            i1++;
        }
        System.out.println();
        for (int i2 = 10; i2 >= 1; i2--) {
            System.out.print(" " + i2);
        }
        System.out.println();
        System.out.println();

        System.out.println("Task 3");
        int population = 12_000_000;
        for (int y = 1; y <= 10; y++) {
            int birthRate = 17 * population / 1000;
            int deathRate = 8 * population / 1000;
            population = population + birthRate - deathRate;
            System.out.println("Год " + y + ", численность населения составляет " + population);
        }
        System.out.println("");

        System.out.println("Task 4");
        int target = 12000000;
        int month = 0;
        int deposit = 15000;
        int sum = 0;
        while (sum < target) {
            sum = sum + sum / 100 * 7;
            sum = sum + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + sum + " рублей.");
        }
        System.out.println();

        System.out.println("Task 5");
        int target1 = 12000000;
        int month1 = 0;
        int deposit1 = 15000;
        int sum1 = 0;
        while (sum1 < target1) {
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений " + sum1 + " рублей.");
            }
            month1++;
            sum1 = sum1 + sum1 / 100 * 7;
            sum1 = sum1 + deposit1;
        }
        System.out.println();

        System.out.println("Task 6");
        int deposit2 = 15000;
        int years = 9;
        int allMonth = years * 12;
        for (int j = 0; j <= allMonth; j++) {
            deposit2 = deposit2 + deposit2 / 100 * 7;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений " + deposit2 + " рублей.");
                System.out.println();
            }
        }
        System.out.println("Task 7");
        int data = 0;
        for (int friday = 1; friday < 31; friday += 7) {
            friday = friday+data;
            System.out.println("Сегодня пятница " + friday + " необходимо подготовить отчет");
            System.out.println();
        }
        System.out.println("Task 8");
        int currentYear = 2023;
        for (int k = 0; k < currentYear + 100; k += 79) {
            if (k > currentYear - 200) {
                System.out.println(k);
            }
        }
    }
}