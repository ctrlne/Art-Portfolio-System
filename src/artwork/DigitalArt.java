/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artwork;

/**
 *
 * @author Claire Antonette
 */
public class DigitalArt extends Artwork {
    private String software;

    public DigitalArt(String title, String artist, String software) {
        super(title, artist);
        this.software = software;
    }

    @Override
    public void display() {
        System.out.println("Digital Art: " + getTitle() + " by " + getArtist() + " (Created with: " + software + ")");
    }
}
