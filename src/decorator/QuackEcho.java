package decorator;

import quacker.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.println("Echo:");
        duck.quack();
    }
}
