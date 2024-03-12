import java.util.ArrayList;

class Card {
    public int dateCode;
    public String name;

    public Card(int dateCode, String name) {
        this.dateCode = dateCode;
        this.name = name;
    }

    public boolean isInvalidCard() {
        return 0 < dateCode && dateCode < 10;
    }
}

public class Sign {
    public static void main(String[] args) {
        Sign sign = new Sign();
        ArrayList<Card> arr = new ArrayList<>();
        arr.add(new Card(5, "KFC"));
        arr.add(new Card(1, "JASON"));
        arr.add(new Card(2, "LUCKY"));

        try {
            sign.makeSign(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void makeSign(ArrayList<Card> signList) throws Exception {
        //비정상적인 경우
        if (isInvalid(signList)) {
            throw new Exception();
        }

        //정상적인 경우
        selectionSort(signList);
        doSign(signList);
    }

    private boolean isInvalid(ArrayList<Card> signList) {
        for (Card tar : signList) {
            if (tar.isInvalidCard()) continue;
            return true; //비정상
        }
        return false; //정상
    }

    private void selectionSort(ArrayList<Card> signList) throws Exception {
        for (int y = 0; y < signList.size(); y++) {
            for (int x = y + 1; x < signList.size(); x++) {
                if (signList.get(y).dateCode > signList.get(x).dateCode) {
                    Card temp = new Card(signList.get(y).dateCode, signList.get(y).name);
                    signList.get(y).dateCode = signList.get(x).dateCode;
                    signList.get(y).name = signList.get(x).name;
                    signList.get(x).dateCode = temp.dateCode;
                    signList.get(x).name = temp.name;
                }
            }
        }
    }

    private void doSign(ArrayList<Card> signList) {
        for (Card tar : signList) {
            System.out.println(tar.dateCode + " : " + tar.name);
        }
    }
}