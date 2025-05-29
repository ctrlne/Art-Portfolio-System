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
import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List<Artwork> artworks = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
        notifyObservers("New artwork added: " + artwork.getTitle());
    }

    public void displayAllArtworks() {
        for (Artwork artwork : artworks) {
            artwork.display();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public List<Artwork> getArtworks() {
    return artworks;
}
}