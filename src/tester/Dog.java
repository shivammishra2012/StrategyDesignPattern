package tester;

import bark.BarkBehaviour;
import eat.EatBehaviour;

public class Dog {

    private final BarkBehaviour barkBehaviour;
    private final EatBehaviour eatBehaviour;

    public Dog(BarkBehaviour barkBehaviour, EatBehaviour eatBehaviour) {
        this.barkBehaviour = barkBehaviour;
        this.eatBehaviour = eatBehaviour;
    }

    public void eat()
    {
        this.eatBehaviour.eat();
    }
    public void bark()
    {
        this.barkBehaviour.bark();
    }
}
