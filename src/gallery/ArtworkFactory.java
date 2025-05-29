/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallery;

/**
 *
 * @author Claire Antonette
 */
import artwork.Artwork;
import artwork.Painting;
import artwork.Sculpture;
import artwork.DigitalArt;

public class ArtworkFactory {
    public static Artwork createArtwork(String type, String title, String artist, String additionalInfo) {
        switch (type.toLowerCase()) {
            case "painting":
                return new Painting(title, artist, additionalInfo);
            case "sculpture":
                return new Sculpture(title, artist, additionalInfo);
            case "digitalart":
                return new DigitalArt(title, artist, additionalInfo);
            default:
                return null;
        }
    }
}
