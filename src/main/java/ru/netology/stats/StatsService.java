package ru.netology.stats;

import java.util.stream.LongStream;

public class StatsService {


    /**
     * Рассчитывает сумму всех продаж за все месяцы
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает сумму всех продаж
     */
    public long sumSales(long[] sales) {
        return LongStream.of(sales).sum();
    }


    /**
     * Рассчитывает среднюю сумму продаж в месяц
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает среднюю сумму продаж в месяц
     */
    public long averageSales(long[] sales) {
        return LongStream.of(sales).sum() / sales.length;
    }


    /**
     * Рассчитывает месяц, в котором был пик продаж
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает номер месяца, в котором был пик продаж
     */
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    /**
     * Рассчитывает месяц, в котором был минимум продаж
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает номер месяца, в котором был минимум продаж
     */
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    /**
     * Рассчитывает кол-во месяцев, в которых продажи были ниже среднего
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает кол-во месяцев, в которых продажи были ниже среднего
     */
    public int belowAverageSales(long[] sales) {
        long averageSales = LongStream.of(sales).sum() / sales.length;
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Рассчитывает кол-во месяцев, в которых продажи были выше среднего
     *
     * @param sales - продажи за каждый месяц
     * @return - возвращает кол-во месяцев, в которых продажи были выше среднего
     */
    public int aboveAverageSales(long[] sales) {
        long averageSales = LongStream.of(sales).sum() / sales.length;
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}
