package Master;

public class Jedi extends Master implements ForceUser {
    private int force;

    public Jedi(String name, int hp, int dmg, int force) {
        super(name, hp, dmg);
        this.force = force;
    }

    public void forcePush(Master target) {
        target.attack(target, this.force);
    }

    public void useForce(Master target, int turn) {
        if (turn % 5 == 0) {
            this.forcePush(target);
        }

        if (turn % 5 == 1 && turn != 1) {
            return;
        }

        if (turn % 5 == 2 && turn != 2)  {
            return;
        }
        this.attack(target);
    }
}
