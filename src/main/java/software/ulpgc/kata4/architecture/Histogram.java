package software.ulpgc.kata4.architecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Histogram implements Iterable<Integer> {
    private final HashMap<Integer, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }

    public void addTo(int bin) {
        map.put(bin, count(bin) + 1);
    }

    public int count(int bin) {
        return map.getOrDefault(bin, 0);
    }

    public Set<Integer> bins() {
        return map.keySet();
    }

    @Override
    public Iterator<Integer> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size();
    }

}
