package test;

import java.util.List;

import dao.RestaurantDaoImpl;
import metier.entities.Restaurant;

public class TestMetier {
    public static void main(String[] args) {
        RestaurantDaoImpl rdao = new RestaurantDaoImpl();
        
        
        // Recherche des restaurants par mot-clé
        List<Restaurant> restos = rdao.restaurantsParMC("Gourmet");
        for (Restaurant r : restos) {
            System.out.println(r);
        }
    }
}