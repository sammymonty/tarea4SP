
/**
 * Write a description of class CDrayo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDrayo extends CazaDemonio
{
   String elemento;
    public CDrayo(String nombre,int vida,int ataque){
       super(nombre,vida,ataque);
       elemento = "rayo";
    }
    public String postura3(){
       String res;
       res= "";
        if(vida < ataque){
        energia = +5;
        res = "tercera postura";
       }else{
           res= "es muy pronto";
        }
        return res;
    }
}
