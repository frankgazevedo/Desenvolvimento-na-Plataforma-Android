public class Motor {

    private String modelo;
    private float potencia;
    private boolean ativo;    

    public Motor(String modelo, float potencia) {
        this.setModelo(modelo);
        this.setPotencia(potencia);
        this.setAtivo(false);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void ligar(){
        this.setAtivo(true);
        System.out.println("......VRUMMMM!!");
    }

    public void desligar(){
        this.setAtivo(false);
        System.out.println("mmmmm……..");
    }
    
}