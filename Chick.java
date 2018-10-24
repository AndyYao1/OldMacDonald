class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private int a;      
     public Chick(String type, String sound, String sound2){
        a = (int)(Math.random()*2);         
        myType = type;
        if (a < 1) {
            mySound = sound;                  
        } else {
            mySound = sound2;
        }
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
