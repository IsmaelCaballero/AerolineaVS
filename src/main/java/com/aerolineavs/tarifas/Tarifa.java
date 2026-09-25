package com.aerolineavs.tarifas;

/**
 * Tarifas disponibles y su descuento asociado.
 */
public enum Tarifa {
    PAJARILLO("Pajarillo", 10),
    GORRION("Gorrión", 15),
    VIAJA_AHORA_QUE_PUEDES("Viaja ahora que puedes", 5),
    ATREVIENDOSE_A_SALTAR_DEL_NIDO("Atreviéndose a saltar del Nido", 25),
    CONOCE_EUROPA("Conoce Europa", 15),
    CONOCE_EUROPA_CON_TUS_PEQUES("Conoce Europa con tus peques", 10),
    CONOCE_EL_MUNDO("Conoce el Mundo", 20),
    CONOCE_EL_MUNDO_CON_TUS_PEQUES("Conoce el Mundo con tus peques", 10),
    SIN_TARIFA("Sin tarifa aplicable", 0);

    private final String nombre;
    private final int descuentoPorcentaje;

    Tarifa(String nombre, int descuentoPorcentaje) {
        this.nombre = nombre;
        this.descuentoPorcentaje = descuentoPorcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }
}
