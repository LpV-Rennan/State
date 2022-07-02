public class Atrasado extends VooEstado{
    private Atrasado(){};
    private static Atrasado instance = new Atrasado();
    public static Atrasado getInstance(){return instance;};

    @Override
    public boolean confirmar(Voo voo) {
        voo.setEstado(Confirmado.getInstance());
        return true;
    }
    @Override
    public boolean cancelar(Voo voo) {
        voo.setEstado(Cancelado.getInstance());
        return true;
    }
}
