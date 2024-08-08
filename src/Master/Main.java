package Master;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Master> masterMap = new HashMap<>();
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Jedi's name");
        String jediName = myObj.nextLine();
        System.out.println("Name is: " + jediName);

        System.out.println("Enter Sith's name");
        String sithName = myObj.nextLine();
        System.out.println("Name is: " + sithName);

        Jedi jedi1 = new Jedi(jediName, 350, 10, 10);
        Sith sith1 = new Sith(sithName, 300, 10);

        masterMap.put(jedi1.getName(), jedi1);
        masterMap.put(sith1.getName(), sith1);

        int turn = 1;

        while(true) {
            System.out.println("Turn " + turn);
            jedi1.useForce(sith1, turn);
            if (!jedi1.isAlive() || !sith1.isAlive()) {

                break;
            }
            sith1.useForce(jedi1, turn);
            if (!jedi1.isAlive() || !sith1.isAlive()) {

                break;
            }
            turn++;
        }
    }
}
