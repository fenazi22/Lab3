import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n" +
                "\t\t\t     \\|/\n" +
                "\t\t\t     / \\      <- Faisal Abdullah Alanazi\n" +
                "\t\t\t _ _/ O \\_ _     Lab 3 \n\n");

        User user1 = new User("Faisal", "Fenazi22@gmail.com");// --Method 3--

        System.out.println("\t\n ---Book  Class---\n");

        /*
         * addReview(Review review): Done
         * getAverageRating(): Done
         * purchase(User user): Done
         * isBestseller(): Done
         *  restock(int quantity): Done
         * • Override Methods: Done
             1. getMediaType(): Done
             2.toString(). Done
          */


        Book b1 = new Book("JAVA", "Omer", "102030", 150, 11);
        Book b2 = new Book("Python", "Khaled", "103030", 200, 5);
        Book b3 = new Book("Kotlin", "Ahmed", "104030", 250, 10);

        Review rx0 = new Review("Ali", 4.5, "Good");
        Review rx1 = new Review("Saad", 4.5, "bad");
        Review rx2 = new Review("Yousef", 4.5, "Excellent");
        Review rx3 = new Review("Faisal", 5, "nice");

        b1.addReview(rx0);// --Method 1--
        b1.addReview(rx1);// --Method 1--
        b1.addReview(rx2);// --Method 1--
        b1.addReview(rx3);// --Method 1--
        // System.out.println("AverageRating: "+b1.getAverageRating());// --Method 2--


        b1.purchase(user1);
        b2.purchase(user1);
        b3.purchase(user1);

        System.out.println((b1.isBestseller()));// --Method 4--
        System.out.println(b1.getMediaType());
        System.out.println(b1.toString());


        System.out.println("\n\t ---Movie Class ---\n");

        /*
        * watch(User user): Done
        * recommendSimilarMovies(List<Movie> movieCatalog): Done
        * Override Methods: Done
            1. getMediaType(): Done
            2. toString(). Done
         */

        Movie Move1 = new Movie("John Wick 1", "Faisal", "101010", 60, 150d);
        Movie Move2 = new Movie("John Wick 2", "Ali", "102010", 60, 100d);
        Movie Move3 = new Movie("Prison Break", "Ali", "103010", 60, 40d);
        System.out.println(Move1.getMediaType());
        System.out.println(Move2.getMediaType());


        Move1.watch(user1);// --Method 1--
        Move2.watch(user1);// --Method 1--


        List<Movie> catalog = new ArrayList<>();// --Method 2--
        catalog.add(Move1);// --Method 2--
        catalog.add(Move2);// --Method2--
        System.out.println(Move1.getMediaType());// --Method 3--
        System.out.println(Move1.toString());// --Method 4--






        System.out.println("\n\t ---Music Class ---\n");

        /*
        * listen(User user): Done
        * generatePlaylist(List<Music> musicCatalog): Done
        * Override Methods:
        1. getMediaType(): Done
        2. toString(): Done
         */

        Music mu1 = new Music("John Wick 1", "aaa", "101010", 60, "Faisal");
        Music mu2 = new Music("Song 2", "bbb", "202020", 90, "Sarah");
        Music mu3 = new Music("Track 3", "ccc", "303030", 120, "Ahmed");
        Music mu4 = new Music("Melody 4", "ddd", "404040", 75, "Layla");
        Music mu5 = new Music("Tune 5", "eee", "505050", 150, "Majid");
        System.out.println(mu1.getMediaType());
        System.out.println(mu1.getMediaType());


        mu1.listen(user1);// --Method 1--
        mu2.listen(user1);// --Method 1--
        mu3.listen(user1);// --Method 1--
        mu4.listen(user1);// --Method 1--


        List<Music> catalogMusic = new ArrayList<>();// --Method 2--
        catalogMusic.add(mu1);// --Method 2--
        catalogMusic.add(mu1);// --Method2--
        System.out.println(mu1.getMediaType());// --Method 3--
        System.out.println(mu1.toString());// --Method 4--


    }

}