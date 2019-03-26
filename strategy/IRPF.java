public class IRPF implements Imposto {

    @Override
    public double calcular(double valor) {
        return valor * 0.16;
    }

}
