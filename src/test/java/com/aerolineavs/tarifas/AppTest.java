package com.aerolineavs.tarifas;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void debeMostrarLaTarifaRecomendadaParaUnaEntradaValida() {
        InputStream originalInput = System.in;
        PrintStream originalOutput = System.out;
        ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
        String input = "17\n6\nMENOR\nTURISTA\nOTRA\n0\nn\ns\n";

        try (PrintStream output = new PrintStream(capturedOutput, true, StandardCharsets.UTF_8)) {
            System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
            System.setOut(output);

            App.main(new String[0]);
        } finally {
            System.setIn(originalInput);
            System.setOut(originalOutput);
        }

        String result = capturedOutput.toString(StandardCharsets.UTF_8);
        assertTrue(result.contains("Tarifa recomendada: Pajarillo"));
        assertTrue(result.contains("Descuento: 10%"));
    }
}