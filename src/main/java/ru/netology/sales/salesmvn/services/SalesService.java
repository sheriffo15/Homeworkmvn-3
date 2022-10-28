
package ru.netology.sales.salesmvn.services;

public class SalesService {
    public long salesSum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;

    }

    public long salesAver(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int lowAver(long[] sales) {
        long averageSales = salesAver(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;

            }
        }
        return counter;

    }

    public int highAver(long[] sales) {
        long averageSales = salesAver(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;

            }
        }
        return counter;

    }

}
