class Main {
    public static void main(String[] args) {
        
        Aviao aviao = new Aviao();

        aviao.setModelo("BlackBird");
        aviao.setMotor(true);
        aviao.setIdentificador("14-bis");
        aviao.setAltura(3456.7f);
        aviao.imprimaOk();

        System.out.println("Modelo: " + aviao.getModelo()
        + "\nMotor: " + aviao.isMotor()
        + "\nIdentificador: " + aviao.getIdentificador()
        + "\nAltura: " + aviao.getAltura());
    }
}