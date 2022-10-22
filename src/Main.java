import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        System.out.println("Домашнее задание 1:");

        final int CURR_YEAR = LocalDate.now().getYear();

        Human maxim = new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 35;
        System.out.println("Привет! Меня зовут " + maxim.name
                + ". Я из города " + maxim.town
                + ". Я родился в " + (CURR_YEAR - maxim.yearOfBirth)
                + " году. Будем знакомы!");

        Human any = new Human();
        any.name = "Аня";
        any.town = "Москва";
        any.yearOfBirth = 29;
        System.out.println("Привет! Меня зовут " + any.name
                + ". Я из города " + any.town
                + ". Я родилась в " + (CURR_YEAR - any.yearOfBirth)
                + " году. Будем знакомы!");

        Human katy = new Human();
        katy.name = "Катя";
        katy.town = "Калининград";
        katy.yearOfBirth = 28;
        System.out.println("Привет! Меня зовут " + katy.name
                + ". Я из города " + katy.town
                + ". Я родилась в " + (CURR_YEAR - katy.yearOfBirth)
                + " году. Будем знакомы!");

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        System.out.println("Привет! Меня зовут " + artem.name
                + ". Я из города " + artem.town
                + ". Я родился в " + (CURR_YEAR - artem.yearOfBirth)
                + " году. Будем знакомы!");
    }
}