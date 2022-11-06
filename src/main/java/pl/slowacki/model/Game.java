package pl.slowacki.model;

import java.util.Date;

public class Game {
    private String name;
    private String description;
    private DeveloperOrPublisher developer;
    private DeveloperOrPublisher publisher;
    private String tag;
    private Review[] reviews;
    private Date dateOfPublication;
    private double price;
    private double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeveloperOrPublisher getDeveloper() {
        return developer;
    }

    public void setDeveloper(DeveloperOrPublisher developer) {
        this.developer = developer;
    }

    public DeveloperOrPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(DeveloperOrPublisher publisher) {
        this.publisher = publisher;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
