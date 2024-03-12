import java.util.ArrayList;

public class Main {
    public static class Marin {
        int hp = 100;
        void run() {
            hp -= 10;
            System.out.println("RUN " + hp);
        }
    }
    // main 입력하고 탭

    public static void main(String[] args) {
        Marin m1 = new Marin();
        System.out.println(m1.hp);
        m1.run();
        m1.run();
        m1.run();
        m1.run();
        m1.run();
    }
}