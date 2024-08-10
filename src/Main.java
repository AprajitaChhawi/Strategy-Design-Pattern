import Duck_Class.FlyWithWings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.performFly();
        md.performQuack();
        md.display();
        md.swim();

        ModelDuck mdu = new ModelDuck();
        mdu.performFly();
        mdu.setFlybehaviour(new FlyWithWings());
        mdu.performFly();
        }
    }