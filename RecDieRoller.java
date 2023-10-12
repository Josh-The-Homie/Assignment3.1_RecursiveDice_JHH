/**
@author Joshua Henderson 
This program rolls a dice until it returns a two.
*/
public class RecDieRoller {
    public int countTwos(int numRolls) {
        int twos = 0;
        for (int i = 0; i < numRolls; i++) {
            int die = (int)(Math.random() * 6) + 1;
            if (die == 2) {
                twos++;
            }//end if
        }//end for
        return twos;
    }//end countTwos
}//end RecDieRoller
