
package Clases;

import java.util.ArrayList;


public class Contacto {
    private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String empresa;
    private String Telefono;
    private ArrayList<Numero> numeros;

    public Contacto() {
        numeros = new ArrayList();
    }

    public Contacto(int codigo, String nombre, String apellido, String correo, String empresa,String Telefono, ArrayList<Numero> numeros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.empresa = empresa;
        this.Telefono = Telefono;
        this.numeros = numeros;
    }

    public Contacto(int codigo, String nombre, String apellido, String correo, String empresa,String Telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.empresa = empresa;
        this.Telefono = Telefono;
        numeros = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }  

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    } 
}