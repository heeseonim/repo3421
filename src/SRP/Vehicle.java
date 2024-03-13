package SRP;

class Fueler {
    public void reFuel(Vehicle v) { // 만땅
        int remain = v.getRemainingFuel();
        int diff = v.getMaxFuel() - remain;
       v.setRemainingFuel(remain + diff);
    }
}
public class Vehicle {
    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }
}