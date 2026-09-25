package com.aerolineavs.presentation.gui;

import com.aerolineavs.application.port.in.EvaluarTarifaUseCase;
import com.aerolineavs.application.service.EvaluadorTarifasService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Punto de composición y entrada de la aplicación JavaFX. */
public final class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        EvaluarTarifaUseCase evaluarTarifa = new EvaluadorTarifasService();
        TarifaView view = new TarifaView();
        new TarifaController(evaluarTarifa, view);

        stage.setTitle("Evaluador de tarifas");
        stage.setScene(new Scene(view, 620, 520));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}