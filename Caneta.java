
package orienjava;



public class Caneta {
    //atributos
    
    boolean tampada;
    String marca;
    String cor;
    
    //metodos
    public void tampar(){
        tampada = true;
   }
public void destampar(){
        tampada = false; 
}
   public void escrever(){
       if( tampada == true){
        System.out.println("Erro, não foi possivel escrever com a caneta tampada!");
       }else{
           System.out.println("Agora pode escrever com a caneta!");
           
                }
   } 
}
