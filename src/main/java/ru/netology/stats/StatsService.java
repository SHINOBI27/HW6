package ru.netology.stats;
//[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]
public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long middle(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int bellowMiddle(long[] sales) {
        long middle = middle(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < middle) {
                amount = amount + 1;
            }
        }
        return amount;
    }

    public int aboveMiddle(long[] sales) {
        long middle = middle(sales);
        int amount = 0;
        for (long sale : sales) {
            if (sale < middle) {
                amount = amount + 1;
            }
        }
        return amount;
    }
}
