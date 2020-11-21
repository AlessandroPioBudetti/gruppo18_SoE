/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.*;

/**
 *
 * @author maria_cascone
 */
public class Bibita {
    private String codice;
    private String nome;
    private double prezzo;
    private static int numero=0;

    public Bibita(String codice, String nome, double prezzo) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
        numero++;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bibita other = (Bibita) obj;
        if (!Objects.equals(this.codice, other.codice)) {
            return false;
        }
        return true;
    }   

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public static int getNumero() {
        return numero;
    }
    
}
