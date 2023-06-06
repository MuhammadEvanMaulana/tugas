
package player;

public class Player {
    //definisi atribut
    
   String name;
   int speed;
   int healthpoint;
   
   
   //definisi method run
   void run() {
       System.out.println("name+ " is running ...);
       System.out.println("Speed: "+speed);
       
   }
   //definisi method isDead untuk mengecek nilai kesehatann (healthpoint)
   boolean isDead(){
         
       if (healthPoint <= 0) return true;
       return false;
       
   }
   
    
}
