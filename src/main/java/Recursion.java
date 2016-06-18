/**
 * Created by jaymilnamow on 6/18/16.
 */
public class Recursion {

    public String sing99Bottles(int i){
        if(i == 0){
            System.out.println("Yep, apparently alcohol poisoning isn't a factor in this song. ;) ");
            return "";
        }

        System.out.println("" + i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down, pass it around, " + (i-1) + " bottles of beer on the wall..");
        return sing99Bottles(i-1);
    }



}
