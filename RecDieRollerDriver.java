/**
@author Joshua Henderson
This program instantiates the RecDieRoller class and rolls it 1000 times counting the amount of twos.
*/
public class RecDieRollerDriver {
    public static void main(String[] args) {
        int totalTwos = 0;
        int numRolls = 1000; // Number of rolls

        RecDieRoller roller = new RecDieRoller();
        totalTwos = roller.countTwos(numRolls); // Count how many times 2 is rolled in 1,000 rolls

        System.out.println("Number of 2s rolled after " + numRolls + " rolls: " + totalTwos);
    }//end main
}//end RecDieRollerDriver
