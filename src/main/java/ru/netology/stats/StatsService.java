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

import java.util.Arrays;

public class StatsService {
    public int amountSales(int[] sales) {       // amountSales - сумма продаж
        return Arrays.stream(sales).sum();
    }

    public int amountAverage(int[] sales) {     // amountAverage - средняя сумма
        return amountSales(sales) / sales.length;
    }

    public int minSales(int[] sales) {      // minSales - минимум продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {    // maxSales - пик продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int belowAverage(int[] sales) {     //belowAverage - кол-во месяцев ниже среднего
        int belAv = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountAverage(sales)) {
                belAv++;
            }
        }
        return belAv;
    }

    public int aboveAverage(int[] sales) {     //aboveAverage - кол-во месяцев выше среднего
        int aboAv = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountAverage(sales)) {
                aboAv++;
            }
        }
        return aboAv;
    }
}
