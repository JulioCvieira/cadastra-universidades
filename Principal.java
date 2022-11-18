import java.util.*;

public class Principal {
    public static void main (String [] args){
        Scanner leia =  new Scanner(System.in);
        int tamanho = 0;
        System.out.println("Quantas Universidades deseja cadastrar? ");
        tamanho = leia.nextInt();
        
        Universidade [] universidades = new Universidade[tamanho];
        
        int opcao, quantAlunos, quantProfessores;
        String nome, estado, cidade;
        double valorMensalidade;
        
        for(int i=0; i<universidades.length; i++){
            System.out.println("==== Digite qual tipo de Universidade que desejada cadastrar ==== ");
            System.out.println("1 - Universidade Publica ");
            System.out.println("2 - Universidade Privada ");
            opcao = leia.nextInt();
            leia.nextLine();
            
            System.out.println("Digite o nome da Universidade: ");
            nome = leia.nextLine();
            System.out.println("Digite a quantidade de alunos: ");
            quantAlunos = leia.nextInt();
            System.out.println("Digite a quantidade de professores: ");
            quantProfessores = leia.nextInt();
            leia.nextLine();
        
            switch(opcao){
                case 1:
                    estado ="";
                    cidade ="";
                    universidades[i] = new Publica(nome, quantAlunos, quantProfessores, estado, cidade);
                    
                    System.out.println("Digite o estado que esta localizada: ");
                    estado = leia.nextLine();
                    ((Publica)universidades[i]).setEstado(estado);
                    
                    System.out.println("Digite a cidade que esta localizada: ");
                    cidade = leia.nextLine();
                    ((Publica)universidades[i]).setCidade(cidade);
                    break;
                case 2:
                    valorMensalidade = 0;
                    universidades[i] = new Privada(nome, quantAlunos, quantProfessores, valorMensalidade);
                    
                    System.out.println("Digite o valor da mensalidade da Universidade Privada: ");
                    valorMensalidade = leia.nextDouble();
                    ((Privada)universidades[i]).setValorMensalidade(valorMensalidade);
                    break;
                default:
                    System.out.println("xxxx Opção Inválida xxxx");
            }
        }
        Mec obj = new Mec();
        System.out.println("\n ==== Informações de Universidades cadastradas ==== ");
        obj.imprimeUniversidades(universidades);
        
        System.out.println("\n-- Universidade Privada mais cara --");
        obj.maisCara(universidades);
        
        System.out.println("\n-- Universidades Publicas do Sul do pais --");
        obj.universidadesDoSul(universidades);
    }
}