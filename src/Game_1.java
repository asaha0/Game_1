import game_class.Fighter;

public class Game_1 {
    public static void main (String[] args) {

        Fighter viet = new Fighter ();
        Fighter amit = new Fighter ();

        viet.setPower(2);
        viet.setName("Viet");
        viet.setRange(200);

        amit.setName("Amit");
        amit.setRange(100);
        amit.setPower(100);

        String winner = viet.fight (amit, 50);
        System.out.println(winner);
    }
}
