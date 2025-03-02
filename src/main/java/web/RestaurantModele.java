package web;

import java.util.ArrayList;
import java.util.List;
import metier.entities.Restaurant;

public class RestaurantModele {
    private String motCle;
    List<Restaurant> restaurants = new ArrayList<>();
    
    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
