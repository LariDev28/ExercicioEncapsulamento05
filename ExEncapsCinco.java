/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exencapscinco;

/**
 *
 * @author Usuario
 */
public class ExEncapsCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno objAluno1 = new Aluno(125);
        Aluno objAluno2 = new Aluno(125, "Fulano");
        
        System.out.println(objAluno1.getRA());
        System.out.println(objAluno2.getRA());
        System.out.println(objAluno2.getNome());
        
    }
    
}
