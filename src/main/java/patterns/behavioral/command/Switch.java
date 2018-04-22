package patterns.behavioral.command;

public class Switch {
    private Command commandUp;
    private Command commandDown;

    public Switch(Command commandUp, Command commandDown) {
        this.commandUp = commandUp;
        this.commandDown = commandDown;
    }

    public void flipUp() {
        commandUp.execute();
    }

    public void flipDown() {
        commandDown.execute();
    }
}
