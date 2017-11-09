package is.hi.foodbar.services;

import is.hi.foodbar.model.Restaurants;
import is.hi.foodbar.model.Type;
import java.util.List;

/**
 * Þjónusta sem tengir við gagnagrunninn
 *
 * @author Brynja Pálína Sigurgreisdóttir, bps5@hi.is
 * @author Elvar Kjartansson, elk11@hi.is
 * @date október 2017
 * HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 */
public interface RestaurantsService {

    /**
     * Bætir við restaurant í restaurantRep
     *
     * @param r Veitingastaðurinn sem bætt er við restaurantRep
     */
    void addRestaurant(Restaurants r);

    /**
     * Bætir við tegund t fyrir veitingastað r
     * @param t tegund sem bætt er við
     * @param r veitingastað r
     */
    void addType(Type t, Restaurants r);

    /**
     * Skilar öllum restaurants í restaurantsRep
     *
     * @return listi af restaurants
     */
    List<Restaurants> allRestaurants();

    /**
     * Finnur fyrsta veitingastað sem inniheldur það sem leitað er að í nafninu
     *
     * @param name sem leitað er að
     * @return veitingastaður sem passar við nafnið
     */
    Restaurants findRestaurant(String name);
/*
    /**
     * ónotað, óþarft?
     *
     * @param restaurants
     * @return
     *//*
    Restaurants save(Restaurants restaurants);
*/
    /**
     * Leitar í gagnagrunn að nafni sem notandi slær inn.
     *
     * @param restaurant Strengurinn sem notandi sló inn
     * @return listi af veitingastöðum sem hafa nafn sem passar við það sem notandi leitaði að
     */
    List<Restaurants> findAllMatches(Restaurants restaurant);

    boolean erALifi();
}