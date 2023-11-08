import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String email;
    private List<Media> purchasedMediaList = new ArrayList<Media>();
    private List<Media> shoppingCart = new ArrayList<Media>();


    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }


void addToCart(Media media){
    shoppingCart.add(media);
    System.out.println("shoppingCart:");
    for (int i = 0; i < shoppingCart.size(); i++) {
        Media r = shoppingCart.get(i);
        System.out.println((i+1)+"- Title:"+r.getTitle()+". Price: "+r.getPrice() +" Auteur: "+ r.getAuteur());

    }
}
    public void removeFromCart(Media media) {

    }

    public  void checkout(){

    }



    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
