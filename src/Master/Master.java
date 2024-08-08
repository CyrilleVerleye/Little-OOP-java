package Master;

public class Master {
    private int hp;
    private int dmg;
    private String name;

    public Master(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public void attack(Master target) {
        attack(target, 1); // Call the overloaded method with the default amplifier value of 1
    }

    public void attack(Master target, double amplifier) {
        // Calculate damage done
        double damageDone = this.getDmg() * amplifier;

        // Inflict damage on the target
        target.receiveDmg(damageDone);
    }

    public boolean isAlive() {
        if (this.hp <= 0) {
            System.out.println(this.name + " is dead");
            return false;
        } else {
            return true;
        }
    }

    public void receiveDmg(double dmg) {
        this.hp -= dmg;
        System.out.println(this.name + " received " + dmg + " damage");
    }

    @Override
    public String toString() {
        return "Master.Master{" +
                "name=" + name +
                ", hp=" + hp +
                ", dmg=" + dmg +
                '}';
    }
}
