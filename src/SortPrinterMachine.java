import java.util.ArrayList;
import java.util.Arrays;

interface SortType {
    void run(ArrayList<Integer> lst);
}

class BubbleSort implements SortType {
    @Override
    public void run(ArrayList<Integer> lst) {
        for (int cycle = 0; cycle < lst.size(); cycle++) {
            for (int i = 0; i < lst.size() - 1 - cycle; i++) {
                if (lst.get(i) > lst.get(i + 1)) {
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
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tmp);
                }
            }
        }
    }
}
class SortPrinter {
    ArrayList<Integer> lst;
    SortType st;

    public void insert(ArrayList<Integer> lst) {
        this.lst = lst;
    }

    public void selection(SortType st) { // Sort 할당
        this.st = st;
    }

    public void run() { // Sort run 함수 호출
        st.run(lst);
    }

    public void show() {
        System.out.println(Arrays.toString(lst.toArray()));
    }
}

public class SortPrinterMachine { // Main
    public static void main(String[] args) {
        SortPrinter sp = new SortPrinter();
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(3, 5, 4, 1, 6, 7, 9));
        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(7, 5, 10, 4, 1, 2, 6));

        sp.insert(lst1);
        sp.selection(new BubbleSort());
        sp.run();
        sp.show();

        sp.insert(lst2);
        sp.selection(new SelectionSort());
        sp.run();
        sp.show();
    }
}
