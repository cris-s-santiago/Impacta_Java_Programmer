package cap13.TDD;

public class Celcius {

    public static double converterFarenheit(double grau) {
        return (grau * 1.8) + 32;
    }

    public static Double converterFarenheit(Double grau) {
        if (grau != null) {
            return (grau * 1.8) + 32;
        }
        return null;
    }
}
