public class CourierGenerator {

    public static Courier getNewValidCourier() {
        return new Courier("nosarev", "nosarev1234", "Artem");
    }

    public static Courier getCourierWithExistingLogin() {
        return new Courier("nosarev", "4321nosarev", "Kirill");
    }

    public static Courier getCourierWithoutLogin(){
        return new Courier(null, "nosarev1234", "Artem");
    }

    public static Courier getCourierWithoutPassword(){
        return new Courier("nosarev", null, "Artem");
    }

    public static Courier getCourierWithoutName(){
        return new Courier("nosarev", "nosarev1234", null);
    }

}
