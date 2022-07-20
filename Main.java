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

        plane.ligarMotor();
        plane.imprimeEstadoMotor();
        plane.desligarMotor();
        plane.imprimeEstadoMotor();

        plane.ligarMotor();
        plane.acelerar();
        plane.acelerar();
        plane.desligarMotor(); // Se o avião está voando, o status não é alterado
        plane.acelerar();

        plane.ligarMotor();
        plane.desacelerar();
        plane.desacelerar();
        plane.desacelerar();
        plane.desligarMotor();

        /*
        System.out.println("Motor Esquerdo ativo? " + plane.getMotorEsquerdo().isAtivo());
        System.out.println("Motor Direito ativo? " + plane.getMotorDireito().isAtivo());
        System.out.println("Motor Esquerdo potência " + plane.getMotorEsquerdo().getPotencia());
        System.out.println("Motor Direito potência " + plane.getMotorDireito().getPotencia());
        System.out.println("Estado dos Motores " + plane.getEstadoMotor());
        System.out.println("Velocidade do avião " + plane.getVelocidade());
        System.out.println("Em voo? " + plane.isEmVoo());
        */

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