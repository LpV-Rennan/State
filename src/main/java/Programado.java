public class Programado extends VooEstado {
    private Programado(){};
    private static Programado instance = new Programado();
    public static Programado getInstance() {return instance;};

    @Override
    public boolean confirmar(Voo voo) {
        voo.setEstado(Confirmado.getInstance());
        return true;
    }

    @Override
    public boolean atrasar(Voo voo) {
        voo.setEstado(Atrasado.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Voo voo) {
        voo.setEstado(Cancelado.getInstance());
        return true;
    }
}
