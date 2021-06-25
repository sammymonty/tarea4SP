
/**
 * Write a description of class CDagua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDagua extends CazaDemonio
{
   String elemento;
    public CDagua(String nombre,int vida,int ataque){
       super(nombre,vida,ataque);
       elemento = "agua";
    }
    public String postura2(){
       String res;
       res= "";
        if(vida < ataque){
        vida = vida + 100;
        res = "segunda  postura";
       }else{
           res= "es muy pronto";
        }
        return res;
    }
}
