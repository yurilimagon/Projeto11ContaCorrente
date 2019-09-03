/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta01 = new Conta("USER1", 11111, 1000.00);
        Conta conta02 = new Conta("USER2", 22222, 2000.00);
        
        System.out.println("Conta: " + conta01.getNomeDono() + 
                            "\nCC: " + conta01.getNumConta() + 
                            "\nSaldo: " + conta01.getSaldo());
        
        System.out.println("Conta: " + conta02.getNomeDono() + 
                            "\nCC: " + conta02.getNumConta() + 
                            "\nSaldo: " + conta02.getSaldo());
        
        conta01.depositar(100);
        
        System.out.println("Conta: " + conta01.getNomeDono() + 
                            "\nCC: " + conta01.getNumConta() + 
                            "\nSaldo: " + conta01.getSaldo());
        
        conta01.sacar(100);
        
        System.out.println("Conta: " + conta01.getNomeDono() + 
                            "\nCC: " + conta01.getNumConta() + 
                            "\nSaldo: " + conta01.getSaldo());
        
        conta01.transferir(conta02, 100);
        
        System.out.println("Conta: " + conta01.getNomeDono() + 
                            "\nCC: " + conta01.getNumConta() + 
                            "\nSaldo: " + conta01.getSaldo());
        
        System.out.println("Conta: " + conta02.getNomeDono() + 
                            "\nCC: " + conta02.getNumConta() + 
                            "\nSaldo: " + conta02.getSaldo());
    }
    
}
