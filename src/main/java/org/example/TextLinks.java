package org.example;

public enum TextLinks {
    ADDRESS("https://alfa812.ru/"),
    CABINET("//*[@id=\"adapt-hdr\"]/div[2]/a[2]/span"), // поле Кабинет
    LOGINFIELD("//*[@id=\"content\"]/form/input[1]"),  // поле ввода логина
    PASSWORDFIELD("//*[@id=\"content\"]/form/input[2]"),  //поле ввода пароля
    ENTERACCOUNT("//*[@id=\"content\"]/form/input[3]"),  //поле входа
    SEARCHFIELD("//*[@id=\"search\"]/form/input[2]"),  //поле поиска
    BUTTONSEARCH("//*[@id=\"search\"]/form/input[1]"),  //поле кнопки поска
    ADDITEM("//*[@id=\"content\"]/div/div[2]/form/div/div[1]/span[1]/input"),  //поле добавить кол-во
    SIZE("//*[@id=\"content\"]/div/div[2]/form/div/select"),  //поле выбра размера
    CLICKBAY("//*[@id=\"content\"]/div/div[2]/form/div/input"),  //поле добавить в корзину
    CLOSEWINDOW("//*[@id=\"fancybox-close\"]"),  //закрыть всплывающее окно
    PRICE("#content > div > div.description > form > div > div.price > span.price"),  // поле цены
    FIELDCART("//*[@id=\"cart_informer\"]"),  // поле открыть корзину.
    OPENFILEPATH("Desktop"),  //открываем папку по умолчанию
    SAVEFILEPATH("Downloads"),  //сохраняем папку по умолчанию
    COUNROWSCSV("количество товаров в csv: "),
    SHEET("Sheet1"),  // имя страницы в отчете
    NOARTICUL("Проверить эти товары"),
    FILENAMESAVE("Alfa-812_Report"),  //имя файла с ненайденными артикулами
    AUTHORIZATION("Documents\\AuthorizationAlfa.txt"), //имя файла для хранения логина и пароля
    TEXTSAVEFILE("Файл куда сохраняем ненайденные артикулы"),
    TEXTFILEOPEN("Файл исходник:"),
    CSV("csv");

    private final String string;

    TextLinks(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
