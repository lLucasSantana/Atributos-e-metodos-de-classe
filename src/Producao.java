public class Producao {

    int previsaoDemanda = 200;
    int producaoNormal = 250;
    int estoqueInicial = 50;
    int estoqueFinal;

    public static void main(String[] args) {
        Producao obj = new Producao();

        obj.estoqueFinal = (obj.estoqueInicial + obj.producaoNormal) - obj.previsaoDemanda;
        System.out.print("O estoque final previsto para o mês é de: " + obj.estoqueFinal + " Unidades");
    }
}