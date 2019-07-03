package technics;

public class Main {

    /*
    1. Создать 3 класса:
    1) Смартфон
    -- Наличие клавиатуры
    -- Поддерживаемая сеть
    2) Ноутбук
    -- Подсветка (цвет)
    -- Тачпад
    3) ПК
    -- Кол-во мониторов
    -- Внешнее охлаждение ( есть/нет)

    2. Придумать каждому из них по 2 отличных поля и 3 одинаковых
    (числа + строки)
    1) Цена
    2) Название
    3) Производительность (benchmark)



    3. Объединить все эти классы одним интерфейсом, для реализации через него.
    -- В интерфейсе будет 2 метода: первый выведет всю инф-цию о экземпляре, второй выведет только различающиеся
     признаки каждого класса.

    Вот и всё, ребята.
     */


    public static void main(String[] args) {

        Computer[] array = new Computer[4];

        array[0] = new Desktop(5, 200, "Aaaa", 5, true);
        array[1] = new Smartphone(1, 20, "Baaa", false, "LTE");
        array[2] = new Smartphone(2, 22, "AFaa", true, "2G");
        array[3] = new Laptop(200, 2020, "OOOaa", "BLACK", true);


        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i].getAllInformation());
            } else {
                System.out.println(array[i].getDifferences());
            }
        }
    }
}
