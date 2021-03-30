/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoagendatelefonica;

/**
 *
 * @author carlariela
 */
public class Contacto {
    private int celular;
    private String direccion;
    private String parentesco;
    private String email;

    public Contacto(int nombre, String direccion, String parentesco, String email) {
        this.celular = nombre;
        this.direccion = direccion;
        this.parentesco = parentesco;
        this.email = email;
    }
    public Contacto(){
        this.celular = 0;
        this.direccion ="";
        this.parentesco ="";
        this.email ="";
    }

    public int getNumero() {
        return celular;
    }

    public void setNumero(int nombre) {
        this.celular = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        
        String datos=this.celular+"\n";
        datos=datos+this.direccion+"\n";
        datos=datos+this.parentesco+"\n";
        datos=datos+this.email+"\n";
        datos=datos+"------------------------------";
    return datos;       
    }
      
    
    
}
