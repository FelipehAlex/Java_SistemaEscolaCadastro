
package main;

import entidade.Materia;
import entidade.Notas;
import entidade.Relatorio;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        
        Relatorio fazRelatorio = new Relatorio();
        int opcao = -1;
        int ano = 0;
        Scanner sc = new Scanner(System.in);
        
        while (opcao != 0) {
            
            Materia materia = new Materia();
            Notas nota = new Notas();
            
            System.out.print("Digite o ano da materia: ");
            materia.setAno(sc.nextInt());
            sc.nextLine();
            
            System.out.print("Digite o nome da materia: ");
            materia.setNome(sc.nextLine());
            
            System.out.print("Digite a nota NP1: ");
            nota.setNp1(sc.nextDouble());
            System.out.print("Digite a nota NP2: ");
            nota.setNp2(sc.nextDouble());
            System.out.print("Digite a nota da SUB: ");
            nota.setSub(sc.nextDouble());
            System.out.print("Digite a nota do EXAME: ");
            nota.setExame(sc.nextDouble());
            
            materia.setNota(nota);
            fazRelatorio.addMateria(materia);
            
            System.out.println("Para adicionar uma nova materia '1'(SIM) e '0'(NAO). ");
            opcao = sc.nextInt();
            
        }
        
        fazRelatorio.relatorio();
        fazRelatorio.listarMateria();
        
        System.out.print("Informe o ano para listar: ");
        ano = sc.nextInt();
        fazRelatorio.listarMateriaAno(ano);
        fazRelatorio.listarMateriaAprovada("Aprovado");
        fazRelatorio.listarMateriaAprovada("Reprovado");
        System.out.println("Maior media: " + fazRelatorio.maiorMedia());
        System.out.println("Menor media: " + fazRelatorio.menorMedia());
        System.out.println("Media geral: " + fazRelatorio.coeficienteDeRendimento());
        
       
        
        
    }
    
}
