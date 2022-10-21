
package com.mycompany.aula2110;

import javax.swing.JOptionPane;


public class Medico {
    
    private int crm;
    private String nome;
    
    public Medico(int crm, String nome){
        this.nome = nome;
        this.crm = crm;
    }
    
    public int getCrm(){
        return this.crm;
    }
    
    public void setCrm(int crm){
        this.crm = crm;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void mostrarInf(){
        System.out.println("esse é o nome do médico " + nome);
    }
    
}
