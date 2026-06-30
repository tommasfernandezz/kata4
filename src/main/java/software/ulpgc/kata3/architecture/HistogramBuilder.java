package software.ulpgc.kata3.architecture;

import java.util.List;
import java.util.function.Function;

public class HistogramBuilder {
    private final List<Movie> movies;

    public HistogramBuilder(List<Movie> movies) {
        this.movies = movies;
    }

    public Histogram build(Function<Movie, Integer> binarize) {
        Histogram histogram = new Histogram();
        for (Movie movie : movies) histogram.addTo(binarize.apply(movie));
        return histogram;
    }
}
