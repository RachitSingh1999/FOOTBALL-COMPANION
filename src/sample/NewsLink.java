package sample;

public class NewsLink {
    private String title;
    private String address;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public NewsLink(String address, String title){
        this.address=address;
        this.title=title;


    }
}
