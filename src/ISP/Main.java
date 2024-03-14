package ISP;

public class Main {
    static void goWalk(Walkable p) {
        p.run();
    }
    static void goFly(Flyable p) {
        p.fly();
    }

    public static void main(String[] args) {
        goFly(new Superman());
        goWalk(new Batman());
    }
}
