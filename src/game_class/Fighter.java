package game_class;

public class Fighter {
    private int power;
    private int range;
    private String name;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getRange() {
        return range;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public String fight (Fighter fighter2, int distance) {
//        this fighter can fight
        if (this.range >= distance) {
//             fighter2 cannot fight
            if (fighter2.range < distance ) {
                return this.name;
            } else {
//                fighter2 can fight
                if (this.power > fighter2.power) {
                    return this.name;
                } else if (this.power < fighter2.power) {
                    return fighter2.name;
                } else {
                    return "draw";
                }

            }
        } else { //            this fighter cannot fight

            if (fighter2.range >= distance) {
                return fighter2.name; // fighter 2 can fight; this cannot fight
            } else  { //fighter 2 and this cannot fight

                return "draw";
            }

        }
    }
}
