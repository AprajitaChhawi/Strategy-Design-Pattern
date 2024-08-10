import Duck_Class.Duck;
import Duck_Class.FlyNoWay;
import Duck_Class.FlyWithWings;
import Duck_Class.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackbehaviour = new MuteQuack();
        flybehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
}
