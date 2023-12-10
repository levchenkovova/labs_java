import java.util.ArrayList;
import java.util.List;

public class Actor {
    String name;
    List<Film> films;

    public Actor(String name) {
        this.name = name;
        this.films = new ArrayList<>();
    }
}