package DIP;

interface Notifier {
    public void alert();
}
class Phone implements Notifier {
    @Override
    public void alert() {
        System.out.println("PHONE ALERT");
    }
}
class Email implements Notifier {
    @Override
    public void alert() {
        System.out.println("EMAIL ALERT");
    }
}
class Weather {
    private Notifier n;
    public Weather(Notifier noti) {
        this.n = noti;
    }
    public void run() {
        n.alert();
    }
}
public class Main {
    public static void main(String[] args) {
        Weather w = new Weather(new Phone());
        w.run();
    }
}
