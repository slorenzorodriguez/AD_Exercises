/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a12serializacion;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class MClass implements Serializable{
    String nome;
    transient int numero1;
    double numero2;

    public MClass() {
    }

    public MClass(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "MClass{" + "nome=" + nome + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

   
    }
    

