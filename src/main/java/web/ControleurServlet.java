package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import dao.IRestaurantDao;
import dao.RestaurantDaoImpl;
import metier.entities.Restaurant;

@WebServlet(name = "cs", urlPatterns = { "/controleur", "*.do" })
public class ControleurServlet extends HttpServlet {

    IRestaurantDao metier;

    @Override
    public void init() throws ServletException {
        metier = new RestaurantDaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = request.getServletPath();
        if (path.equals("/index.do")) {
            request.getRequestDispatcher("restaurants.jsp").forward(request, response);
        }
        else if (path.equals("/chercher.do")) {
            String motCle = request.getParameter("motCle");
            RestaurantModele model = new RestaurantModele();
            model.setMotCle(motCle);
            List<Restaurant> restos = metier.restaurantsParMC(motCle);
            model.setRestaurants(restos);
            request.setAttribute("model", model);
            request.getRequestDispatcher("restaurants.jsp").forward(request, response);
        }
        else if (path.equals("/saisie.do")) {
            request.getRequestDispatcher("saisieRestaurant.jsp").forward(request, response);
        }
        else if (path.equals("/save.do") && request.getMethod().equals("POST")) {
            String nom = request.getParameter("nomRestaurant");
            String typeCuisine = request.getParameter("typeCuisine");
            String adresse = request.getParameter("adresse");
            Double note = Double.parseDouble(request.getParameter("note")); // Récupération de la note
            Restaurant r = metier.save(new Restaurant(nom, typeCuisine, adresse, note)); // Création avec la note
            request.setAttribute("restaurant", r);
            response.sendRedirect("chercher.do?motCle=");
        }
        else if (path.equals("/supprimer.do")) {
            Long id = Long.parseLong(request.getParameter("id"));
            metier.deleteRestaurant(id);
            response.sendRedirect("chercher.do?motCle=");
        }
        else if (path.equals("/editer.do")) {
            Long id = Long.parseLong(request.getParameter("id"));
            Restaurant r = metier.getRestaurant(id);
            request.setAttribute("restaurant", r);
            request.getRequestDispatcher("editerRestaurant.jsp").forward(request, response);
        }
        else if (path.equals("/update.do")) {
            Long id = Long.parseLong(request.getParameter("id"));
            String nom = request.getParameter("nomRestaurant");
            String typeCuisine = request.getParameter("typeCuisine");
            String adresse = request.getParameter("adresse");
            Double note = Double.parseDouble(request.getParameter("note")); // Récupération de la note
            Restaurant r = new Restaurant();
            r.setIdRestaurant(id);
            r.setNomRestaurant(nom);
            r.setTypeCuisine(typeCuisine);
            r.setAdresse(adresse);
            r.setNote(note); // Ajout de la note
            metier.updateRestaurant(r);
            request.setAttribute("restaurant", r);
            response.sendRedirect("chercher.do?motCle=");
        }
        else {
            response.sendError(Response.SC_NOT_FOUND);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}