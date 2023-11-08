import java.util.List;

public class Novel extends Book{
    private String genre;
  public  Novel(){}

    public Novel(int stock, List<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getMediaType(){
        return null;
    }

    public String toString(){
        return null;
    }

}
