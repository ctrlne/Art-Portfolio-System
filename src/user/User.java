/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author Claire Antonette
 */
import gallery.Observer;
import gallery.Portfolio;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    public void viewPortfolio(Portfolio portfolio) {
        System.out.println(name + " is viewing the portfolio:");
        portfolio.displayAllArtworks();
    }
}