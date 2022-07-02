public class Embarque extends VooEstado{
    private Embarque(){};
    private static Embarque instance = new Embarque();
    public static  Embarque getInstance() {return instance;};
}
