class Main {
    public static void main(String[] args) {

        Motor motor01 = new Motor("a320", 50.0f);
        Motor motor02 = new Motor("b737", 50.0f);
        
        Aviao plane = new Aviao("BlackBird", "14 Bis");

        plane.imprimaOk();

        System.out.println("Modelo: " + plane.getModelo()
        + "\nIdentificador: " + plane.getIdentificador()
        + "\nMotor: " + plane.isMotor()
        + "\nAltura: " + plane.getAltura());

        plane.ligarMotor();
        plane.imprimeEstadoMotor();
        plane.desligarMotor();
        plane.imprimeEstadoMotor();

        plane.ligarMotor();
        plane.acelerar();
        plane.acelerar();
        plane.desligarMotor();
        plane.acelerar();

        plane.ligarMotor();
        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();
        plane.desligarMotor();
        plane.desacelerar();

        System.out.println();

        plane.ligarMotor();
        plane.acelerar();
        plane.acelerar();
        plane.acelerar();
        plane.acelerar();
        plane.acelerar();

        System.out.println();

        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();

    }
}