
package impressora_banco;


public class Impressora {

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    //metodos de acesso
    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }
    //construtores
    public Impressora(String material, int peso, int tamanho, String numeroserie) {
        this.material = material;
        this.peso = peso;
        this.tamanho = tamanho;
        this.numeroserie = numeroserie;
    }
    //atributos
    private String material;
    private int peso;
    private int tamanho;
    private String numeroserie;
    
    
    public static void main(String[] args) {
       
    }
    
}
