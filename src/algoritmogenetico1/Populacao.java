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
        for (Individuo individuo : individuos) {
            if (individuo.getGenes().equals(solucao)) {
                i = individuo;
                break;
            }
        }
        return i != null;
        
    }
    
    //ordena a população pelo valor de aptidao de cada individuo, do maior valor
    //para o menor, assim se eu quiser obter o melhor individuo desta população
    //acesso a posição 0 do array de individuos.
    
    public void ordenaPopulacao(){
        boolean trocou = true;
        while(trocou){
            trocou = false;
            for(int i = 0; i<individuos.length-1;i++){
                if(individuos[i].getAptidao() < individuos[i+1].getAptidao()){
                    Individuo temp = individuos[i];
                    individuos[i] = individuos[i+1];
                    individuos[i+1] = temp;
                    trocou = true;
                }
            }
        } 
    }
    
    
    //número de invíduos existentes na população
    public int getNumIndividuos(){
        int num = 0;
        for(int i = 0; i < individuos.length;i++){
            if (individuos[i] != null){
                num++;
            }
        }
        return num;
    }

    public Individuo[] getIndividuos() {
        return individuos;
    }

    public int getTamPopulacao() {
        return tamPopulacao;
    }
    
}
