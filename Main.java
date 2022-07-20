class Main {
    public static void main(String[] args) {

        Motor motor01 = new Motor("a320", 50.0f);
        Motor motor02 = new Motor("b737", 50.0f);
        
        Aviao plane = new Aviao("BlackBird", "14 Bis", motor01, motor02);

        plane.imprimaOk();

        /*
        System.out.println("Modelo: " + plane.getModelo()
        + "\nIdentificador: " + plane.getIdentificador()
        + "\nMotor: " + plane.isMotor()
        + "\nAltura: " + plane.getAltura()); 
        */

        plane.ligarMotor(plane.getMotorEsquerdo());
        plane.imprimeEstadoMotor();
        plane.desligarMotor();
        plane.imprimeEstadoMotor();

        plane.ligarMotor(plane.getMotorDireito());
        plane.acelerar();
        plane.acelerar();
        plane.desligarMotor(); // Se o avião está voando, o status não é alterado
        plane.acelerar();
        plane.imprimeEstadoMotor();

        plane.ligarMotor(plane.getMotorDireito());
        plane.ligarMotor(plane.getMotorEsquerdo());
        plane.imprimeEstadoMotor();
    }
}