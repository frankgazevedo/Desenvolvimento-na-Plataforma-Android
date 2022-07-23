import java.util.ArrayList;

class Aviao {
    
    private String modelo;
    private String identificador;
    private float altura;
    private float velocidade;
    private boolean emVoo;
    private Motor motorEsquerdo;
    private Motor motorDireito;
    private ArrayList<Passageiro> ListaPassageiros;
    
    
    Aviao(String modelo, String identificador, Motor motorEsquerdo, Motor motorDireito, ArrayList<Passageiro> ListaPassageiros){
        this.setModelo(modelo);
        this.setIdentificador(identificador);
        this.setMotorEsquerdo(motorEsquerdo);
        this.setMotorDireito(motorDireito);
        this.setAltura(0.0f);
        this.setListaPassageiros(ListaPassageiros);
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
    
    public boolean isEmVoo() {
        return emVoo;
    }
    
    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }
    
    public Motor getMotorEsquerdo() {
        return motorEsquerdo;
    }
    
    public void setMotorEsquerdo(Motor motorEsquerdo) {
        this.motorEsquerdo = motorEsquerdo;
    }
    
    public Motor getMotorDireito() {
        return motorDireito;
    }
    
    public void setMotorDireito(Motor motorDireito) {
        this.motorDireito = motorDireito;
    }

    public ArrayList<Passageiro> getListaPassageiros() {
        return ListaPassageiros;
    }

    private void setListaPassageiros(ArrayList<Passageiro> ListaPassageiros){
        this.ListaPassageiros = ListaPassageiros;
    }

    public boolean adicionarPassageiro(Passageiro passenger){
        if(this.getVelocidade() > 0){
            System.out.println("Protocolos de segurança não permitem embarques com a aeronave em movimento");
            return false;
        }
        else{
            this.getListaPassageiros().add(passenger);
            return true;
        }
    }

    public Passageiro buscarPassageiroPorCPF(String cpf){
        Passageiro passenger = null;
        
        for (Passageiro passageiro : this.getListaPassageiros())
            if(passageiro.getCpf().equals(cpf))
                passenger = passageiro;

        return passenger;
    }

    public void imprimirListaDePassageiros(ArrayList<Passageiro> ListaPassageiros){
        for (Passageiro passenger : ListaPassageiros) {
            System.out.println(passenger.getPrimeiroNome() + " " + passenger.getUltimoNome() + ", CPF: " + passenger.getCpf());
        }
    }

    public void desembarcarPassageiros(){
        if(this.getVelocidade() > 0)
            System.out.println("Protocolos de segurança não permitem desembarques com a aeronave em movimento");
        else
            for (Passageiro passenger : this.getListaPassageiros()) {
                System.out.println(passenger.getPrimeiroNome() + " " + passenger.getUltimoNome() + " desembarcou da aeronave!");
                this.getListaPassageiros().remove(passenger);
            }
    }
    
    public void imprimaOk(){
        System.out.println("Ok");
    }

    public void ligarMotor(Motor motor){
        if(motor.equals(this.getMotorEsquerdo()))
            this.getMotorEsquerdo().ligar();
        else
            this.getMotorDireito().ligar();
    }

    public void desligarMotor(){
        this.getMotorEsquerdo().desligar();
        this.getMotorDireito().desligar();
    }

    public void imprimeEstadoMotor(){
        if(this.getEstadoMotor())
            if(this.getMotorEsquerdo().isAtivo())
                if(this.getMotorDireito().isAtivo())
                    System.out.println("Os motores estão ligados..");
                else
                    System.out.println("Somente o motor Esquerdo está ligado");
            else
                System.out.println("Somente o motor Direito está ligado");
           
        else
            System.out.println("Os motores estão desligados..");
    }

    public boolean getEstadoMotor(){
        if(this.getMotorEsquerdo().isAtivo() || this.getMotorDireito().isAtivo())
            return true;
        else
            return false;
    }

    public void acelerar(){
        if(this.getEstadoMotor()){
            if(this.getMotorEsquerdo().isAtivo())
                if(this.getMotorDireito().isAtivo()){
                    this.setVelocidade(this.getVelocidade() + this.getMotorEsquerdo().getPotencia() + this.getMotorDireito().getPotencia());
                    System.out.println("Aviao a " + this.getVelocidade() + " km/h");
                }
                else{
                    this.setVelocidade(this.getVelocidade() + this.getMotorEsquerdo().getPotencia());
                    System.out.println("Aviao a " + this.getVelocidade() + " km/h");
                }
            else{
                this.setVelocidade(this.getVelocidade() + this.getMotorDireito().getPotencia());
                System.out.println("Aviao a " + this.getVelocidade() + " km/h");
            }
        }
        else
            System.out.println("ERRO: Motor desligado");
        
        this.atualizarStatusVoo();
    }

    public void desacelerar(){
        if(this.getEstadoMotor())
            if(this.getVelocidade() > 0.0f)
                if(this.getMotorEsquerdo().isAtivo())
                    if(this.getMotorDireito().isAtivo()){
                        this.setVelocidade(this.getVelocidade() - this.getMotorEsquerdo().getPotencia() - this.getMotorDireito().getPotencia());
                        System.out.println("Aviao a " + this.getVelocidade() + " km/h");
                    }
                    else{
                        this.setVelocidade(this.getVelocidade() - this.getMotorEsquerdo().getPotencia());
                        System.out.println("Aviao a " + this.getVelocidade() + " km/h");
                    }
                else{
                    this.setVelocidade(this.getVelocidade() - this.getMotorDireito().getPotencia());
                    System.out.println("Aviao a " + this.getVelocidade() + " km/h");
                }
        else
            System.out.println("ERRO: Motor desligado");
        
        this.atualizarStatusVoo();
    }

    public void atualizarStatusVoo(){
        if(this.isEmVoo())
            if(this.getVelocidade() >= 200.0f)
                System.out.println("Estou voando…");
            else{
                this.setEmVoo(false);
                System.out.println("Estou aterrisando..");
            }
        else
            if(this.getVelocidade() < 200.0f)
                System.out.println("Estou em solo…");
            else{
                this.setEmVoo(true);
                System.out.println("Estou decolando..");
            }
    }
}
