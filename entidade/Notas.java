
package entidade;


public class Notas {
    
    private double np1;
    private double np2;
    private double sub;
    private double exame;
    
    public Notas(){
    }
    
    public void setNp1(double aNp1){
        this.np1 = aNp1;
    }
    
    public double getNp1(){
        return np1;
    }
    
    public void setNp2(double aNp2){
        this.np1 = aNp2;
    }
    
    public double getNp2(){
        return np2;
    }
    
    public void setSub(double aSub){
        this.sub = aSub;
    }
    
    public double getSub(){
        return sub;
    }
    
    public void setExame(double aExame){
        this.exame = aExame;
    }
    
    public double getExame(){
        return exame;
    }
    
    public double calculaMedia(){
        double max1 = Double.max(np1, np2);
        double max2 = Double.max(Double.max(np1, np2),sub);
        double media = (max1 + max2) / 2.0;
        
        if (media >= 7.0) {
            return media;
        }
        else {
            media = (media + exame) / 2.0;
            return media;
        }
    }
    
    /*public boolean isAprovado(){
        if (calculaMedia() >= 5.0) {
            return true;
        }
        else { 
            return false;
        }
    }*/
    
    public String aprovado(){
        if (calculaMedia()>=5){
            return "aprovado";
        }
        else {
            return "reprovado";
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        
        res += "Nota NP1: " + getNp1();
        res += "Nota NP2: " + getNp2();
        res += "Nota SUB: " + getSub();
        res += "Nota EXAME: " + getExame();
        res += "Media: " + calculaMedia();
      //res += "Aprovado: " + isAprovado();
        
        return res;
        
    }
    
}
