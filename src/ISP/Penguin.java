package ISP;

public class Penguin implements Bird{
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}
