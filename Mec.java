public class Mec {
    public void imprimeUniversidades (Universidade[] arrayUniversidade){
        for(int i=0; i<arrayUniversidade.length; i++){
            if(arrayUniversidade[i] instanceof Publica){
                System.out.println("==== Universidades Publicas ====");
                arrayUniversidade[i].imprimeInfo();
            } if(arrayUniversidade[i] instanceof Privada){
                System.out.println("==== Universidades Privadas ====");
                arrayUniversidade[i].imprimeInfo();
            }
        }
    }
    
    public void maisCara (Universidade[] arrayUniversidade){
        double maiorValor = 0;
        int indice = 0;
        for(int i=0; i<arrayUniversidade.length; i++){
            if(arrayUniversidade[i] instanceof Privada){
                if(((Privada)arrayUniversidade[i]).getValorMensalidade() > maiorValor){
                    maiorValor = ((Privada)arrayUniversidade[i]).getValorMensalidade();
                    indice = i;
                }    
            }        
        }
        
        arrayUniversidade[indice].imprimeInfo();
    }
    
    public void universidadesDoSul (Universidade[] arrayUniversidade){
        String [] sul = {"rs", "sc", "pr", "rio grande do sul", "santa catarina", "paraná"};
        for(int i=0; i<arrayUniversidade.length; i++){
            if(arrayUniversidade[i] instanceof Publica){
                if ((((Publica)arrayUniversidade[i]).getEstado()).equalsIgnoreCase(sul[i])){
                arrayUniversidade[i].imprimeInfo();        
                        
                }
            }   
        }
    }
}