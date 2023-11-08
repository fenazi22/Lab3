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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMediaType(){
        return null;
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }

}
