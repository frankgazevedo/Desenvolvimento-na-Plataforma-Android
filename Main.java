import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        Motor motor01 = new Motor("a320", 50.0f);
        Motor motor02 = new Motor("b737", 50.0f);
        ArrayList<Passageiro> ListaPassageiros = new ArrayList<>();
        Passageiro passenger1 = new Passageiro("Frank", "Azevedo", "111.222.333-44");
        Passageiro passenger2 = new Passageiro("Francisco", "Azevedo", "222.333.444-55");
        Passageiro passenger3 = new Passageiro("Adria", "Azevedo", "333.444.555-66");
        Passageiro passenger4 = new Passageiro("Monica", "Azevedo", "444.555.666-77");
        Passageiro passenger5 = new Passageiro("Josy", "Azevedo", "555.666.777-88");

        ListaPassageiros.add(passenger1);
        ListaPassageiros.add(passenger2);
        ListaPassageiros.add(passenger3);
        ListaPassageiros.add(passenger4);
        ListaPassageiros.add(passenger5);

        Aviao plane = new Aviao("BlackBird", "14 Bis", motor01, motor02, ListaPassageiros);

        plane.imprimaOk();
        plane.imprimirListaDePassageiros(ListaPassageiros);
        
        
    }
}