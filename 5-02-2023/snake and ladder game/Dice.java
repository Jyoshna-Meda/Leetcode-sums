import java.util.Random;   
public class Dice{
    public int ran(){
        Random random=new Random();
          int x = random.nextInt(6)+1; 
          return x; 
         }
    }   
