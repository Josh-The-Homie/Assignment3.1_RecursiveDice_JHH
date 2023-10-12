public class RecDieRoller {
    public int countTwos(int numRolls) {
        int twos = 0;
        for (int i = 0; i < numRolls; i++) {
            int die = (int)(Math.random() * 6) + 1;
            if (die == 2) {
                twos++;
            }
        }
        return twos;
    }
}
