import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        part1();
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
}