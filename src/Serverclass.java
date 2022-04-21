
import java.rmi.*;

public class Serverclass{
    public static void main(String args[]){
    try{
        Interface stub=new Implimentation();
        Naming.rebind("rmi://10.194.119.50:5000/MUSIC",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
