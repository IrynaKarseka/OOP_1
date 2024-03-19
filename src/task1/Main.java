package task1;

import java.util.ArrayList;
import java.util.List;

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
// и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
// выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
// и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
// Формат сдачи: Ссылка на гитхаб-проект Подписать фамилию и номер группы
public class Main {
    public static void main(String[] args) {
//        BottleOfWater bottle1 = new BottleOfWater("Mineral", 20, 2000);
//        BottleOfWater bottle2 = new BottleOfWater("Mineral", 10, 1000);

        HotDrink cocoa = new HotDrink("Cocoa",15);
        HotDrink coffee = new HotDrink("Coffee",10, 200, 60);
        HotDrink tea = new HotDrink("Tea",5, 150, 65);

        List<Product> hotDrinkList = new ArrayList<Product>();
        hotDrinkList.add(cocoa);
        hotDrinkList.add(coffee);
        hotDrinkList.add(tea);

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(hotDrinkList);
        System.out.println(hotDrinkVendingMachine.getProduct("Cocoa"));
        System.out.println(hotDrinkVendingMachine.getProduct("Coffee"));
        System.out.println(hotDrinkVendingMachine.getProduct("Tea",150,65));
        System.out.println(hotDrinkVendingMachine.getProduct("Latte",150,65));
    }
}