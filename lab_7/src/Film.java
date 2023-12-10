import java.util.List;

public class Film {
    String title;
    List<Actor> actors;

    public Film(String title, List<Actor> actors) {
        this.title = title;
        this.actors = actors;
    }
}