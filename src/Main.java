
public class Main {
    public static void main(String[] args) {

        Tortuga tortugillo = new Tortuga("Carlos");
        Tortuga tortillo = new Tortuga("Tortuga Blanca");
        Tortuga tortin = new Tortuga("Franco");

        Tortuga lista[] = new Tortuga[3];

        lista[0] = tortillo;
        lista[1] = tortugillo;
        lista[2] = tortin;

        Tortuguero tortuguero = new Tortuguero("Variedad de tortugas marinas");
        tortuguero.setLista(lista);

        tortuguero.nombreTortugas();

    }
}