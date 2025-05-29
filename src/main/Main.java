/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Claire Antonette
 */
import collection.ArtCollection;
import artwork.Artwork;
import artwork.FramedArtwork;
import gallery.ArtworkFactory;
import gallery.Portfolio;
import user.User;

public class Main {
    public static void main(String[] args) {
        // Create an ArtCollection
        ArtCollection artCollection = new ArtCollection();

        // Create two portfolios
        Portfolio portfolio1 = new Portfolio();
        Portfolio portfolio2 = new Portfolio();

        // Create users and add them as observers
        User user1 = new User("Claire");
        User user2 = new User("Liam");
        portfolio1.addObserver(user1);
        portfolio2.addObserver(user2);

        // Add artworks using the factory pattern
        Artwork painting = ArtworkFactory.createArtwork("painting", "Starry Night", "Vincent Van Gogh", "Oil on canvas");
        Artwork sculpture = ArtworkFactory.createArtwork("sculpture", "David", "Michelangelo", "Marble");
        Artwork digitalArt = ArtworkFactory.createArtwork("digitalart", "Sunset Landscape", "Alice Doe", "Adobe Photoshop");

        // Add artworks to portfolios
        portfolio1.addArtwork(painting);
        portfolio1.addArtwork(new FramedArtwork(sculpture)); //decorator pattern
        portfolio2.addArtwork(digitalArt);

        // Add portfolios to the ArtCollection
        artCollection.addPortfolio(portfolio1);
        artCollection.addPortfolio(portfolio2);

        // Display all artworks in the ArtCollection
        System.out.println("Displaying all portfolios in the ArtCollection:");
        artCollection.displayAllPortfolios();

        // Search for an artwork by title
        String searchTitle = "Starry Night";
        Artwork foundArtwork = artCollection.findArtworkByTitle(searchTitle);
        if (foundArtwork != null) {
            System.out.println("Found artwork: " + foundArtwork.getTitle() + " by " + foundArtwork.getArtist());
        } else {
            System.out.println("Artwork titled '" + searchTitle + "' not found in the collection.");
        }
    }
}

