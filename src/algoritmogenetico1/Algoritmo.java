/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico1;

import java.util.Random;

/**
 *
 * @author pedro
 */
public class Algoritmo {
    private static String solucao;
    private static double taxaDeCrossover;
    private static double taxaDeMutacao;
    private static String caracteres;
    
    public static Populacao novaGeracao(Populacao populacao, boolean elitismo){
        Random r = new Random();
        //nova população do mesmo tamanho da antiga
        Populacao novaPopulacao = new Populacao(populacao.getTamPopulacao());
        
        //se tiver elitismo, mantém o melhor indivíduo da geração atual
        
       
        
    }

    public static String getSolucao() {
        return solucao;
    }

    public static void setSolucao(String solucao) {
        Algoritmo.solucao = solucao;
    }

    public static double getTaxaDeCrossover() {
        return taxaDeCrossover;
    }

    public static void setTaxaDeCrossover(double taxaDeCrossover) {
        Algoritmo.taxaDeCrossover = taxaDeCrossover;
    }

    public static double getTaxaDeMutacao() {
        return taxaDeMutacao;
    }

    public static void setTaxaDeMutacao(double taxaDeMutacao) {
        Algoritmo.taxaDeMutacao = taxaDeMutacao;
    }

    public static String getCaracteres() {
        return caracteres;
    }

    public static void setCaracteres(String caracteres) {
        Algoritmo.caracteres = caracteres;
    }
    
}
