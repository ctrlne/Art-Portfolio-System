/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artwork;

/**
 *
 * @author Claire Antonette
 */
public class Sculpture extends Artwork {
    private String material;

    public Sculpture(String title, String artist, String material) {
        super(title, artist);
        this.material = material;
    }

    @Override
    public void display() {
        System.out.println("Sculpture: " + getTitle() + " by " + getArtist() + " (Material: " + material + ")");
    }
}
