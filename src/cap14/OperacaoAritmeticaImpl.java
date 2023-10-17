package cap14;

public class OperacaoAritmeticaImpl implements OperacaoAritmetica{
    @Override
    public double executar(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
