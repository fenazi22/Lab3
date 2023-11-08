public class Media {
    private  String title;
    private  String auteur;
    private  String ISBN;
    private  double Price;

    Media(){}
public Media(String title){
        this.title=title;
    }
Media(String title,String auteur){
        this.title=title;
        this.auteur=auteur;
}
Media(String title,String auteur,double price){
        this.title=title;
        this.auteur=auteur;
        this.Price=price;
}


    public Media(String title, String auteur, String ISBN, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.Price = price;
    }

    public Media(double price) {
        Price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }


    public String getMediaType(){
        return  "Media";
    }


    @Override

    public String toString() {
        return " Media{" +
                " title: '" + title + '\'' +
                " , auteur: '" + auteur + '\'' +
                " , ISBN: '" + ISBN + '\'' +
                " , Price: " + Price +
                '}';
    }


}
