import java.util.*;
public class Film {
    String title;
    Set<Actor> actors;

    public Film(String title, Set<Actor> actors) {
        this.title = title;
        this.actors = actors;
    }
}
