
/**
 * Write a description of class CazaDemonio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CazaDemonio
{
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int energia = 5;
    public CazaDemonio(String nom,int v,int atack){
        nombre = nom;
        vida = v;
        ataque = atack;
    }
    public  String atacar(CazaDemonio otro){
        String res;
        res = "";
        if(vida > 0){
            otro.vida =otro.vida - ataque;
            energia --;
            if(energia <= 0){
                res = "no hay energia";
            } else{
                res= "aun puedes pelear";
            
            }
            }else{
                res = "esta muerto ";
            }            
        return  res;   
        }
    public String respirar(){
        String res;
        res = "";
        
        if(vida >= 0){
            vida = vida + 50;
            res ="curando heridas";
            energia --;
            if(energia <= 0){
                res = "no hay energia";
            } else{
                res= "aun puedes pelear";
            
            }
        }else if (vida <= 0){
            res = "los muertos no se curan";
        }
        return res;
    }
    public String concentrar(){
        String res;
        res = "";
        if(energia == 0){
            if(vida >= 10){
                vida = vida - 10;
                energia = 2;
                res = "recuperando energia";
            }else{
                res = "imposible recuperar energia";
            }
        }else{
            res="aun tienes energia";
        
        }
        return res;
    }
    }        
