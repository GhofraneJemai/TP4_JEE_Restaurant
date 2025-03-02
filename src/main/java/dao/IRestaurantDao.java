package dao;

import java.util.List;
import metier.entities.Restaurant;

public interface IRestaurantDao {
    public Restaurant save(Restaurant r);  // Méthode pour enregistrer un restaurant

    public List<Restaurant> restaurantsParMC(String mc);  // Recherche des restaurants par mot-clé

    public Restaurant getRestaurant(Long id);  // Récupère un restaurant par son ID

    public Restaurant updateRestaurant(Restaurant r);  // Mise à jour d'un restaurant

    public void deleteRestaurant(Long id);  // Suppression d'un restaurant
}
