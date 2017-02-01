/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico1;

/**
 *
 * @author pedro
 */
public class AlgoritmoGenetico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definir a solução
        Algoritmo.setSolucao("Teste usando ã");
        //definir os caracteres existentes
        Algoritmo.setCaracteres("qwertyuiopasdfghjklçzxcvbnmíéaáàúóãõ QWERTYUIOPASDFGHJKLÇZXCVBNMÍÉÁÀÓÃÕ");
        //taxa de crossover de 60%
        Algoritmo.setTaxaDeCrossover(0.6);
        //mutacao de 3%
        Algoritmo.setTaxaDeMutacao(0.3);
        //elitismo
        boolean elitismo = true;
        //tamanho da populaçao
        int tamPop = 100;
        //numero maximo de geraçoes
        int numMaxGeracoes = 10000;
        //define o numero de genes do individuo baseado na soluçao
        int numGenes = Algoritmo.getSolucao().length();
        //cria a primeira populacao aleatoria 
        Populacao populacao = new Populacao(numGenes, tamPop);

        boolean temSolucao = false;
        int geracao = 0;

        System.out.println("Iniciando... Aptidao da soluçao:"
                + Algoritmo.getSolucao().length());

        //loop ate o criterio de parada
        while (!temSolucao && geracao < numMaxGeracoes) {
            geracao++;

            //cria nova populacao 
            populacao = Algoritmo.novaGeracao(populacao, elitismo);

            System.out.println("Geração " + geracao + " | Aptidão: "
                    + populacao.getIndividuo(0).getAptidao()
                    + " | Melhor: " + populacao.getIndividuo(0).getGenes());

            //verifica se tem a solucao
            temSolucao = populacao.temSolucao(Algoritmo.getSolucao());

        }

        if (geracao == numMaxGeracoes) {
            System.out.println("Número máximo de gerações | "
                    + populacao.getIndividuo(0).getGenes() + " "
                    + populacao.getIndividuo(0).getAptidao());
        }

        if (temSolucao) {
            System.out.println("Encontrado resultado na geração " + geracao
                    + " | " + populacao.getIndividuo(0).getGenes()
                    + " (Aptidão: " + populacao.getIndividuo(0).getAptidao() + ")");
        }

    }

}
