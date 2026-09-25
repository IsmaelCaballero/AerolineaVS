package com.aerolineavs.tarifas;

/**
 * Resultado de la evaluación de tarifa.
 *
 * @param tarifa tarifa aplicable
 * @param suposiciones resumen de suposiciones usadas en reglas
 */
public record ResultadoTarifa(Tarifa tarifa, String suposiciones) {
}
