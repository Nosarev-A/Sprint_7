import java.util.List;

public class OrderGenerator {
    public static Order getNewOrder(List<String> color){
        return new Order(
                "Artem",
                "Nosarev",
                "Ufa",
                3,
                "+7 999 888 88 88",
                5,
                "2020-11-11",
                "Samokat",
                color);
    }
}
