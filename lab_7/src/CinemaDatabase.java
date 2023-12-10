import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CinemaDatabase {
    List<Film> films;
    List<Actor> actors;

    public CinemaDatabase() {
        this.films = new ArrayList<>();
        this.actors = new ArrayList<>();
    }

    // Додати фільм
    public void addFilm(Film film) {
        films.add(film);
        for (Actor actor : film.actors) {
            if (!actors.contains(actor)) {
                actors.add(actor);
            }
            actor.films.add(film);
        }
    }

    // Завдання 1: Визначити, чи є актор, який не зіграв в жодному фільмі
    public boolean hasActorWithNoFilms() {
        for (Iterator actorIterator = actors.iterator(); actorIterator.hasNext();) {
            Actor actor = (Actor) actorIterator.next();
            if (actor.films.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // Завдання 2: Скласти список акторів, з якими коли-небудь в одному фільмі грав заданий актор
    public List<Actor> getCoactors(Actor targetActor) {
        List<Actor> coactors = new ArrayList<>();
        for (Film film : targetActor.films) {
            for (Iterator<Actor> actorIterator = film.actors.iterator(); actorIterator.hasNext();) {
                Actor actor = actorIterator.next();
                if (!actor.equals(targetActor) && !coactors.contains(actor)) {
                    coactors.add(actor);
                }
            }
        }
        return coactors;
    }

    // Завдання 3: Знайти фільм з найбільшою кількістю акторів
    public Film findFilmWithMostActors() {
        Film result = null;
        int maxActors = 0;
        for (Film film : films) {
            int numActors = film.actors.size();
            if (numActors > maxActors) {
                maxActors = numActors;
                result = film;
            }
        }
        return result;
    }

    // Метод для виводу інформації про акторів у фільмі
    public void printActorsInFilm(Film film) {
        System.out.println("Actors in film \"" + film.title + "\":");
        for (Actor actor : film.actors) {
            System.out.println("- " + actor.name);
        }
    }
}
