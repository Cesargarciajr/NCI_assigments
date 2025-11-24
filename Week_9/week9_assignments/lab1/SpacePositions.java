import java.util.ArrayList;
import java.util.List;

public class SpacePositions {
    private String userInput;
    private List<Integer> positions;

    // set
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    // compute: find positions (indices) of space characters in the input
    public void computePositions() {
        positions = new ArrayList<>();
        if (userInput == null || userInput.isEmpty()) return;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') positions.add(i);
        }
    }

    // get raw list
    public List<Integer> getPositions() {
        return positions;
    }

    // helper to return a printable string
    public String getPositionsString() {
        if (positions == null || positions.isEmpty()) return "[]";
        return positions.toString();
    }
}
