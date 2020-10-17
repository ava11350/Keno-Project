import java.util.ArrayList;
import java.util.Random;

public class KenoGameInstance {
    public ArrayList<Integer> userInput;
    public ArrayList<Integer> computerResult;
    private int spotsToPlay;
    public KenoGameInstance(int spots){
        userInput = new ArrayList<>();
        computerResult = new ArrayList<>();
        spotsToPlay = spots;
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
        return temp;
    }
}
