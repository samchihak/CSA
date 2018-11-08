
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        while(songInfo!=null){
            //for(int x = 0; x<16; x++){
            if(songInfo.length()<1){
                songInfo=null;
                break;
            }
            int ind = songInfo.indexOf("|");
            String newString = songInfo.substring(0, ind);
            if(newString.length()<3){
                newString = "Rating:" + " " + newString;
            }
            else{
                newString = "Title:" + " " + newString;
            }
            System.out.println(newString);
            songInfo = songInfo.substring(ind+1);
            
            

    }
}
}
