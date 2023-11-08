import java.util.ArrayList;

public class Store {
    private ArrayList<User> user = new ArrayList<>();
    private ArrayList<Media> medias = new ArrayList<>();

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.medias = media;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    public ArrayList<Media> getMedia() {
        return medias;
    }

    public void setMedia(ArrayList<Media> media) {
        this.medias = media;
    }

    public void addUser(User user) {

    }

    public User displayUsers() {
        for (int i = 0; i < user.size(); i++)
            return user.get(i);
        return null;
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public Media displayMedias() {
        for (int i = 0; i < medias.size(); i++) {
            return medias.get(i);
        }
        return null;
    }

    String searchBook(String title) {
        if (title.equalsIgnoreCase(title)) {
            return title;
        } else {
            return title + " Sorry Not Found";
        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "user=" + user +
                ", media=" + medias +
                '}';
    }
}
