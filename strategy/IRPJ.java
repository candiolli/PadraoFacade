public class IRPJ implements Imposto {

    @Override
    public double calcular(double valor) {
        return valor * 0.03;
    }

}
