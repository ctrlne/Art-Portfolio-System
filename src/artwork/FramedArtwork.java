/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artwork;

/**
 *
 * @author Claire Antonette
 */
public class FramedArtwork extends ArtworkDecorator {
    public FramedArtwork(Artwork artwork) {
        super(artwork);
    }

    @Override
    public void display() {
        decoratedArtwork.display();
        System.out.println("This artwork is displayed in a beautiful frame.");
    }
}
