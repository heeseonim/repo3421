package ISP.Step1;

import ISP.Flyable;

public class Eagle implements Bird, Flyable { // 두 인터페이스 사용
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void sing() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }
}
