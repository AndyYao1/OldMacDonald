class Farm  {     
   private Animal[] aBunchOfAnimals;    
   public Farm() {       
      aBunchOfAnimals = new Animal[6];
      aBunchOfAnimals[0] = new Cow("cow","moo");           
      aBunchOfAnimals[1] = new Chick("chick","cheep","cluck");      
      aBunchOfAnimals[2] = new Pig("pig","oink");   
      aBunchOfAnimals[3] = new Pig("pig","oink"); 
      aBunchOfAnimals[4] = new Pig("pig","oink"); 
      aBunchOfAnimals[5] = new Pig("pig","oink"); 
   }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
   } 
} 