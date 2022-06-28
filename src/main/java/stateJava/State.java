package stateJava;

public class State {
    public static void main(String[] args)
    {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.document();
        stateContext.document();
        stateContext.setState(new ReadDocument());
        stateContext.document();
        stateContext.document();
    }
}
