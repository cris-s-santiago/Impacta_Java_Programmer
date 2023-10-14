package cap13.TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversorDeGrauTeste {

    @Test
    void validarTemperatura(){
        //18 == 64,4
        double farenheitt = Celcius.converterFarenheit(18);

        Assertions.assertTrue(farenheitt == 64.4);
    }

    @Test
    void validarTemperaturaNula(){
        //18 == 64,4
        Double graus = null;
        Double farenheitt = Celcius.converterFarenheit(graus);
        Assertions.assertNull(graus);
        Assertions.assertNull(farenheitt);
    }
}
