package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    long[] sales = {8, 23, 13, 15, 17, 20, 19, 34, 7, 12, 14, 18};


    /**
     * Валидность расчета суммы продаж со всех месяцев
     */
    @Test
    void sumSales() {
        long expected = 200;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    /**
     * Валидность расчета средней суммы продаж в месяц
     */
    @Test
    void shouldAverageSales() {
        long expected = 16;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    /**
     * Валидность расчета пика продаж
     */
    @Test
    void shouldMaxSales() {
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }


    /**
     * Валидность расчета минимума продаж
     */
    @Test
    void shouldMinSales() {
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    /**
     * Валидность расчета кол-ва месяцев, в которых продажи были ниже среднего
     */
    @Test
    void shouldBelowAverageSales() {
        long expected = 6;
        long actual = service.belowAverageSales(sales);
        assertEquals(expected, actual);
    }

    /**
     * Валидность расчета кол-ва месяцев, в которых продажи были выше среднего
     */
    @Test
    void shouldAboveAverageSales() {
        long expected = 6;
        long actual = service.aboveAverageSales(sales);
        assertEquals(expected, actual);
    }
}