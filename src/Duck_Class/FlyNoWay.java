package Duck_Class;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("i can't fly");
    }
}
