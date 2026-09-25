package com.aerolineavs.application.service;

import com.aerolineavs.application.port.in.EvaluarTarifaUseCase;
import com.aerolineavs.tarifas.ClientePotencial;
import com.aerolineavs.tarifas.EvaluadorTarifas;
import com.aerolineavs.tarifas.ResultadoTarifa;

/** Implementación del caso de uso de evaluación de tarifas. */
public final class EvaluadorTarifasService implements EvaluarTarifaUseCase {

    @Override
    public ResultadoTarifa evaluar(ClientePotencial cliente) {
        return EvaluadorTarifas.evaluar(cliente);
    }
}