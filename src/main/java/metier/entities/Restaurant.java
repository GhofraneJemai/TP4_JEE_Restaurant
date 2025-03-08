package metier.entities;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private Long idRestaurant;
    private String nomRestaurant;
    private String typeCuisine;
    private String adresse;
    private Double note; // Ajout de l'attribut note

    public Restaurant() {
        super();
    }

    public Restaurant(String nomRestaurant, String typeCuisine, String adresse, Double note) {
        super();
        this.nomRestaurant = nomRestaurant;
        this.typeCuisine = typeCuisine;
        this.adresse = adresse;
        this.note = note; // Initialisation de l'attribut note
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

    public Double getNote() {
        return note; // Getter pour l'attribut note
    }

    public void setNote(Double note) {
        this.note = note; // Setter pour l'attribut note
    }

    @Override
    public String toString() {
        return "Restaurant [idRestaurant=" + idRestaurant + ", nomRestaurant=" + nomRestaurant + 
               ", typeCuisine=" + typeCuisine + ", adresse=" + adresse + ", note=" + note + "]";
    }
}
