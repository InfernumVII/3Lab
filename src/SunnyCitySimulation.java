import java.util.*;
//import java.util.concurrent.ThreadLocalRandom;

public class SunnyCitySimulation {
    public static void main(String[] args) {
        SunnyCity city = new SunnyCity();

        List<Book> books = Arrays.asList(
                new Book("Приключения", "Смехотворное приключение с загадочными героями."),
                new Book("Юмор", "Потрясающие комические моменты из жизни."),
                new Book("Смешные истории", "Как кто-то потерял свою шляпу, и это стало шуткой на весь город.")
        );

        List<Magazine> magazines = Arrays.asList(
                new Magazine("Веселый журнал", "Рисунок смешного зайца в шляпе."),
                new Magazine("Загадки", "Иллюстрация загадочного лабиринта."),
                new Magazine("Анекдоты", "Карикатура на известного актера.")
        );

        List<BoardGame> games = Arrays.asList(
                new BoardGame("Шахматы", "Игра для двоих, где важны стратегия и тактика."),
                new BoardGame("Шашки", "Классическая игра с простыми правилами."),
                new BoardGame("Домино", "Игра с костяшками, которая требует внимательности.")
        );

        List<Newspaper> newspapers = Arrays.asList(
                new Newspaper("Утренние новости", "Сенсация! Коротышки готовят большой концерт."),
                new Newspaper("Общественная жизнь", "В городе открыли новую библиотеку."),
                new Newspaper("Городские сплетни", "Неизвестный герой спас котенка с крыши.")
        );

        city.addResident(new BookReader("Коротышка Петя", books));
        city.addResident(new MagazineReader("Коротышка Вера", magazines));
        city.addResident(new NewspaperReader("Коротышка Маша", newspapers));
        city.addResident(new Diner("Коротышка Антон", "Сытный обед из картошки и мяса."));
        city.addResident(new GamePlayer("Коротышка Оля", games));
        city.changeTimeOfDay("Обед");
        city.startScenario(2000);
        city.clear();
        city.addResident(new Boy("Коротышка Коля", new Harmonica()));
        city.addResident(new Boy("Коротышка Иван", new Flute()));
        city.addResident(new Boy("Коротышка Олег", new Trumpet()));

        city.addResident(new Girl("Коротышка Катя", new Tambourine()));
        city.addResident(new Girl("Коротышка Лена", new Tambourine()));
        city.addResident(new Girl("Коротышка Анна", new Tambourine()));
        city.addResident(new Girl("Коротышка Аня", new Tambourine()));
        city.addResident(new BookReader("Коротышка Петя", books));
        city.addResident(new MagazineReader("Коротышка Вера", magazines));
        city.addResident(new BookReader("Коротышка Ваня", books));

        city.changeTimeOfDay("Вечер");

        city.startScenario(2000);
    }
}
