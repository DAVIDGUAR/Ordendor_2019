package boletin_ordenador;

/**
 *
 * @author drodriguezguardiola
 */
public class Ordenador {
    
    private Cpu procesador ;
    private Rato raton = new Rato();
    private Teclado teclas = new Teclado();
    private Monitor pantalla ;
    
    
    
   
     public Ordenador(int nucleos,int ram,boolean inhalambrico,String modelo,int numTecla,String marca, float pulgadas){ //constructor
       procesador= new Cpu(nucleos,ram);  
       raton.setModelo(modelo);
       raton.setInhalambrico(inhalambrico);
       teclas.setNumTeclas(numTecla);
       pantalla= new Monitor(marca,pulgadas);
       
         
         
         
         
         
     }
     
     
     public void CalcularPrezo(){
         float prezo;
         
         prezo = procesador.getNucleos() + procesador.getRam()*5 + teclas.getNumTeclas()*0.7f + pantalla.getPulgadas()*12;
     }
    
    public void VisualizarAtributos(){
      
        
      
        
        System.out.println("nucleos = " + procesador.getNucleos() + "\nram = " + procesador.getRam() + "\nRaton modelo = " + raton.getModelo() + "\nInhalambrico = "+raton.getInhalambrico()+ "\nTeclado= " + teclas.getNumTeclas()+"\nMarca= "+pantalla.getMarca()+"\nPulgadas= "+pantalla.getPulgadas());
        
    }
    
    
    
}
