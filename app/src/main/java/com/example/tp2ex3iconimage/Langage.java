package com.example.tp2ex3iconimage;

public class Langage {
    private String name ;
    private String code;
    private int image;

    public Langage(String name , String code , int image){
        this.name = name;
        this.code = code ;
        this.image = image;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public int getImage() {return image;}
    public void setImage(int image) {this.image = image;}
}
