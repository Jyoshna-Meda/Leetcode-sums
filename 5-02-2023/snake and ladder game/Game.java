import java.util.*;
class Game{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Number of players you want to play:");
       int n=sc.nextInt();
       ArrayList<Player> list=new ArrayList<>();
        ArrayList<String> arr=new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("ENTER PLAYER "+(i+1)+" NAME");
            String a=sc.nextLine();
            list.add(new Player(a));
          }
        if(n==1)
          System.out.println("One player can't play this game");
        else{
           while(n!=1){
                for(Player gamer:list){
                    System.out.println(gamer.getName()+" turn");
                    System.out.println("If you continue your game press Enter Otherwise you will left from the game");
                    String s=sc.nextLine();
                    if(s==""){
                        gamer.rollDice();
                        System.out.println(gamer.getName()+" Score is "+gamer.getPosition());
                    }
                   else{
                       System.out.println(gamer.getName()+" left at position "+gamer.getPosition());
                       list.remove(gamer);
                       n=n-1;
                   }
                   if(gamer.getPosition()==100){
                     arr.add(gamer.getName());
                    System.out.println(" You are a "+arr.size()+" ranker ");
                    n=n-1;
                   }
                   if(list.size()==1){
                      break;}
                }
           } }
           System.out.println("Winners List:");
           for(int i=0;i<arr.size();i++){
            System.out.println(" rank "+(i+1)+arr.get(i));
           }
    }
}
