import transport.Car;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human maxim = new Human("Максим", "Минск", currentYear - 35, "бренд-менеджера");
        Human ana = new Human("Анна", "Москва", currentYear - 29, "методиста образовательных программ");
        Human katy = new Human("Катя", "Калининград", currentYear - 28, "продакт-менеджера");
        Human artem = new Human("Артем", "Москва", currentYear - 27, "директора по развитию бизнеса");
        System.out.println(maxim);
        System.out.println(ana);
        System.out.println(katy);
        System.out.println(artem);

        Human volodimir = new Human("Владимир", "Казань", currentYear - 21, null);
        System.out.println(volodimir);
        System.out.println();

        Flower roza = new Flower("Роза обыкновенная", "Голландия", 35.59f, 0);
        Flower hrizantema = new Flower("Хризантема", null, 15f, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9f, 1);
        Flower gipsofila = new Flower("Гипсофила", "Турция", 19.5f, 10);
        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsofila);
        System.out.println();

        Car lada = new Car("Lada", "Grande", 1.7f, "желтый", 2015, "Россия",
                null, null, "ы123ва152", 4, true,
                2023, 50000.5f, "777777777");

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3f, "черный", 2020, "Германия",
                null, null, "К456ЛЛ052", 4, true,
                2023, 20000.5f, "ddddddddd");

        Car bmw = new Car("BMW", "Z8", 3f, "черный", 2021, "Германия",
                null, null, null, 5, true,
                2023, 10000.5f, "889999998");

        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4f, "красный", 2018, "Южная Корея",
                null, null, null, 5, false,
                2021, 30000.5f, "a12345678");

        Car hyundai = new Car("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея",
                null, null, null, 4, false,
                2023, 20000.5f, "777");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }


}
