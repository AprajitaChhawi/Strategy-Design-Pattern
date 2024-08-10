package Duck_Class;

import java.sql.SQLOutput;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
