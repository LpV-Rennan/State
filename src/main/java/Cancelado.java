public class Cancelado extends VooEstado{
    private Cancelado(){};
    private static Cancelado instance = new Cancelado();
    public static VooEstado getInstance() {
        return instance;
    }
}
