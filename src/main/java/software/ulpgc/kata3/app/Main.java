package software.ulpgc.kata3.app;

import software.ulpgc.kata3.architecture.Histogram;
import software.ulpgc.kata3.architecture.HistogramBuilder;
import software.ulpgc.kata3.architecture.Movie;

import java.util.List;

public class Main {
    static void main() {
        List<Movie> movies = new RemoteMovieLoader(Main :: fromTsv).loadAll();
        Histogram histogram = new HistogramBuilder(movies).build(m -> (m.year() / 10) * 10);
        for (int bin: histogram) System.out.println(bin + ": " + histogram.count(bin));
    }

    private static Movie fromTsv(String s) {
        return fromTsv(s.split("\t"));

    }

    private static Movie fromTsv(String[] split) {
        return new Movie(
                split[2],
                toInt(split[5]),
                toInt(split[7]));
    }

    private static int toInt(String s) {
        if (s.equals("\\N")) return -1;
        return Integer.parseInt(s);
    }
}
