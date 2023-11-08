import java.util.ArrayList;

public class Store {
private ArrayList<User> user=new ArrayList<>();
private ArrayList<Media> media=new ArrayList<>();

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.media = media;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }
   public void addUser(User user){

    }
    public User displayUsers(){
        for (int i = 0; i <user.size() ; i++)
            return user.get(i);
        return null;
    }
   public void addMedia(Media media){

    }
    public Media displayMedias(){
        for (int i = 0; i <media.size() ; i++) {
            return media.get(i);
        }
        return null;
    }
   String searchBook(String title){
       if (title.equalsIgnoreCase(title)){
           return title;
       }else{
           return title+" Sorry Not Found";
       }
   }

    @Override
    public String toString() {
        return "Store{" +
                "user=" + user +
                ", media=" + media +
                '}';
    }
}
