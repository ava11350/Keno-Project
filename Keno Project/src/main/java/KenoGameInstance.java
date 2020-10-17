import java.util.ArrayList;
import java.util.Random;

public class KenoGameInstance {
    public ArrayList<Integer> userInput;
    public ArrayList<Integer> computerResult;
    public ArrayList<Integer> hits;
    private int spotsToPlay;
    public int moneyWon;
    public KenoGameInstance(int spots){
        userInput = new ArrayList<>();
        computerResult = new ArrayList<>();
        hits = new ArrayList<>();
        spotsToPlay = spots;
        moneyWon = 0;
    }

    public boolean pushInput(int val){ //push user input into userInput array. Returns true on success, false on error.
        if(userInput.size() == spotsToPlay){
            return false;
        }
        if(userInput.contains(new Integer(val))){
            System.out.println("Error: " + val + " has already been inputted");
            return false;
        }
        else {
            userInput.add(new Integer(val));
            return true;
        }
    }
    public int computerDraw(){
        int temp = new Random().nextInt(80) + 1;
        while(computerResult.contains(new Integer(temp))){
            temp = new Random().nextInt(80) + 1;
        }
        computerResult.add(temp);
        if(userInput.contains(temp)){
            System.out.println("Hit!");
            hits.add(temp);
            checkWinnings();
        }
        return temp;
    }

    public void checkWinnings(){
        int size = hits.size();
        switch (spotsToPlay){
            case 1:
                switch (size) {
                    case 1:
                        moneyWon = 2;
                }
            case 4:
                switch (size){
                    case 2:
                        moneyWon = 1;;
                    case 3:
                        moneyWon = 5;
                    case 4:
                        moneyWon = 75;
                }
            case 8:
                switch (size){
                    case 4:
                        moneyWon = 2;
                    case 5:
                        moneyWon = 12;
                    case 6:
                        moneyWon = 50;
                    case 7:
                        moneyWon = 750;
                    case 8:
                        moneyWon = 10000;
                }
            case 10:
                switch (size){
                    case 5:
                        moneyWon = 2;
                    case 6:
                        moneyWon = 15;
                    case 7:
                        moneyWon = 150;
                    case 8:
                        moneyWon = 450;
                    case 9:
                        moneyWon = 4250;
                    case 10:
                        moneyWon = 100000;
                }
        }
    }

}
