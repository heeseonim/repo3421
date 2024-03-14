package OCP;
interface Socket {
    public void plugIn();
    public void unPlug();
}
class Dansang implements Socket {
    @Override
    public void plugIn() {
        
    }

    @Override
    public void unPlug() {

    }
}
class House {
    Socket socket = new Dansang(); // 교체할 필요가 있다면 생성자로 변경
    void useElect() {
        socket.plugIn();
        socket.unPlug();
    }
}
public class SocketHouse {
}
