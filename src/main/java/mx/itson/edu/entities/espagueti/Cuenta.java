/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.edu.entities.espagueti;

/**
 *
 * @author luisd
 */
public class Cuenta {

    private int id;
    private double saldo;
    private Usuario usuario;

    public Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
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
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Este método sirve para ver si se puede o no retirar
     * @param cantidad a retirar del saldo
     * @return si se puede retirtar la cantidad
     */
    public boolean permitirRetirar(double cantidad) {
        if (cantidad>this.saldo){
            return false;
        }
        return true;
    }

    /**
     * Este método resta la cantidad del saldo
     * @param cantidad a retirar del saldo
     * @return la resta del saldo y la cantidad
     */
    public double retirar(double cantidad) {
        return this.saldo - cantidad;
    }
    
    /**
     * Este método sirve para depositar cantidad
     * @param cantidad a depositar
     * @return la suma de saldo y cantidad
     */
        public double depositar(double cantidad) {
        return this.saldo + cantidad;
    }
        
    public boolean esMayorCero(double cantidad){
        if(cantidad>0){
            return true;
        }
        return false;
    }
    
}
