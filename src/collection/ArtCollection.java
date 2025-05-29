/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 *
 * @author FerrerFam
 */
import gallery.Portfolio;
import artwork.Artwork;
import java.util.ArrayList;
import java.util.List;

public class ArtCollection {
    private List<Portfolio> portfolios = new ArrayList<>();

    // Adds a portfolio to the collection
    public void addPortfolio(Portfolio portfolio) {
        portfolios.add(portfolio);
    }

    // Removes a portfolio from the collection
    public void removePortfolio(Portfolio portfolio) {
        portfolios.remove(portfolio);
    }

    // Finds an artwork by title across all portfolios
    public Artwork findArtworkByTitle(String title) {
        for (Portfolio portfolio : portfolios) {
            for (Artwork artwork : portfolio.getArtworks()) {
                if (artwork.getTitle().equalsIgnoreCase(title)) {
                    return artwork;
                }
            }
        }
        return null; // if artwork not found
    }

    // Displays all portfolios and their artworks
    public void displayAllPortfolios() {
        for (Portfolio portfolio : portfolios) {
            System.out.println("Portfolio:");
            portfolio.displayAllArtworks();
            System.out.println(); // For spacing between portfolios
        }
    }
}