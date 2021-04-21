package entidade;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {

    private List<Materia> materia;

    public Relatorio() {
        materia = new ArrayList<>();
    }

    public void addMateria(Materia materia) {
        this.materia.add(materia);
    }

    public void listarMateria() {
        System.out.println("LISTANDO MATERIAS...");
        for (int i = 0; i < this.materia.size(); i++) {
            System.out.println(this.materia.get(i).getNome());
        }
        System.out.println("====================================================");
    }

    public void listarMateriaAno(int aAno) {
        System.out.println("ANO DA MATERIA...");
        for (int i = 0; i < this.materia.size(); i++) {
            if (aAno == this.materia.get(i).getAno()) {
                System.out.println(this.materia.get(i).getNome());
            }
        }
        System.out.println("====================================================");
    }

    public void listarMateriaAprovada(String aprovado) {
        System.out.println("Materias: " + aprovado);
        for (int i = 0; i < this.materia.size(); i++) {
            if (aprovado.equalsIgnoreCase("aprovado")
                    && aprovado.equalsIgnoreCase(this.materia.get(i).getNota().aprovado())) {
                System.out.println(this.materia.get(i).getNome());
            } else if (aprovado.equalsIgnoreCase("reprovado")
                    && aprovado.equalsIgnoreCase(this.materia.get(i).getNota().aprovado())) {
                System.out.println(this.materia.get(i).getNome());
            }
        }
        System.out.println("====================================================");
    }

    public double maiorMedia() {
        double maior = Double.MIN_VALUE;
        for (int i = 0; i < this.materia.size(); i++) {
            if (this.materia.get(i).getNota().calculaMedia() > maior) {
                maior = this.materia.get(i).getNota().calculaMedia();
            }
        }
        return maior;
    }

    public double menorMedia() {
        double menor = Double.MAX_VALUE;
        for (int i = 0; i < this.materia.size(); i++) {
            if (this.materia.get(i).getNota().calculaMedia() < menor) {
                menor = this.materia.get(i).getNota().calculaMedia();
            }
        }
        return menor;
    }

    public double coeficienteDeRendimento() {
        double total = 0;
        for (int i = 0; i < this.materia.size(); i++) {
            total += this.materia.get(i).getNota().calculaMedia();
        }
        return total / this.materia.size();
    }

    public void relatorio() {
        for (int i = 0; i < materia.size(); i++) {
            System.out.println(materia.get(i).getAno());
            System.out.println(materia.get(i).getNome());
            System.out.println(materia.get(i).getNota().getNp1());
            System.out.println(materia.get(i).getNota().getNp2());
            System.out.println(materia.get(i).getNota().getSub());
            System.out.println(materia.get(i).getNota().getExame());
            System.out.println(materia.get(i).getNota().calculaMedia());
            System.out.println(materia.get(i).getNota().aprovado());
            System.out.println("===============================================");
        }
    }

}
