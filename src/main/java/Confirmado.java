public class Confirmado extends VooEstado{
    private Confirmado(){};
    private static Confirmado instance = new Confirmado();
    public static Confirmado getInstance() {return instance;};

    @Override
    public boolean embarcar(Voo voo) {
        voo.setEstado(Embarque.getInstance());
        return true;
    }
}
