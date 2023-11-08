  public class Review {
    private String UserName;
    private double rating;
    private String comment;
   public void addUser(User user){

    }
   void displayUsers(){

    }
    void addMedia(Media media){

    }

    void displayMedias(){

    }

    public Review(String userName) {
        UserName = userName;
    }

    public Review(double rating) {
        this.rating = rating;
    }


    public Review(String userName, double rating, String comment) {
        UserName = userName;
        this.rating = rating;
        this.comment = comment;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
