import java.util.*;
public class Actor {
    String name;
    Set<Film> films;

    public Actor(String name) {
        this.name = name;
        this.films = new HashSet<>();
    }
}
