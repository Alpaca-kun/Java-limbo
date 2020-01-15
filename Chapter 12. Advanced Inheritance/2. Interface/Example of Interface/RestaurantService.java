/**
 * Interface seems like a "Menu" of a restaurant
 * You have many options of dishes (methods) to choice, but you don't have idea 
 * of how these dishes are prepared (these processes are abstract to us)
 * 
 * 
 */
public interface RestaurantService {
    Steak cookSteak(Steak s);
    Soup cookSoup(Soup s);
    Rice cookRice(Rice r);
}