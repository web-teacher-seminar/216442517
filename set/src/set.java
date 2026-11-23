import java.util.Arrays;
import java.util.LinkedList;

public class set {
    private LinkedList<Integer>[] arr;

    public set() {
        arr = new LinkedList[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = new LinkedList<>();

        }


    }

    public int HashCode(int x) {
        return x % 10;
    }

    public boolean find(int y) {

        int index = HashCode(y);
        return arr[index].contains(y);
    }

    public void add(int z) {
        int index = HashCode(z);
        if (arr[index].contains(z) && index > 10) return;
        arr[index].add(z);
    }


    public void delete(int o) {
        if (!find(o)) {
            return;
        }
        int index = HashCode(o);
        arr[index].removeFirstOccurrence(o);

    }

    @Override
    public String toString() {
        return "set{" + "arr=" + Arrays.toString(arr) + '}';
    }

    public void Add(int o) {
        int i = HashCode(o);

        if (arr[i].contains(o) && i > 10) return;
        arr[i].add(o);

    }


}
