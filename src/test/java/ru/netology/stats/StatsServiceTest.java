//  Нужно найти:
//  1. amountSales      сумму всех продаж (180);
//  2. amountAverage    среднюю сумму продаж в месяц (15);
//  3. maxSales         номер месяца, в котором был пик продаж* (20 - 8мес);
//  4. minSales         номер месяца, в котором был минимум продаж* (7 - 9мес);
//  5. belowAverage    количество месяцев, в которых продажи были ниже среднего (см. п.2) (5);
//  6. aboveAverage    количество месяцев, в которых продажи были выше среднего (см. п.2) (5);
//  *. нужно найти последний месяц, соответствующий условиям.
//  [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]

package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void amountSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountSales = 180;
        int actualAmountSales = service.amountSales(sales);
        Assertions.assertEquals(expectedAmountSales, actualAmountSales);
    }

    @Test
    public void amountAverage() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmountAverage = 15;
        int actualAmountAverage = service.amountAverage(sales);
        Assertions.assertEquals(expectedAmountAverage, actualAmountAverage);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverage(sales);
        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
