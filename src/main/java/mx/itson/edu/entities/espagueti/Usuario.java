/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.entities.espagueti;

/**
 *
 * @author luisd
 */
public class Usuario {
    private int id;
    private String nombreUsusario;
    private String password;
    private Cuenta cuenta;


    public Usuario(int id, String nombreUsusario, String contrasenna, Cuenta cuenta) {
        this.id = id;
        this.nombreUsusario = nombreUsusario;
        this.password = contrasenna;
        this.cuenta = cuenta;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombreUsusario
     */
    public String getNombreUsusario() {
        return nombreUsusario;
    }

    /**
     * @param nombreUsusario the nombreUsusario to set
     */
    public void setNombreUsusario(String nombreUsusario) {
        this.nombreUsusario = nombreUsusario;
    }

    /**
     * @return the contrasenna
     */
    public String getContrasenna() {
        return password;
    }

    /**
     * @param contrasenna the contrasenna to set
     */
    public void setContrasenna(String contrasenna) {
        this.password = contrasenna;
    }

    /**
     * @return the cuenta
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
    /**
     * Sirve para logearce 
     * @param u usuairo registrado
     * @param passwordUsuario contraseña ingresada
     * @param nombreUsuairo nombre de usuario ingresado
     * @return si se puede ingresar con la contraseña y usuario ingresado
     */
    public boolean login(Usuario u, String passwordUsuario, String nombreUsuairo){
        if(u.getNombreUsusario().equals(nombreUsuairo) && u.getContrasenna().equals(passwordUsuario)){
            return true;
        }
        
        return false;
    }
    
    
    
}
