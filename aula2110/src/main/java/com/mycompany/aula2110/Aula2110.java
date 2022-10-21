package com.mycompany.aula2110;

import javax.swing.JOptionPane;

public class Aula2110 {

    public static void main(String[] args) {
        
 
    
        int crm1 = Integer.parseInt(JOptionPane.showInputDialog ("Qual o crm do médico: "));
        String nome1 = JOptionPane.showInputDialog ("Qual o nome do médico: ");
        String nome2 = JOptionPane.showInputDialog ("Qual o nome do paciente: ");
        int idade1  = Integer.parseInt(JOptionPane.showInputDialog ("Qual a idade do paciente: "));
        int telefone  = Integer.parseInt(JOptionPane.showInputDialog ("Qual o telefone do paciente: "));
        String data1 = JOptionPane.showInputDialog ("Qual a data da consulta: ");
        
        
        Medico med = new Medico(crm1,nome1);
        Paciente pac = new Paciente(nome2,idade1,telefone);
        Consulta cons = new Consulta(data1);
        
        JOptionPane.showMessageDialog(null,"Crm: " + med.getCrm() + "\nNome do médico: " + med.getNome() + "\nNome do paciente : " + pac.getNome() + "\nData da consulta: " + cons.getData());
        
        
    }
}
