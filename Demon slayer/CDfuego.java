
/**
 * Write a description of class CDfuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDfuego extends CazaDemonio
{
    String elemento;
    public CDfuego(String nombre,int vida,int ataque){
       super(nombre,vida,ataque);
       elemento = "fuego";
    }
    public String postura1(){
       String res;
       res= "";
        if(vida < ataque){
        ataque = ataque + 100;
        res = "primera postura";
       }else{
           res= "es muy pronto";
        }
        return res;
    }
}
