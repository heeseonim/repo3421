import java.util.ArrayList;
import java.util.Arrays;

interface SortType {
    void run(ArrayList<Integer> lst);
}
class BubbleSort implements SortType {
    @Override
    public void run(ArrayList<Integer> lst) {
        for(int cycle = 0 ;cycle < lst.size(); cycle ++) {
            for(int i = 0 ; i < lst.size() - 1 - cycle; i ++) {
                if(lst.get(i) > lst.get(i + 1)){
                    //swap
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(i + 1));
                    lst.set(i + 1, tmp);
                }
            }
        }
    }
}

class SelectionSort implements SortType {
    @Override
    public void run(ArrayList<Integer> lst) {
        for(int i = 0 ; i < lst.size(); i++) {
            for(int j = i + 1 ; j < lst.size(); j ++) {
                if(lst.get(i) > lst.get(j)){
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tmp);
                }
            }
        }
    }
}
public class SortPrinter {
    public SortType st;
    public static ArrayList<Integer> lst = new ArrayList<>();

    public static void main(String[] args) {
        SortPrinter sp = new SortPrinter();
        for (int i = 10; i > 0; i--) {
            sp.insert(i);
        }

        sp.selection(new BubbleSort());
        System.out.println("before"); sp.show();
        sp.run();
        System.out.println("after"); sp.show();

        System.out.println("\n");
        lst.clear();
        for (int i = 10; i > 0; i--) {
            sp.insert(i);
        }

        sp.selection(new SelectionSort());
        System.out.println("before"); sp.show();
        sp.run();
        System.out.println("after"); sp.show();
    }

    public void insert(int num) {
        lst.add(num);
    }
    public void selection(SortType type) {
        st = type;
    }
    public void run() {
        st.run(lst);
    }

    public void show() {
        System.out.println(Arrays.toString(lst.toArray()));
    }
}
