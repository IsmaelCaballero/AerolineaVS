package com.aerolineavs.application.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import com.aerolineavs.tarifas.ClaseVuelo;
import com.aerolineavs.tarifas.ClientePotencial;
import com.aerolineavs.tarifas.RegionDestino;
import com.aerolineavs.tarifas.Tarifa;
import com.aerolineavs.tarifas.TipoViajero;

public class EvaluadorTarifasServiceTest {

    @Test
    void debeDevolverElResultadoDelCasoDeUso() {
        ClientePotencial cliente = new ClientePotencial(
                17, 6, TipoViajero.MENOR, ClaseVuelo.TURISTA, RegionDestino.OTRA, 0, false, true
        );

        var resultado = new EvaluadorTarifasService().evaluar(cliente);

        assertEquals(Tarifa.PAJARILLO, resultado.tarifa());
        assertFalse(resultado.suposiciones().isBlank());
    }
}