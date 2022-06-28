package stateJava;

public class AlertStateContext {
    private DocumentAlertState currentState;

    public AlertStateContext() {
        currentState = new EditDocument();
    }

    public void setState(DocumentAlertState state)
    {
        currentState = state;
    }

    public void document()
    {
        currentState.document(this);
    }
}
