import java.util.ArrayList;

interface Sort {
    public void doSort(ArrayList<Integer> lst);
}
class SelectionSort_answer implements Sort {
    @Override
    public void doSort(ArrayList<Integer> lst) {
        //구현부
    }
}
class BubbleSort_answer implements Sort {
    @Override
    public void doSort(ArrayList<Integer> lst) {
        //구현부
    }
}
class SortPrinter_answer {
    private Sort s; // 실제 구현체와 연결
    private ArrayList<Integer> lst;

    public void insert(int a) {
        lst.add(a);
    }
    public void selection(Sort sort) {
        this.s = sort;
    }
    public void run() {
        s.doSort(lst);
    }
    public void show() {
        for (Integer ele : lst) {
            System.out.println(ele + " ");
        }
    }
}

public class SortPrinterMachine_answer {
    public static void main(String[] args) {
        SortPrinter_answer s = new SortPrinter_answer();
        s.selection((new SelectionSort_answer()));
        s.run();
        s.show();
    }
}
