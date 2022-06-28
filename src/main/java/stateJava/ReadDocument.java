package stateJava;

public class ReadDocument implements DocumentAlertState {
    @Override
    public void document(AlertStateContext ctx) {
        System.out.println("read document...");
    }
}
