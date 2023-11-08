import java.util.ArrayList;
import java.util.List;

public class AcademicBook extends Book{
    private  String subject;

    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(int stock, List<Review> reviews, String subject) {
        super(stock, reviews);
        this.subject = subject;
    }

    public AcademicBook(int stock, ArrayList<Review> reviews, String subject) {
        super(stock, reviews);
        this.subject = subject;
    }

    public AcademicBook(String title, int stock, ArrayList<Review> reviews, String subject) {
        super(title, stock, reviews);
        this.subject = subject;
    }

    public AcademicBook(String title, String auteur, String ISBN, double price, int stock, String subject) {
        super(title, auteur, ISBN, price, stock);
        this.subject = subject;
    }

    public AcademicBook(ArrayList<Review> reviews, String subject) {
        super(reviews);
        this.subject = subject;
    }

    public AcademicBook(double price, int stock, ArrayList<Review> reviews, String subject) {
        super(price, stock, reviews);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMediaType(){
        if (getAverageRating()>=4.5){
            return "Bestselling AcademicBook";
        }else{
            return "AcademicBook";
        }    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}'+"\n"+toString();
    }

}
