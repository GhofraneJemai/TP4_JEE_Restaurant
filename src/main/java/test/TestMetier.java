package test;

import java.util.List;

import dao.RestaurantDaoImpl;
import metier.entities.Restaurant;

public class TestMetier {
    public static void main(String[] args) {
        RestaurantDaoImpl rdao = new RestaurantDaoImpl();
        
        // Création d'un nouveau restaurant
        Restaurant resto = rdao.save(new Restaurant("Le Gourmet", "Cuisine Française", "123 Rue de Paris"));
        System.out.println(resto);
        
        // Recherche des restaurants par mot-clé
        List<Restaurant> restos = rdao.restaurantsParMC("Gourmet");
        for (Restaurant r : restos) {
            System.out.println(r);
        }
    }
}