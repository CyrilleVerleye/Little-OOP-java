package Master;

public class Sith extends Master implements ForceUser {
    public Sith(String name, int hp, int dmg) {
        super(name, hp, dmg);
    }

    public void lightning(Master target) {
        double dmg = 1.5;
        this.attack(target, dmg);
    }

    public void stroke(Master target) {
        double dmg = 0.5;
        this.attack(target, dmg);
    }

    public void useForce(Master target, int turn) {
        if (turn % 2 == 0) {
            this.lightning(target);
        }
        if (turn % 3 == 0) {
            this.stroke(target);
        }
        this.attack(target);
    }
}
