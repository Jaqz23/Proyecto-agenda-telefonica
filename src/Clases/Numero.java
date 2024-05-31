
package Clases;


public class Numero {
    private int codigo;
    private String numero;

    public Numero() {
    }

    public Numero(int codigo, String numero) {
        this.codigo = codigo;
        this.numero = numero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCorreo(String text) {
         
    }

    public void setEmpresa(String text) {
        
    }

    public String getCorreo() {
        throw new UnsupportedOperationException(); 
    }

    public String getEmpresa() {
        throw new UnsupportedOperationException(); 
    }
    
    
    
    
}
