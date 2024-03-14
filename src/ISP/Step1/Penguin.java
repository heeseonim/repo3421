package ISP.Step1;

public class Penguin implements Bird { // Bird만 사용
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    @Override
    public void sing() {

    }

    @Override
    public void eat() {

    }

    public void swim() {
        this.currentLocation = "in the water";
    }

    public void cry() {

    }
}
