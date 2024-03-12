public class RobotClass {
    public static void main(String[] args) {
        Robot sr = new SpeedRobot();
        Robot pr = new PowerRobot();

        sr.move();
        pr.move();
    }
}

class Robot {
    int hp;

    public void move() {

    }
    public void stop() {

    }
}

class SpeedRobot extends Robot {
    int modelID;
    public void run() {

    }
    public void walk() {

    }
    public void move() {
        System.out.println("SpeedRobot");
    }
    public void stop() {
        System.out.println("SpeedRobot");
    }
}

class PowerRobot extends Robot {
    int mana;
    public void attack(){

    }
    public void jump(){

    }
    public void move() {
        System.out.println("PowerRobot");
    }
    public void stop() {
        System.out.println("PowerRobot");
    }
}