package pl.slowacki.model;

import java.util.Date;

public class User {
    private String name;
    private String[] library;
    private Date dateOfRegistration;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLibrary() {
        return library;
    }

    public void setLibrary(String[] library) {
        this.library = library;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
