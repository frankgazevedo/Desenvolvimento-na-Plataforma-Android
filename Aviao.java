class Aviao {
    
    private String modelo;
    private String identificador;
    private boolean motor;
    private float altura;

    Aviao(String modelo, String identificador){
        this.setModelo(modelo);
        this.setIdentificador(identificador);
        this.setMotor(false);
        this.setAltura(0.0f);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void imprimaOk(){
        System.out.println("Ok");
    }   
}
