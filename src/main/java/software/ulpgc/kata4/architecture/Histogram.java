package software.ulpgc.kata4.architecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Histogram implements Iterable<Integer> {
    private final Map<Integer, Integer> bins;
    private final Map<String, String> labels;

    public Histogram(Map<String, String> labels) {
        this.bins = new HashMap<>();
        this.labels = labels;
    }

    public void addTo(int bin) {
        bins.put(bin, count(bin) + 1);
    }

    public int count(int bin) {
        return bins.getOrDefault(bin, 0);
    }

    public Set<Integer> bins() {
        return bins.keySet();
    }

    @Override
    public Iterator<Integer> iterator() {
        return bins.keySet().iterator();
    }

    public int size() {
        return bins.size();
    }

    public String title() {return labels.getOrDefault("title" , "");}

    public String X() {return labels.getOrDefault("X" , "");}

    public String Y() {return labels.getOrDefault("Y" , "");}

    public String legend()  {return labels.getOrDefault("legend" , "");}
}
