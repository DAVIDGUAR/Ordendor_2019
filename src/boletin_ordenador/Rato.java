package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Rato {
    
    private boolean inhalambrico;
    private String modelo;

    public Rato() {                                         // por defecto constructor
    }
    
    public Rato(boolean inhalambrico,String modelo){       //constructor
        this.inhalambrico=inhalambrico;
        this.modelo=modelo;
    }

    public String getInhalambrico() {
        
        if (inhalambrico==true){
            
           return "El raton es inhalambrico";
            
           
           
            
        }else{
            
            return "El raton no es inhalambrico";
            
           
        }
            
            
        
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
