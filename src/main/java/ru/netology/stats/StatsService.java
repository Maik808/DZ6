package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        //считаем сумму
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int averageSum(int[] purchases) {
        //считаем среднюю сумму
        int sum = 0;
        int counter = 0;
        for (int purchase : purchases) {
            counter += 1;
            sum += purchase;
        }
        int average = sum / counter;
        return average;
    }

    public int findMax(int[] purchases) {
        //Номер месяца, в котором был пик продаж
        int currentMax = purchases[0];
        int counter = 0;
        int maxMounts = 0;
        for (int purchase : purchases) {
            counter += 1;

            if (currentMax < purchase) {
                currentMax = purchase;
                maxMounts = counter;
            }
        }
        return maxMounts;
    }

    public int findMin(int[] purchases) {
        //Номер месяца, в котором был минимум продаж
        int currentMin = purchases[0];
        int counter = 0;
        int minMounts = 0;
        for (int purchase : purchases) {
            counter += 1;
            if (currentMin > purchase) {
                currentMin = purchase;
                minMounts = counter;
            }
        }
        return minMounts;
    }

    public int belowAverage(int[] purchases) {
        //Кол - во месяцев, в которых продажи были ниже среднего
        int average = averageSum(purchases);
        int counter = 0;
        for (int purchase : purchases) {
            if (average > purchase) {
                counter += 1;
            }
        }
        return counter;
    }

    public int higherAverage(int[] purchases) {
        //Кол - во месяцев, в которых продажи были выше среднего
        int average = averageSum(purchases);
        int counter = 0;
        for (int purchase : purchases) {
            if (average < purchase) {
                counter += 1;
            }
        }
        return counter;
    }
}
