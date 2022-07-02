public class Voo {
    private VooEstado estado;

    public VooEstado getEstado() {
        return estado;
    }

    public Voo() {
        this.estado = Programado.getInstance();
    }

    public void setEstado(VooEstado estado) { this.estado = estado;}

    public boolean atrasar() { return estado.atrasar(this); }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean embarcar() {
        return estado.embarcar(this);
    }

    public boolean programar() {
        return estado.programar(this);
    }
}