package com.aerolineavs.tarifas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TarifaTest {

    @Test
    void debeExponerNombreYDescuentoParaCadaTarifa() {
        assertEquals("Pajarillo", Tarifa.PAJARILLO.getNombre());
        assertEquals(10, Tarifa.PAJARILLO.getDescuentoPorcentaje());
        assertEquals("Gorrión", Tarifa.GORRION.getNombre());
        assertEquals(15, Tarifa.GORRION.getDescuentoPorcentaje());
        assertEquals("Viaja ahora que puedes", Tarifa.VIAJA_AHORA_QUE_PUEDES.getNombre());
        assertEquals(5, Tarifa.VIAJA_AHORA_QUE_PUEDES.getDescuentoPorcentaje());
        assertEquals("Atreviéndose a saltar del Nido", Tarifa.ATREVIENDOSE_A_SALTAR_DEL_NIDO.getNombre());
        assertEquals(25, Tarifa.ATREVIENDOSE_A_SALTAR_DEL_NIDO.getDescuentoPorcentaje());
        assertEquals("Conoce Europa", Tarifa.CONOCE_EUROPA.getNombre());
        assertEquals(15, Tarifa.CONOCE_EUROPA.getDescuentoPorcentaje());
        assertEquals("Conoce Europa con tus peques", Tarifa.CONOCE_EUROPA_CON_TUS_PEQUES.getNombre());
        assertEquals(10, Tarifa.CONOCE_EUROPA_CON_TUS_PEQUES.getDescuentoPorcentaje());
        assertEquals("Conoce el Mundo", Tarifa.CONOCE_EL_MUNDO.getNombre());
        assertEquals(20, Tarifa.CONOCE_EL_MUNDO.getDescuentoPorcentaje());
        assertEquals("Conoce el Mundo con tus peques", Tarifa.CONOCE_EL_MUNDO_CON_TUS_PEQUES.getNombre());
        assertEquals(10, Tarifa.CONOCE_EL_MUNDO_CON_TUS_PEQUES.getDescuentoPorcentaje());
        assertEquals("Sin tarifa aplicable", Tarifa.SIN_TARIFA.getNombre());
        assertEquals(0, Tarifa.SIN_TARIFA.getDescuentoPorcentaje());
    }
}