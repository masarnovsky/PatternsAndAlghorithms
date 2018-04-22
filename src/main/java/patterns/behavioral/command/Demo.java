package patterns.behavioral.command;

public class Demo {
    public static void main(String[] args) {
        Light light = new Light();
        Command up = new LightOnCommand(light);
        Command down = new LightOffCommand(light);
        Switch tumblr = new Switch(up, down);
        tumblr.flipUp();
        tumblr.flipDown();

        Fan fan = new Fan();
        up = new FanOnCommand(fan);
        down = new FanOffCommand(fan);
        tumblr = new Switch(up, down);
        tumblr.flipUp();
        tumblr.flipDown();
    }
}
