package com.aerolineavs.presentation.gui;

import com.aerolineavs.application.port.in.EvaluarTarifaUseCase;
import com.aerolineavs.tarifas.ClientePotencial;
import com.aerolineavs.tarifas.ResultadoTarifa;

/** Controlador que traduce acciones de la vista en llamadas al caso de uso. */
public final class TarifaController {

    private final EvaluarTarifaUseCase evaluarTarifa;
    private final TarifaView view;

    public TarifaController(EvaluarTarifaUseCase evaluarTarifa, TarifaView view) {
        this.evaluarTarifa = evaluarTarifa;
        this.view = view;
        view.evaluar().setOnAction(evento -> evaluar());
    }

    private void evaluar() {
        try {
            int edad = entero(view.edad().getText(), "edad");
            int vuelos = entero(view.vuelosAnuales().getText(), "vuelos anuales");
            double ingresos = decimal(view.ingresosAnuales().getText(), "ingresos anuales");
            if (edad < 0 || vuelos < 0 || ingresos < 0) {
                throw new IllegalArgumentException("Los valores numéricos no pueden ser negativos.");
            }

            ClientePotencial cliente = new ClientePotencial(
                    edad,
                    vuelos,
                    view.tipoViajero().getValue(),
                    view.clasePreferida().getValue(),
                    view.destinoPreferido().getValue(),
                    ingresos,
                    view.viajaConNinos().isSelected(),
                    view.viveConPadres().isSelected()
            );
            ResultadoTarifa resultado = evaluarTarifa.evaluar(cliente);
            view.mostrarResultado("Tarifa: " + resultado.tarifa().getNombre()
                    + "\nDescuento: " + resultado.tarifa().getDescuentoPorcentaje() + "%"
                    + "\n" + resultado.suposiciones());
        } catch (IllegalArgumentException | NullPointerException error) {
            view.mostrarResultado("Entrada no válida: " + error.getMessage());
        }
    }

    private static int entero(String texto, String campo) {
        try {
            return Integer.parseInt(texto.trim());
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException("Indique un valor entero para " + campo + ".", error);
        }
    }

    private static double decimal(String texto, String campo) {
        try {
            return Double.parseDouble(texto.trim());
        } catch (NumberFormatException error) {
            throw new IllegalArgumentException("Indique un número válido para " + campo + ".", error);
        }
    }
}