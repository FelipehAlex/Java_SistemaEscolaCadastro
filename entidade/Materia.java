
package entidade;


public class Materia {
    
    private String nome;
    private int ano;
    private Notas nota;
    
    public Materia(){
    }
    
    public void setNome(String aNome){
        this.nome = aNome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setAno(int aAno){
        this.ano = aAno;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setNota(Notas aNota){
        this.nota = aNota;
    }
    
    public Notas getNota(){
        return nota;
    }
    
    @Override
    public String toString(){
        String res = "";
        
        res += "Materia: " + getNome();
        res += "Ano: " + getAno();
        res += "Nota: " + getNota();
        
        return res;
    }

    
    
    
}
