import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        System.out.println("\t\n ---Book 1---\n");

        Book b1 = new Book("JAVA", "Fahad", "102030", 150, 11);
        Review rx = new Review("FaisaL", 4.5, "Good");
        b1.addReview(rx);
        User b=new User("Faisal","Fenazi22@gmail.com");
        b1.purchase(b);
        b1.getAverageRating();
        System.out.println(b1.toString());


        Book b2 = new Book("JAVA", "Fahad", "102030", 150, 12);
        Review rx2 = new Review("Ali", 3.5, "Not Bad");
        b2.addReview(rx2);
        User u1=new User("Sultan","ffa_12@hotmail.com");
        b2.purchase(u1);
        System.out.println(b2.toString());

        Book b3 = new Book("JAVA", "Fahad", "102030", 150, 13);
        Review rx3 = new Review("Omar", 5, "Excellent");
        b3.addReview(rx3);
//        User u2=new User("Sultan","feksa20@gmail.com");
//        b3.purchase(u2);
        b3.restock(1);
        System.out.println(b3.isBestseller());
        System.out.println(b3.toString());

        System.out.println(b3.getAverageRating());





    }

}