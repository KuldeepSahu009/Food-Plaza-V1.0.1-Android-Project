package com.rafale.studio.V1.foodplaza.Domains;

public class CategoryDomain {

    private String title;
    private String pic;

    //Constructor(All)
    public CategoryDomain(String title, String pic) {
        this.title = title;
        this.pic = pic;
    }

    //Getter and Setter(All)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

}//End
