package com.example.cardview.model;

public class Post {
    private String name;
    private String post;
    //It's the image, because on Adapter Class, R.drawable.(the image name) is a int value
    private int image;

    public Post(String name, String post, int image) {
        this.name = name;
        this.post = post;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
