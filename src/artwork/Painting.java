/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artwork;

/**
 *
 * @author Claire Antonette
 */
public class Painting extends Artwork {
    private String medium;

    public Painting(String title, String artist, String medium) {
        super(title, artist);
        this.medium = medium;
    }

    @Override
    public void display() {
        System.out.println("Painting: " + getTitle() + " by " + getArtist() + " (" + medium + ")");
    }
}
