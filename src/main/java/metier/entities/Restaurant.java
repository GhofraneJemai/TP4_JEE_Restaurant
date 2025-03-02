package metier.entities;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private Long idRestaurant;
    private String nomRestaurant;
    private String typeCuisine;
    private String adresse;

    public Restaurant() {
        super();
    }

    public Restaurant(String nomRestaurant, String typeCuisine, String adresse) {
        super();
        this.nomRestaurant = nomRestaurant;
        this.typeCuisine = typeCuisine;
        this.adresse = adresse;
    }

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
    }

    public String getTypeCuisine() {
        return typeCuisine;
    }

    public void setTypeCuisine(String typeCuisine) {
        this.typeCuisine = typeCuisine;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Restaurant [idRestaurant=" + idRestaurant + ", nomRestaurant=" + nomRestaurant + 
               ", typeCuisine=" + typeCuisine + ", adresse=" + adresse + "]";
    }
}
