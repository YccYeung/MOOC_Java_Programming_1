import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack = new ArrayList<>();
    
    public boolean isEmpty() {

        if (stack.size() == 0) {
            return true;
        }

        return false;
    }

    public void add(String value) {
        stack.add(stack.size(), value);
    }

    public ArrayList<String> values() {
        
        return stack;

    }

    public String take() {

        String lastWord = stack.get(stack.size()-1);
        stack.remove(lastWord);
        return lastWord;
        
    }
}
