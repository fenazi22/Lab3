import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

   public void listen(User user){
        user.addToCart(this);
       System.out.println(user.getUserName());
    }
    List<Music>  generatePlaylist(List<Music> musicCatalog){
        List<Music> similarMovies = new ArrayList<>();

        for (Music listen : musicCatalog) {
            if (listen.getAuteur().equals(getAuteur())) {
                similarMovies.add(listen);
            }
        }

        return similarMovies;
    }
    public String getMediaType(){
        if (getPrice()>=120){
            return "Premium Music";
        }else{
            return "Music";
        }
    }


    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                '}';
    }
}
