
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib extends All
{
    // instance variables - replace the example below with your own
    String[] sharingFriends = {
            new String("Jamal"),
            new String("Emily"),
            new String("Destiny"),
            new String("Mateo"),
            new String("Sofia")
        };

    public static void ArrayMediaLib(){
        Song[] topTenSongs = {new Song("The Twist by Chubby Checker", 1.29, 10, 180),
                new Song("Mack the Knife by Bobby Darin", 1.29, 9, 120),
                new Song("How Do I Live by LeAnn Rimes", 1.29, 8, 60)
            };
        //stopped at 1.2.2.IV.18
        System.out.println("-BEFORE--");
        for (Song s: topTenSongs){
            //System.out.println(s.getTitle());
            s.pint();
        }
        for (Song changeSong : topTenSongs) {
            changeSong.setPrice(1.29);}
        /*for (int i = 0; i < topTenSongs.length; i++){
        topTenSongs[i] = new Song("test", 0, 0, 0);
        }*/
        //for (Song changePrice : topTenSongs) {
        for (int i = 0; i < topTenSongs.length; i++){
            if((i+1)%3==0){topTenSongs[i].setPrice(.99);}}
        //}

        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            //System.out.println(showSong.getTitle());}
            showSong.pint();}
        /*
        for (int i = 0; i < sharingFriends.length; i++){
        System.out.println(sharingFriends[i]);
        }
        }*/
        /*
        int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0;
        for (int days : daysBtwnPurchase){
        total = total + days;
        }
        System.out.println(total);
        }*/

    }
}
