class Aviao {
    
    private String modelo;
    private String identificador;
    private boolean motor;
    private float altura;
    private float velocidade;

    
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
    
    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void imprimaOk(){
        System.out.println("Ok");
    }

    public void ligarMotor(){
        this.setMotor(true);
        System.out.println("Vrummmmmmm");
    }

    public void desligarMotor(){
        this.setMotor(false);;
    }

    public void imprimeEstadoMotor(){
        if(this.isMotor())
            System.out.println("O motor esta ligado..");
        else
            System.out.println("O motor está desligado..");
    }

    public boolean getEstadoMotor(){
        return isMotor();
    }

    public void acelerar(){
        if(this.getEstadoMotor()){
            this.setVelocidade(this.getVelocidade() + 50.0f);
            System.out.println("Aviao a " + this.getVelocidade() + " km/h");
        }
        else
            System.out.println("ERRO: Motor desligado");
    }

    public void desacelerar(){
        if(this.getEstadoMotor()){
            if(this.getVelocidade() > 0.0f)
                this.setVelocidade(this.getVelocidade() - 50.0f);
            System.out.println("Aviao a " + this.getVelocidade() + " km/h");
        }
        else
            System.out.println("ERRO: Motor desligado");
    }
}
