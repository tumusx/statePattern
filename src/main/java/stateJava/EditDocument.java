package stateJava;

public class EditDocument implements DocumentAlertState
{
    @Override
    public void document(AlertStateContext ctx)
    {
        System.out.println("edit document...");
    }

}