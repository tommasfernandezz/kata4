package software.ulpgc.kata4.architecture;

import java.util.stream.Stream;

public interface MovieLoader {
    Stream<Movie> loadAll();
}
