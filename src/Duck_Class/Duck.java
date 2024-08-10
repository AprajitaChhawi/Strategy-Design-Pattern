package Duck_Class;

public abstract class Duck {
    public FlyBehaviour flybehaviour;
    public QuackBehaviour quackbehaviour;
    public abstract void display();
    public void performFly(){
        flybehaviour.fly();
    }
    public void performQuack(){
        quackbehaviour.quack();
    }
    public void swim(){
        System.out.println("Swimming ducks");
    }

    public void setFlybehaviour(FlyBehaviour fb) {
        flybehaviour = fb;
    }

    public void setQuackbehaviour(QuackBehaviour qb) {
        quackbehaviour = qb;
    }
}
