
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    // instance variables - replace the example below with your own
    String[] sharingFriends = {
            new String("Jamal"),
            new String("Emily"),
            new String("Destiny"),
            new String("Mateo"),
            new String("Sofia")
        };
    public Array(){
        for (int i = 0; i < sharingFriends.length; i++){
            System.out.println(sharingFriends[i]);
        }
    }
}
