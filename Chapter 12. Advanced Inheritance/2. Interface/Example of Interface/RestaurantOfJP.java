public class RestaurantOfJP implements RestaurantService {
    private String ownerName;
    private String address;
    private String phone;

    public Steak cookSteak (Steak s) {
        // A certain process adopted by this restaurant to cook the Steak
        return s;
    }

    public Soup cookSoup (Soup s) {
        // A certain process adopted by this restaurant to cook the Soup 
        return s;
    }

    public Rice cookRice (Rice r) {
        // A certain process adopted by this restaurant to cook the Rice 
        return r;
    }
}