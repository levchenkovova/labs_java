import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення бази даних про кіно
        CinemaDatabase database = new CinemaDatabase();

        // Створення акторів
        Actor actor1 = new Actor("Actor1");
        Actor actor2 = new Actor("Actor2");
        Actor actor3 = new Actor("Actor3");

        // Створення фільмів
        Film film1 = new Film("Film1", List.of(actor1, actor2));
        Film film2 = new Film("Film2", List.of(actor2, actor3, actor1));
        Film film3 = new Film("Film3", List.of(actor1, actor3));

        // Додавання фільмів до бази даних
        database.addFilm(film1);
        database.addFilm(film2);
        database.addFilm(film3);

        // Завдання 1: Визначити, чи є актор, який не зіграв в жодному фільмі
        System.out.println("Has actor with no films: " + database.hasActorWithNoFilms());

        // Завдання 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
        List<Actor> coactors = database.getCoactors(actor1);
        System.out.println("Coactors of Actor1:");
        for (Actor coactor : coactors) {
            System.out.println("- " + coactor.name);
        }

        // Завдання 3: Знайти фільм з найбільшою кількістю акторів
        Film mostActorsFilm = database.findFilmWithMostActors();
        System.out.println("Film with most actors: " + mostActorsFilm.title);
        database.printActorsInFilm(mostActorsFilm);
    }
}