import java.util.ArrayList;

class Zergling {
    int hp, mana;

    Zergling() { // 생성자
        hp = 80;
        mana = 200;
    }

    void attack() {
        hp += 1;
        mana -= 10;
    }

    void move() {
        hp -= 10;
        mana += 5;
    }

    void status() {
        System.out.println(hp + " " + mana);
    }

}

public class Main {
    public static void main(String[] args) {
        Zergling z1 = new Zergling();
        Zergling z2 = new Zergling();

        z1.attack();
        z2.move();
        z1.status();
        z2.status();
    }
}