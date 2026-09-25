package com.aerolineavs.application.port.in;

import com.aerolineavs.tarifas.ClientePotencial;
import com.aerolineavs.tarifas.ResultadoTarifa;

/** Caso de uso para evaluar la tarifa de un cliente potencial. */
public interface EvaluarTarifaUseCase {

    ResultadoTarifa evaluar(ClientePotencial cliente);
}