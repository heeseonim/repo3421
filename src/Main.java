import java.util.ArrayList;

public class Main {
    // main 입력하고 탭
    public static void main(String[] args) {

    }

    static void setRemainDays(ArrayList<Integer> roomRemainDays) {
        for (int num = 0; num < roomRemainDays.size(); num++) {
            if (roomRemainDays.get(num) == 0) continue;
            roomRemainDays.set(num, roomRemainDays.get(num) - 1);
        }
    }

    class Point {
        int x;
        int y;

        void print() {
            System.out.println(x + " " + y);
        }
    }

    class drawMachine {
        ArrayList<Point> points = new ArrayList<>();

        void addPoint(Point p) {
            points.add(p);
        }

        void drawPoints() {
            for (Point p : points) {
                p.print();
            }
        }
    }

}