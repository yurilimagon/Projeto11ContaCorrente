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
public class Conta {
    
    //ATRIBUTOS
    private String nomeDono;
    private int numConta;
    private double saldo;
    
    //CONSTRUTORES
    //VAZIO
    public Conta() {
    }
    
    //CHEIO
    public Conta(String nomeDono, int numConta, double saldo) {
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    //GETTERS E SETTERS
    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    void depositar(double quantidade){
        this.saldo += quantidade;
        System.out.println("Valor depositado R$" + quantidade + "\n");
    }
    
    void sacar(double quantidade){
        if(quantidade > this.saldo){
            System.out.println("Valor maior que o limite disponível.");
        }
        else{
            double novoSaldo =  this.saldo - quantidade;
            this.saldo = novoSaldo;
            System.out.println("Valor sacado R$" + quantidade + "\n");
        }
    }
    
    void transferir(Conta destino, double quantidade){
        if(quantidade > this.saldo){
            System.out.println("Valor maior que o limite disponível.");
        }
        else{
            this.saldo -= quantidade;
        }
            destino.saldo += quantidade;
            
    }
}
