package ru.netology.stats;

public class main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sum = service.calculateSum(purchases);
        System.out.println("Сумма всех продаж: " + sum + " руб.;");

        int average = service.averageSum(purchases);
        System.out.println("Средняя сумма продаж в месяц: " + average + " руб.;");

        int monthMax = service.findMax(purchases);
        System.out.println("Первый месяц в году с максимальными продажами: " + monthMax + ";");

        int monthMin = service.findMin(purchases);
        System.out.println("Первый месяц в году с минимальными продажами: " + monthMin + ";");

        int countOverAverage = service.higherAverage(purchases);
        System.out.println("Количество месяцев с продажами выше среднего: " + countOverAverage + ";");

        int countUnderAverage = service.belowAverage(purchases);
        System.out.println("Количество месяцев с продажами ниже среднего: " + countUnderAverage + ";");
    }
}
