import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        part1();
        part2Task3();
    }

    private static void part1() {
        System.out.println("Часть1. Домашнее задание 1/2:");

        final int CURR_YEAR = LocalDate.now().getYear();

        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 35;
        maxim.job = "бренд-менеджер";
        System.out.println("Привет! Меня зовут " + maxim.name
                + ". Я из города " + maxim.town
                + ". Я родился в " + (CURR_YEAR - maxim.yearOfBirth)
                + " году. Я работаю на должности " + maxim.job
                + ". Будем знакомы!");

        Human any = new Human();
        any.name = "Аня";
        any.town = "Москва";
        any.yearOfBirth = 29;
        any.job = "методист образовательных программ";
        System.out.println("Привет! Меня зовут " + any.name
                + ". Я из города " + any.town
                + ". Я родилась в " + (CURR_YEAR - any.yearOfBirth)
                + " году. Я работаю на должности " + any.job
                + ". Будем знакомы!");

        Human katy = new Human();
        katy.name = "Катя";
        katy.town = "Калининград";
        katy.yearOfBirth = 28;
        katy.job = "продакт-менеджер";
        System.out.println("Привет! Меня зовут " + katy.name
                + ". Я из города " + katy.town
                + ". Я родилась в " + (CURR_YEAR - katy.yearOfBirth)
                + " году. Я работаю на должности " + katy.job
                + ". Будем знакомы!");

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        artem.job = "директор по развитию бизнеса";
        System.out.println("Привет! Меня зовут " + artem.name
                + ". Я из города " + artem.town
                + ". Я родился в " + (CURR_YEAR - artem.yearOfBirth)
                + " году. Я работаю на должности " + artem.job
                + ". Будем знакомы!");
    }
    private static void part2Task3() {
        System.out.println("Часть1. Задание 3:");

       Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7f;
        ladaGranta.color = "желтый";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionCountry = "России";
        System.out.println("Бренд: "+ ladaGranta.brand
                + "; Модель: " + ladaGranta.model
                + "; Объем двигателя: " + ladaGranta.engineVolume
                + "; Цвет кузова: " + ladaGranta.color
                + "; Год производства: " + ladaGranta.productionYear
                + "; Страна сборки: " + ladaGranta.productionCountry);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3;
        audi.color = "черный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        System.out.println("Бренд: "+ audi.brand
                + "; Модель: " + audi.model
                + "; Объем двигателя: " + audi.engineVolume
                + "; Цвет кузова: " + audi.color
                + "; Год производства: " + audi.productionYear
                + "; Страна сборки: " + audi.productionCountry);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3;
        bmw.color = "черный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        System.out.println("Бренд: "+ bmw.brand
                + "; Модель: " + bmw.model
                + "; Объем двигателя: " + bmw.engineVolume
                + "; Цвет кузова: " + bmw.color
                + "; Год производства: " + bmw.productionYear
                + "; Страна сборки: " + bmw.productionCountry);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.engineVolume = 2.4f;
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        System.out.println("Бренд: "+ kia.brand
                + "; Модель: " + kia.model
                + "; Объем двигателя: " + kia.engineVolume
                + "; Цвет кузова: " + kia.color
                + "; Год производства: " + kia.productionYear
                + "; Страна сборки: " + kia.productionCountry);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6f;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        System.out.println("Бренд: "+ hyundai.brand
                + "; Модель: " + hyundai.model
                + "; Объем двигателя: " + hyundai.engineVolume
                + "; Цвет кузова: " + hyundai.color
                + "; Год производства: " + hyundai.productionYear
                + "; Страна сборки: " + hyundai.productionCountry);
    }
}