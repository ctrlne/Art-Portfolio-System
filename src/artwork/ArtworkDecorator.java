/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artwork;

/**
 *
 * @author Claire Antonette
 */
public abstract class ArtworkDecorator extends Artwork {
    protected Artwork decoratedArtwork;

    public ArtworkDecorator(Artwork artwork) {
        super(artwork.getTitle(), artwork.getArtist());
        this.decoratedArtwork = artwork;
    }
}