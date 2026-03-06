package JavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

    }

    public Object getFirst(ArrayList<?> list) {
        return list.get(0);
    }

    public <T> T copy(ArrayList<T> source, ArrayList<T> destination) {
        for (T item : source) {
            destination.add(item);
        }
        return null;
    }

    // Upper Bound
    public static double sum(List<? extends Number> number){
        double sum = 0;
        for(Number o: number){
            sum += o.doubleValue();
        }
        return 0;
    }

    // Lower Bound xuu
}

//Instead of, T we can write ? tho it's not ideal but okay for read-only operations