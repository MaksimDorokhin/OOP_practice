/*
Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения
А так же реализовать следующие классы-наследники:
1. Продукты питания, содержащие следующие свойства:
1.1 Срок годности
2. Напитки, содержащие следующие свойства:
2.1 Объём
3. Предметы гигиены, содержащие следующие свойства:
3.1 Количество штук в упаковке
4. Детские товары:
4.1 Минимальный возраст
4.2 Гипоаллергенность,
А так же реализовать слеюущие классы, наследуемые от приведённых выше классов(надеюсь сами разберётесь от каких именно):
5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности
6. Лимонад
7. Хлеб, содержащий следующие свойство:
7.1 Тип муки
8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке
9. Маски
10. Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв
11. Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип
12. Соска
У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы,
принемающие все поля.
Реализовать в классе Program, метод выводящий все данные о товаре.
Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program
 */

package Homeworks.S1Hw1.src;

import java.util.ArrayList;

public class Program {

    public static void printProductList(ArrayList<Goods> productList) {
        int count = 1;
        for (Goods product: productList) {
            System.out.printf("%d. Информация о продукте %s\n", count, product.name);
            System.out.println(product);
            count+=1;
        }
    }

    public static void main(String[] args) {

        Goods good = new Goods();
        Foods caesar = new Foods("Пельмени 'Цезарь'", 600.0, 1, "шт",
                "25.10.2023");
        Drinks colaChernogolovka = new Drinks("Кола 'Черноголовка'", 100.00,
                1, "шт", "2 л.");
        Hygiene wipes = new Hygiene("Салфетки 'Лента'", 50.5, 1,
                "шт", 50);
        KidsGoods pony = new KidsGoods("Игрушка мягкая Пони", 550.50, 1, "шт",
                3, "Да");
        Milk domikVDerevne = new Milk("Молоко 'Домик в деревне'", 110.50,
                1, "шт", "1 л.", "3.2%", "25.12.2022");
        Lemonade lemonadeChernogolovka = new Lemonade("Лимонад 'Черноголовка'",
                99.99, 1, "шт", "2 л.");
        Bread kolomenskiy = new Bread("Хлеб тостовый Коломенский", 64.32, 1, "шт",
                "30.09.2022", "высший сорт");
        Eggs okskoe = new Eggs("Яйцо Окское СО", 119.0, 1, "шт",
                "15.10.2022", 10);
        Masks masks = new Masks("Маски одноразовые", 100.5, 1,
                "шт", 50);
        ToiletPaper tpLenta = new ToiletPaper("Туалетная бумага 'Лента'", 112.5, 1,
                "шт", 4, 3);
        Diapers pampers = new Diapers("Подгузники 'Pampers'", 1540.0, 1,
                "шт", 56, 5, 5, 10, "soft");
        Pacifier pacifier = new Pacifier("Соска детская", 530.5, 1,
                "шт", 1);
        ArrayList<Goods> productList= new ArrayList<>();
        productList.add(good);
        productList.add(caesar);
        productList.add(colaChernogolovka);
        productList.add(wipes);
        productList.add(pony);
        productList.add(domikVDerevne);
        productList.add(lemonadeChernogolovka);
        productList.add(kolomenskiy);
        productList.add(okskoe);
        productList.add(masks);
        productList.add(tpLenta);
        productList.add(pampers);
        productList.add(pacifier);

        printProductList(productList);
    }
}
