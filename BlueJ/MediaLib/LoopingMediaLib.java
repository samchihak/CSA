
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    { 
        for(int x = 0; x<8; x++){
        //while(MediaFile.readString()!= null){
            String songInfo = MediaFile.readString();
            int ind = songInfo.indexOf("|");
            String friendlyOne = songInfo.substring(0, ind-1);
            String friendlyTwo = songInfo.substring(ind+1,songInfo.length());
            System.out.println("Title" + ":" + friendlyOne + " " + "Rating" +":" +friendlyTwo);
           // }
        }
    }
}
