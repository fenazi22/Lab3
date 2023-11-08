import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String email;
    private List<Media> purchasedMediaList = new ArrayList<Media>();
    private List<Integer> shoppingCart = new ArrayList<Integer>();


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
    purchasedMediaList.add(media);
    for (int i = 0; i < purchasedMediaList.size(); i++) {
        Media r = purchasedMediaList.get(i);
        System.out.println(r.getPrice() + r.getAuteur());

    }
}
    public void removeFromCart(Media media) {

    }

    public  void checkout(){

    }



    public List<Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
