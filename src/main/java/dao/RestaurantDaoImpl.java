package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.entities.Restaurant;

public class RestaurantDaoImpl implements IRestaurantDao {

    @Override
    public Restaurant save(Restaurant r) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO RESTAURANTS(NOM_RESTAURANT, TYPE_CUISINE, ADRESSE) VALUES(?, ?, ?)");
            ps.setString(1, r.getNomRestaurant());
            ps.setString(2, r.getTypeCuisine());
            ps.setString(3, r.getAdresse());
            ps.executeUpdate();
            
            // Récupération de l'ID généré
            PreparedStatement ps2 = conn.prepareStatement("SELECT MAX(ID_RESTAURANT) as MAX_ID FROM RESTAURANTS");
            ResultSet rs = ps2.executeQuery();
            if (rs.next()) {
                r.setIdRestaurant(rs.getLong("MAX_ID"));
            }
            ps.close();
            ps2.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public List<Restaurant> restaurantsParMC(String mc) {
        List<Restaurant> restaurants = new ArrayList<>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM RESTAURANTS WHERE NOM_RESTAURANT LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Restaurant r = new Restaurant();
                r.setIdRestaurant(rs.getLong("ID_RESTAURANT"));
                r.setNomRestaurant(rs.getString("NOM_RESTAURANT"));
                r.setTypeCuisine(rs.getString("TYPE_CUISINE"));
                r.setAdresse(rs.getString("ADRESSE"));
                restaurants.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return restaurants;
    }

    @Override
    public Restaurant getRestaurant(Long id) {
        Connection conn = SingletonConnection.getConnection();
        Restaurant r = new Restaurant();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM RESTAURANTS WHERE ID_RESTAURANT = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                r.setIdRestaurant(rs.getLong("ID_RESTAURANT"));
                r.setNomRestaurant(rs.getString("NOM_RESTAURANT"));
                r.setTypeCuisine(rs.getString("TYPE_CUISINE"));
                r.setAdresse(rs.getString("ADRESSE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant r) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE RESTAURANTS SET NOM_RESTAURANT = ?, TYPE_CUISINE = ?, ADRESSE = ? WHERE ID_RESTAURANT = ?");
            ps.setString(1, r.getNomRestaurant());
            ps.setString(2, r.getTypeCuisine());
            ps.setString(3, r.getAdresse());
            ps.setLong(4, r.getIdRestaurant());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void deleteRestaurant(Long id) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM RESTAURANTS WHERE ID_RESTAURANT = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
