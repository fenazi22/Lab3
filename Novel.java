import java.util.ArrayList;
import java.util.List;

public class Novel extends Book{
    private String genre;
  public  Novel(){}

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel(int stock, List<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public Novel(int stock, ArrayList<Review> reviews, String genre) {
        super(stock, reviews);
        this.genre = genre;
    }

    public Novel(String title, int stock, ArrayList<Review> reviews, String genre) {
        super(title, stock, reviews);
        this.genre = genre;
    }

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public Novel(ArrayList<Review> reviews, String genre) {
        super(reviews);
        this.genre = genre;
    }

    public Novel(double price, int stock, ArrayList<Review> reviews, String genre) {
        super(price, stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getMediaType(){
if (getAverageRating()>=4.5){
    return "Bestselling Novel";
}else{
    return "Novel";
}
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}'+"\n"+super.toString();
    }
}
