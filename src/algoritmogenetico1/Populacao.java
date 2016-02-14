package algoritmogenetico1;

/**
 *
 * @author pedro
 */
public class Populacao {
    
    private Individuo[] individuos;
    private int tamPopulacao;
    
    //cria uma população com indivíduos aleatória
    public Populacao(int numGenes, int tamPop){
        tamPopulacao = tamPop;
        individuos = new Individuo[tamPop];
        for (int i = 0; i<individuos.length; i++){
            individuos[i] = new Individuo(numGenes);
        }
    }
    
    //cria uma população com indivíduos sem valor, será composto posteriormente
    public Populacao(int tamPop){
        tamPopulacao =tamPop;
        individuos = new Individuo[tamPop];
        for(int i = 0; i<individuos.length; i++){
            individuos[i] = null;
        }
    }
    
    //coloca um indivíduo em uma certa posição da população
    public void setIndividuo(Individuo individuo, int posicao){
        individuos[posicao] = individuo;
    }
    
    //coloca um indivíduo na próxima posição disponível da população
    public void setIndividuo(Individuo individuo){
        for (int i = 0;i<individuos.length;i++){
            if (individuos[i]==null){
                individuos[i] = individuo;
                return;
            }
        }
    }
    
    //verifica se algum indivíduo da população possui a solução
    public boolean temSolucao(String solucao){
        Individuo i = null;
        for(int j=0;j<individuos.length;j++){
            if (individuos[j].getGenes().equals(solucao)){
                i = individuos[j];
                break;
            }
        }
        if (i==null){
            return false;
        }
        return true;
        
    }
    
    
    
    
    
    
    
    
    
}
