import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Створення бази даних про кіно
        CinemaDatabase database = new CinemaDatabase();

        // Створення акторів
        Actor actor1 = new Actor("Actor1");
        Actor actor2 = new Actor("Actor2");
        Actor actor3 = new Actor("Actor3");

        // Створення фільмів
        Set<Actor> actors1 = new HashSet<>(List.of(actor1, actor2));
        Set<Actor> actors2 = new HashSet<>(List.of(actor2, actor3));
        Set<Actor> actors3 = new HashSet<>(List.of(actor1, actor3));

        Film film1 = new Film("Film1", actors1);
        Film film2 = new Film("Film2", actors2);
        Film film3 = new Film("Film3", actors3);

        // Додавання фільмів до бази даних
        database.addFilm(film1);
        database.addFilm(film2);
        database.addFilm(film3);

        // Завдання 1: Визначити, чи є актор, який не зіграв в жодному фільмі
        System.out.println("Has actor with no films: " + database.hasActorWithNoFilms());

        // Завдання 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
        Set<String> coactors = database.getCoactorsNames(actor1);
        System.out.println("Coactors of Actor1: " + coactors);

        // Завдання 3: Знайти фільм з найбільшою кількістю акторів
        Film mostActorsFilm = database.findFilmWithMostActors();
        System.out.println("Film with most actors: " + mostActorsFilm.title);
        database.printActorsInFilm(mostActorsFilm);

        // Додатковий метод: Вивести всі фільми для заданого актора
        System.out.println("Films for Actor1: " + database.getFilmsForActor(actor1));
    }
}