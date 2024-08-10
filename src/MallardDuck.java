import Duck_Class.Duck;
import Duck_Class.FlyNoWay;
import Duck_Class.FlyWithWings;
import Duck_Class.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackbehaviour = new Quack();
        flybehaviour = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am a mallard Duck");
    }
}
