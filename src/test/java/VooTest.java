import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {
    Voo voo;

    @BeforeEach
    void setUp() {
        voo = new Voo();
    }

    //Programado
    @Test
    void deveRetornarTrueCanceladoProgramado() {
        assertTrue(voo.cancelar());
        assertEquals(Cancelado.getInstance(), voo.getEstado());
    }

    @Test
    void deveRetornarTrueConfirmadoProgramado() {
        assertTrue(voo.confirmar());
        assertEquals(Confirmado.getInstance(), voo.getEstado());
    }

    @Test
    void deveRetornarTrueAtrasadoProgramado() {
        assertTrue(voo.atrasar());
        assertEquals(Atrasado.getInstance(), voo.getEstado());
    }

    @Test
    void deveRetornarFalseEmbarqueProgramado() {
        assertFalse(voo.embarcar());
    }

    @Test
    void deveRetornarFalseProgramarProgramado() {
        assertFalse(voo.programar());
    }

    //Cancelado
    @Test
    void deveRetornarFalseEmbarqueCancelado() {
        voo.setEstado(Cancelado.getInstance());
        assertFalse(voo.embarcar());
    }
    @Test
    void deveRetornarFalseAtrasadoCancelado() {
        voo.setEstado(Cancelado.getInstance());
        assertFalse(voo.atrasar());
    }
    @Test
    void deveRetornarFalseCanceladoCancelado() {
        voo.setEstado(Cancelado.getInstance());
        assertFalse(voo.cancelar());
    }
    @Test
    void deveRetornarFalseConfirmadoCancelado() {
        voo.setEstado(Cancelado.getInstance());
        assertFalse(voo.confirmar());
    }
    @Test
    void deveRetornarFalseProgramadoCancelado() {
        voo.setEstado(Cancelado.getInstance());
        assertFalse(voo.programar());
    }

    //Embarque
    @Test
    void deveRetornarFalseEmbarqueEmbarque() {
        voo.setEstado(Embarque.getInstance());
        assertFalse(voo.embarcar());
    }
    @Test
    void deveRetornarFalseAtrasadoEmbarque() {
        voo.setEstado(Embarque.getInstance());
        assertFalse(voo.atrasar());
    }
    @Test
    void deveRetornarFalseCanceladoEmbarque() {
        voo.setEstado(Embarque.getInstance());
        assertFalse(voo.cancelar());
    }
    @Test
    void deveRetornarFalseConfirmadoEmbarque() {
        voo.setEstado(Embarque.getInstance());
        assertFalse(voo.confirmar());
    }
    @Test
    void deveRetornarFalseProgramadoEmbarque() {
        voo.setEstado(Embarque.getInstance());
        assertFalse(voo.programar());
    }

    //Atrasado
    @Test
    void deveRetornarFalseProgramadoAtrasado() {
        voo.setEstado(Atrasado.getInstance());
        assertFalse(voo.programar());
    }
    @Test
    void deveRetornarFalseEmbarqueAtrasado() {
        voo.setEstado(Atrasado.getInstance());
        assertFalse(voo.embarcar());
    }
    @Test
    void deveRetornarFalseAtrasadoAtrasado() {
        voo.setEstado(Atrasado.getInstance());
        assertFalse(voo.atrasar());
    }
    @Test
    void deveRetornarTrueCanceladoAtrasado() {
        voo.setEstado(Atrasado.getInstance());
        assertTrue(voo.cancelar());
        assertEquals(Cancelado.getInstance(), voo.getEstado());
    }
    @Test
    void deveRetornarTrueConfirmadoAtrasado() {
        voo.setEstado(Atrasado.getInstance());
        assertTrue(voo.confirmar());
        assertEquals(Confirmado.getInstance(), voo.getEstado());
    }

    //Confirmado
    @Test
    void deveRetornarTrueEmbarqueConfirmado() {
        voo.setEstado(Confirmado.getInstance());
        assertTrue(voo.embarcar());
        assertEquals(Embarque.getInstance(), voo.getEstado());
    }
    @Test
    void deveRetornarFalseAtrasadoConfirmado() {
        voo.setEstado(Confirmado.getInstance());
        assertFalse(voo.atrasar());
    }
    @Test
    void deveRetornarFalseCanceladoConfirmado() {
        voo.setEstado(Confirmado.getInstance());
        assertFalse(voo.cancelar());
    }
    @Test
    void deveRetornarFalseConfirmadoConfirmado() {
        voo.setEstado(Confirmado.getInstance());
        assertFalse(voo.confirmar());
    }
    @Test
    void deveRetornarFalseProgramadoConfirmado() {
        voo.setEstado(Confirmado.getInstance());
        assertFalse(voo.programar());
    }

}