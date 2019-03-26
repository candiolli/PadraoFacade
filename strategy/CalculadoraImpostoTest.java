public class CalculadoraImpostoTest {

    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        IRPF irpf = new IRPF();
        INSS inss = new INSS();
        IRPJ irpj = new IRPJ();

        double valor  = 100.0;
        double calcIrpf = calculadora.calcular(irpf, valor);
        double calcIrpj = calculadora.calcular(irpj, valor);
        double calcInss = calculadora.calcular(inss, valor);

        System.out.println(valor - calcInss - calcIrpf - calcIrpj);
    }
}
