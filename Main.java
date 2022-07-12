class Main {
    public static void main(String[] args) {
        
        Aviao aviao = new Aviao("BlackBird", "14 Bis");

        aviao.imprimaOk();

        System.out.println("Modelo: " + aviao.getModelo()
        + "\nIdentificador: " + aviao.getIdentificador()
        + "\nMotor: " + aviao.isMotor()
        + "\nAltura: " + aviao.getAltura());
    }
}