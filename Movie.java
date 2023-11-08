import java.util.List;

public class Movie extends Media{
private  int  duration;

    public int getDuration() {
        return duration;
    }

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

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public User watch(User user){
        return user;
    }
   public void recommendSimilarMovies(List<Movie> movieCatalog){

    }
   public String getMediaType(){
        if (duration>=120){
            return "Long Movie";
        }else{
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                '}';
    }
}
