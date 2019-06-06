package Statement_Control.Switch_Statement;

public class Switch_With_Enums {

    //Enum is type of java class that you write outside of the main method.
    enum Choice {Choice1, Choice2, Choice3}

    public static void main(String[] args) {


        //Calling the enum class.
        Choice ch = Choice.Choice1;

        switch (ch) {
            case Choice1:
                System.out.println(" Choice1 selected");
                break;
            case Choice2:
                System.out.println(" Choice2 selected ");
                break;
            case Choice3:
                System.out.println(" Choice3 selected");
                break;
        }

    }
}
