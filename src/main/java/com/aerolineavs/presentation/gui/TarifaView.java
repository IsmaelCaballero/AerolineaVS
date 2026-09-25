package com.aerolineavs.presentation.gui;

import com.aerolineavs.tarifas.ClaseVuelo;
import com.aerolineavs.tarifas.RegionDestino;
import com.aerolineavs.tarifas.TipoViajero;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/** Vista JavaFX sin conocimiento del servicio de aplicación. */
public final class TarifaView extends BorderPane {

    private final TextField edad = new TextField();
    private final TextField vuelosAnuales = new TextField();
    private final ComboBox<TipoViajero> tipoViajero = new ComboBox<>();
    private final ComboBox<ClaseVuelo> clasePreferida = new ComboBox<>();
    private final ComboBox<RegionDestino> destinoPreferido = new ComboBox<>();
    private final TextField ingresosAnuales = new TextField();
    private final CheckBox viajaConNinos = new CheckBox("Viaja con niños menores de 12 años");
    private final CheckBox viveConPadres = new CheckBox("Vive con sus padres");
    private final Button evaluar = new Button("Evaluar tarifa");
    private final Label resultado = new Label();

    public TarifaView() {
        setPadding(new Insets(24));

        tipoViajero.getItems().setAll(TipoViajero.values());
        clasePreferida.getItems().setAll(ClaseVuelo.values());
        destinoPreferido.getItems().setAll(RegionDestino.values());
        tipoViajero.getSelectionModel().select(TipoViajero.GENERAL);
        clasePreferida.getSelectionModel().select(ClaseVuelo.TURISTA);
        destinoPreferido.getSelectionModel().select(RegionDestino.OTRA);

        GridPane formulario = new GridPane();
        formulario.setHgap(12);
        formulario.setVgap(10);
        formulario.addRow(0, new Label("Edad"), edad);
        formulario.addRow(1, new Label("Vuelos anuales"), vuelosAnuales);
        formulario.addRow(2, new Label("Tipo de viajero"), tipoViajero);
        formulario.addRow(3, new Label("Clase preferida"), clasePreferida);
        formulario.addRow(4, new Label("Destino preferido"), destinoPreferido);
        formulario.addRow(5, new Label("Ingresos anuales (€)"), ingresosAnuales);

        VBox opciones = new VBox(10, viajaConNinos, viveConPadres);
        VBox contenido = new VBox(18, new Label("Evaluador de tarifas"), formulario,
                opciones, evaluar, resultado);
        setCenter(contenido);
    }

    TextField edad() {
        return edad;
    }

    TextField vuelosAnuales() {
        return vuelosAnuales;
    }

    ComboBox<TipoViajero> tipoViajero() {
        return tipoViajero;
    }

    ComboBox<ClaseVuelo> clasePreferida() {
        return clasePreferida;
    }

    ComboBox<RegionDestino> destinoPreferido() {
        return destinoPreferido;
    }

    TextField ingresosAnuales() {
        return ingresosAnuales;
    }

    CheckBox viajaConNinos() {
        return viajaConNinos;
    }

    CheckBox viveConPadres() {
        return viveConPadres;
    }

    Button evaluar() {
        return evaluar;
    }

    void mostrarResultado(String texto) {
        resultado.setText(texto);
    }
}