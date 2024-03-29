package org.example.command;

import org.example.browser.*;
import org.example.csvRead.CsvFilter;
import org.example.csvRead.csv.StructureCSV;
import org.example.oldExel.WrightOldExelArticul;
import org.example.searchAndAdd.SearchAndAdd;

import java.util.ArrayList;
import java.util.List;

public class Command {
    private List<String[]> reportList;

    public Command(String pathCSV) throws Exception {
        long start = System.nanoTime();

        reportList = new ArrayList<>();

        // Read csv
        int cellPrice = 2;  // Cell with price to order
        int cellItem = 3;   // Cell with item to order
        CsvFilter csvFilter = new CsvFilter(pathCSV);
        List<StructureCSV> data = csvFilter.csvFilter(cellPrice, cellItem);
        reportList.addAll(csvFilter.getError());

        // Open website
        new OpenWebSite();

        new ClowdWindow();

        // login account
        new LoginPage();

        new ClowdWindow();

        for (StructureCSV goods : data) {
            String goodsName = goods.getName();
            try {
                SearchAndAdd searchAndAdd = new SearchAndAdd(reportList);
                searchAndAdd.executeProcess(goods);
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
                String[] noAdd = {goodsName, "Какая-то общая ошибка"};
                reportList.add(noAdd);
            }
        }

        // по завершению заходим в корзину
        new ClowdWindow();
        ShoppingCart shoppingCart2 = new ShoppingCart();
        shoppingCart2.clickCart();
        shoppingCart2.countGoodsInCart();

        /*
        При закрытии браузера список покупок не сохраняется.
        driver.close();
         */

        new WrightOldExelArticul(reportList);

        long end = System.nanoTime();
        long a = end - start;
        long time = a / 1000000000;

        System.out.println();
        System.out.println("_________У С П Е Ш Н О________");
        System.out.println();
        System.out.println("Время выполнения: " + time / 60 + "мин " + time % 60 + "сек");
        System.out.println("_________Оля молодец_________");
        System.out.println();
        System.out.println("_________Попей чайку_________");
        System.out.println();
    }

}
