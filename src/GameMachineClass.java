public class GameMachineClass {
    public static void main(String[] args) {
        GameMachine gm = new GameMachine();
    }
}

class GameMachine {
    private int totalCoin = 0;
    public void inputCoin(int a) {
        if (a <= 0 || a > 5) {
            System.out.println("입력값은 1~5 사이의 값이어야 합니다.");
            return;
        }
        if (totalCoin + a > 10) {
            System.out.println("총액은 10을 넘을 수 없습니다.");
            return;
        }
        totalCoin += a;
    }
    public void playGame() {
        if(totalCoin <= 0) {
            System.out.println("게임을 실행할 수 없습니다.");
            return;
        }
        System.out.println("게임 시작");
        totalCoin -= 1;
        System.out.println("게임 종료");
    }
    public int getTotalCoin() {
        return totalCoin;
    }
}