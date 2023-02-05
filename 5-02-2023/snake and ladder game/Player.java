import java.util.*;
class Player {
    private int position=0;
    private String name;
    public void setName(String name){
        this.name=name;
    }
   
    public String getName(){
        return name;
    }
   
    Player(String name){
        setName(name);
    }
    public int getPosition(){
        return position;
    }
    
    public void rollDice(){
        Dice e=new Dice();
        int d=e.ran();
       
       System.out.println("dice value :"+d);
        if((position+d)<=100){
            position=position+d;
        }
        else{
            System.out.println("limit is exceed.");
         }
         HashMap<Integer,Integer>Snakes=new HashMap<>();
        Snakes.put(15,2);
        Snakes.put(56,22);
        Snakes.put(64,19);
        Snakes.put(45,1);
        Snakes.put(88,24);
        Snakes.put(94,73);
        Snakes.put(95,75);
        HashMap<Integer,Integer>Ladders=new HashMap<>();
        Ladders.put(5,13);
        Ladders.put(20,51);
        Ladders.put(28,89);
        Ladders.put(46,59);
        Ladders.put(55,90);
        Ladders.put(63,86);
        Ladders.put(72,91);
        if(Snakes.containsKey(position)){
            System.out.println("At position "+position+" you affected by snake");
            position=Snakes.get(position);
        }
        else if(Ladders.containsKey(position)){
            System.out.println("At position "+position+" you get ladder");
            position=Ladders.get(position);
        }
        
    }
}
