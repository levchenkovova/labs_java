import java.util.*;
public class CinemaDatabase {
    Set<Film> films;
    Set<Actor> actors;
    Map<Actor, Set<Film>> actorFilmMap;

    public CinemaDatabase() {
        this.films = new HashSet<>();
        this.actors = new HashSet<>();
        this.actorFilmMap = new HashMap<>();
    }

    // Додати фільм
    public void addFilm(Film film) {
        films.add(film);
        for (Actor actor : film.actors) {
            actors.add(actor);
            actor.films.add(film);

            // Додати актора та фільм у Map
            actorFilmMap.computeIfAbsent(actor, k -> new HashSet<>()).add(film);
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
    public Set<Actor> getCoactors(Actor targetActor) {
        Set<Actor> coactors = new HashSet<>();
        for (Film film : targetActor.films) {
            for (Iterator<Actor> actorIterator = film.actors.iterator(); actorIterator.hasNext();) {
                Actor actor = actorIterator.next();
                if (!actor.equals(targetActor)) {
                    coactors.add(actor);
                }
            }
        }
        return coactors;
    }

    public Set<String> getCoactorsNames(Actor targetActor) {
        Set<String> coactorsNames = new HashSet<>();
        Set<Actor> coactors = getCoactors(targetActor);

        for (Actor coactor : coactors) {
            coactorsNames.add(coactor.name);
        }

        return coactorsNames;
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

    // Додатковий метод: Вивести всі фільми для заданого актора
    public Set<String> getFilmsForActor(Actor actor) {
        Set<Film> filmsSet = actorFilmMap.get(actor);
        Set<String> filmTitles = new HashSet<>();

        if (filmsSet != null) {
            for (Film film : filmsSet) {
                filmTitles.add(film.title);
            }
        }

        return filmTitles;
    }

    // Метод для виводу інформації про акторів у фільмі
    public void printActorsInFilm(Film film) {
        System.out.println("Actors in film \"" + film.title + "\":");
        for (Actor actor : film.actors) {
            System.out.println("- " + actor.name);
        }
    }
}
