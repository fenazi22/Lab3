import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> reviews=new ArrayList<>();
    private User user;

    Book(){}

    public Book(int stock, List<Review> reviews) {
        this.stock = stock;

    }

    public Book(int stock, ArrayList<Review> reviews) {
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, int stock, ArrayList<Review> reviews) {
        super(title);
        this.stock = stock;
        this.reviews = reviews;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;

    }

    public Book( ArrayList<Review> reviews){
        this.reviews = reviews;
    }
    public Book(double price, int stock, ArrayList<Review> reviews) {
        super(price);
        this.stock = stock;
        this.reviews = reviews;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }



    public Serializable getReviews() {
        for (int i = 0; i < reviews.size(); i++) {
            Review r = reviews.get(i);
            return  "User name: " + r.getUserName() + " Comment: " + r.getComment() + " Rating: " + r.getRating();
        }
//        return  null;
return reviews;    
}
    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review r) {
        reviews.add(r);

    }

    public double getAverageRating() {
        double sum = 0.0;
        for (Review review : reviews) {
            sum += review.getRating();
        }
        if (reviews.size() > 0) {
            return sum / reviews.size();
        } else {
            return 0.0;
        }
    }




    public void purchase(User user) {
    if (getStock()>0){
        user.addToCart(this);
        stock--;
    }

    }



    public boolean isBestseller() {
        return getAverageRating() >= 4.5;

    }

    public void restock(int quantity) {
    stock+=quantity;
        System.out.println("Restocked " + quantity + " copies of " + getTitle() + ". Current stock: " + stock);


    }



    public String getMediaType() {
        return  "Book";

    }



    @Override
    public String toString() {
        return super.toString()+" \n" +"Book{" +
                "stock=" + stock +
                ", reviews=" +getReviews()  +
                '}';
    }
}
