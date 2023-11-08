import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
private  int  duration;

    public int getDuration() {
        return duration;
    }
Movie(){}
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public Movie(String title, String auteur, int duration) {
        super(title, auteur);
        this.duration = duration;
    }
    public Movie(String title, String auteur, int duration,double price) {
        super(title, auteur,price);
        this.duration = duration;
    }
    public Movie(String title, String auteur,String ISBN , int duration,double price) {
        super(title, auteur,ISBN,price);
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public Movie(double price, int duration) {
        super(price);
        this.duration = duration;
    }

    public void watch(User user){
        user.addToCart(this);

    }
   public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
       List<Movie> similarMovies = new ArrayList<>();

       for (Movie movie : movieCatalog) {
           if (movie.getAuteur().equals(getAuteur())) {
               similarMovies.add(movie);
           }
       }

       return similarMovies;
    }
   public String getMediaType(){
        if (duration>=120){
            return "\"Long Movie\" ";
        }else{
            return "\"Movie\"";
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration: " + duration +
                '}'+" \n"+super.toString()+"\n";
    }
}
