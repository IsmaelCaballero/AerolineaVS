package com.aerolineavs.tarifas;

/**
 * Datos de entrada de cliente para evaluar la tarifa.
 *
 * @param edad edad en años
 * @param vuelosAnuales frecuencia anual de vuelos
 * @param tipoViajero tipo de viajero
 * @param clasePreferida clase preferida para sus desplazamientos
 * @param destinoPreferido región de destino más habitual
 * @param ingresosAnuales disponibilidad financiera anual en euros
 * @param viajaConNinos indica si viaja con niños menores de 12 años
 * @param viveConPadres indica si vive con sus padres (aplica a joven trabajador)
 */
public record ClientePotencial(
        int edad,
        int vuelosAnuales,
        TipoViajero tipoViajero,
        ClaseVuelo clasePreferida,
        RegionDestino destinoPreferido,
        double ingresosAnuales,
        boolean viajaConNinos,
        boolean viveConPadres
) {
}
