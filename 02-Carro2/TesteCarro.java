public class TesteCarro {
    public static void main(String[] args) {
        // Construtor padrão
        Carro c1 = new Carro();
        c1.modelo = "Ford Ranger";
        c1.ano = "2026";

        // Construtor com um parâmetro
        Carro c2 = new Carro("Fusca", "2028");

        // Construtor com dois parâmetros
        Carro c3 = new Carro("Renegade", "2026");

        // Objeto
        System.out.println("Modelo: " + c1.modelo + " / Ano: " + c1.ano + " / ");
        System.out.println("Modelo: " + c2.modelo + " / Ano: " + c2.ano + " / ");
        System.out.println("Modelo: " + c3.modelo + " / Ano: " + c3.ano + " / ");
    }
}
