interface RobotHead {
    public void work();
}

class SmartHead implements RobotHead {
    @Override
    public void work() {
        System.out.println("study...");
    }
}
class PowerHead implements RobotHead {
    @Override
    public void work() {
        System.out.println("fight...");
    }
}
class Robot2 {
    RobotHead head;
    Robot2(RobotHead head) { //의존성 주입 (생성자 주입)
        this.head = head;
    }
    public void excute() {
        head.work();
    }
}
public class RobotClass2 {
    public static void main(String[] args) {
        PowerHead s = new PowerHead();
        SmartHead m = new SmartHead();
        Robot2 r = new Robot2(s);
        Robot2 o = new Robot2(m);
        r.excute();
        o.excute();
    }
}
