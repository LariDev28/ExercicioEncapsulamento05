/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exencapscinco;

/**
 *
 * @author Usuario
 */
public class Aluno {
    private String nome;
    private int RA;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setRA(int RA){
        this.RA = RA;
    }
    public int getRA(){
        return this.RA;
    }
   
    
    public Aluno(int RA){
        this.RA = RA;
    }
    
    public Aluno(int RA, String nome){
        this.RA = RA;
        this.nome = nome;
    } 
    
}
