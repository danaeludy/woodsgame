import java.util.Scanner;
public class Woods_Game
{//class
   public static void main(String[]args)
   {//main
      Scanner sc = new Scanner(System.in);
      //variables
      int health = 100;
      int strength;
      int damage;
      int fRoller = (int)(Math.random()*15)+2; // random dice for fist attacks between 2 - 15
      int light_weaponRoller = (int)(Math.random()*50)+15; //random dice for light weapons between 15 - 50
      int heavy_weaponRoller = (int)(Math.random()*90)+50; //random dice for heavy weapons between 50 - 90
      String user_input = "";
      String direction = "";
   
      System.out.print("Please enter your name: ");
      String name = sc.nextLine();
      System.out.println("\nWelcome "+ name + ". You have entered the WOODS\nIn this game your goal is to escape the woods alive. if you fail you will be able to try again. BEWARE\nPLAY IF YOU DARE! \nWould you like to play?");
      
      
      String user = sc.nextLine();
      if ((user.toLowerCase()).equals("yes")){
         System.out.println("Goodluck!");
      }
      else if (!(user.toLowerCase()).equals("no")){
         System.out.println("\nPlease enter yes or no\n");
         user = sc.nextLine();
      }
      else 
         user = "1";
      
       
      
      name = name.toLowerCase();
      while (!(user.equals("1")))
      {//while
         health = 100;
         if (health > 0 )//alphabet check, first landmark, first choice landyn
         {//first
           
            char firstChar = name.charAt(0); 
            System.out.println("You have reached the First Letter Tree."); //check first letter, every Quarter of the alphabet has a different conflict. 
            if (firstChar == 'a' || firstChar == 'b' || firstChar == 'c' || firstChar == 'd' || firstChar == 'e' || firstChar == 'f'){ 
               System.out.println("You've encountered a bear");
               int bear_Health = 20; //initializing the bears health
               System.out.println("what would you like to do?\na.) Run \nb.) Fight");//user can run away or fight the bear
               user_input = sc.nextLine();
               
                  
               if (user_input.equals("a")){
                  System.out.print("\nYou have chosen to run away from the bear\nRun left or right?");
                  user_input = sc.nextLine();
                  System.out.print("the bear slashed you heel while trying to escape");
                  health -= fRoller;
               }//run away
                  
               else if (user_input.equals("b")){//fight
                  System.out.println("\nYou have chosen to fight the bear\nstate your attack\na.)Man up and punch him\nb.)hit him with the closest stick");
                  user_input = sc.nextLine();
                  user_input = user_input.toLowerCase();                     
                  if (user_input.equals("a")){//punch fight
                     while (bear_Health > 0){ 
                        fRoller = (int)(Math.random()*15)+2;//dice roll each loop
                        health -= (fRoller);
                        int bear = bear_Health - fRoller;
                        damage = bear_Health - bear;
                        bear_Health -= damage;
                        System.out.println("\nYou've punched the bear for " + damage  + " health. The bear hit you as well, your health is now " + health + ".");
                        
                        if (bear_Health > 0 ){
                           System.out.println("press any key to punch again or type run to try and escape");
                           user_input = sc.nextLine();
                           if (user_input.equals("run")){
                              System.out.println("The bear was able to slash your finger");
                              health -= 5;
                              System.out.println("Which way would you like to run, left or right");
                              user_input = sc.nextLine();
                              break;
                           }
                              
                        }
                        if (bear_Health <= 0)
                           System.out.println("You've killed the bear");
                        System.out.println("Which way would you like to run, left or right");
                        user_input = sc.nextLine();
                        
                     }
                     
                  }//end of punch fight
                  else if (user_input.equals("b")){//stick fight
                     while (bear_Health > 0){ 
                        light_weaponRoller = (int)(Math.random()*50)+15;//dice roll each loop
                        health -= (light_weaponRoller);
                        int bear = bear_Health - light_weaponRoller;
                        damage = bear_Health - bear;
                        bear_Health -= damage;
                        System.out.println("\nYou've punched the bear for " + damage  + " health. The bear hit you as well, your health is now " + health + ".");
                        
                        if (bear_Health > 0 ){
                           System.out.println("press any key to punch again or type run to try and escape");
                           user_input = sc.nextLine();
                           if (user_input.equals("run")){
                              System.out.println("The bear was able to slash your toe");
                              health -= 10;
                              System.out.println("Which way would you like to run, left or right");
                              user_input = sc.nextLine();
                              break;
                           }
                              
                        }
                        if (bear_Health <= 0)
                           System.out.println("You've killed the bear");
                        System.out.println("Which way would you like to run, left or right");
                        user_input = sc.nextLine();
                        
                     }
                     
                  }
                  
                  
               }//fight 
               
               System.out.println("\nyour running " + user_input + ". Your health is " + health);
            }//end first 4 letters
            
            
            else if (firstChar == 'g' || firstChar == 'h' || firstChar == 'i' || firstChar == 'j' || firstChar == 'k' || firstChar == 'l'){
               System.out.println("You've encountered a wolf");
               int wolf_Health = 20; //initializing the wolf's health
               System.out.println("what would you like to do?\na.) Run \nb.) Fight");
               user_input = sc.nextLine();
                     
               
               
               if (user_input.equals("a")){
                  System.out.print("\nYou have chosen to run away from the wolf\nRun left or right?");
                  user_input = sc.nextLine();
                  System.out.print("the wolf bit your heel while trying to escape");
                  health -= fRoller;
               }//run away
                      
               else if (user_input.equals("b")){
                  System.out.println("\nYou have chosen to fight the wolf\nstate your attack\na.)Man up and punch it\nb.)hit him with the closest stick");
                  user_input = sc.nextLine();
                  user_input = user_input.toLowerCase();
                  
                  
                        //fight wolf
                  if (user_input.equals("a")){
                     while (wolf_Health > 0){
                        fRoller = (int)(Math.random()*15)+2;//dice roll each loop
                        health -= (fRoller);
                        int wolf = wolf_Health - fRoller;
                        damage = wolf_Health - wolf;
                        wolf_Health -= damage;
                        System.out.println("\nYou've punched the wolf for " + damage  + " health. The wolf hurt you as well, your health is now " + health + ".");
                              
                        if (wolf_Health > 0 ){
                           System.out.println("press any key to punch again or type run to try and escape");
                           user_input = sc.nextLine();
                           if (user_input.equals("run")){
                              System.out.println("The wolf was able to slash your finger");
                              health -= 5;
                              System.out.println("Which way would you like to run, left or right");
                              user_input = sc.nextLine();
                              break;
                           }
                                    
                        }
                        if (wolf_Health <= 0)
                           System.out.println("You've killed the wolf");
                        System.out.println("Go left or right?");
                        user_input = sc.nextLine();
                              
                     }
                           
                  }//end of punch fight
                  else if (user_input.equals("b")){
                     while (wolf_Health > 0){ //wolf fight loop
                        light_weaponRoller = (int)(Math.random()*50)+15;//dice roll each loop
                        health -= (light_weaponRoller);
                        int wolf = wolf_Health - light_weaponRoller;
                        damage = wolf_Health - wolf;
                        wolf_Health -= damage;
                        System.out.println("\nYou've stabbed the wolf for " + damage  + " health. The wolf hurt you as well, your health is now " + health + ".");
                              
                        if (wolf_Health > 0 ){
                           System.out.println("press any key to punch again or type run to try and escape");
                           user_input = sc.nextLine();
                           if (user_input.equals("run")){
                              System.out.println("The wolf was able to bite your toe");
                              health -= 10;
                              System.out.println("Which way would you like to run, left or right");
                              user_input = sc.nextLine();
                              break;
                           }
                                    
                        }
                        if (wolf_Health <= 0)
                           System.out.println("You've killed the wolf");
                        System.out.println("Which way would you like to run, left or right");
                        user_input = sc.nextLine();
                     }
                           
                  }
                        
                        
               }//fight 
                     
               System.out.println("\nyour running " + user_input + ". Your health is " + health);                  
            }//end next 4 letters
               
            else if (firstChar == 'm' || firstChar == 'n' || firstChar == 'o' || firstChar == 'p' || firstChar == 'q' || firstChar == 'r'){
               System.out.println("A colony of bats flew around the corner and scratches your face");
               health -= 15;
               System.out.println("\nYouve found a health potion, but a fox is sleeping on it. \na.) take it quietly\nb.) try to smash a rock on the fox and take the potion");
               user_input = sc.nextLine();
               if (user_input.equals("a")){
                  System.out.println("your retrival of the potion failed. You woke up the fox and it ripped you to shreds");
                  health = 0;
                  System.out.println("Too bad, So sad");
               }
               else if (user_input.equals("b")){
                  System.out.println("\nyou retrival of the potion failed. You woke up the fox and it ripped you to shreds");
                  health = 0;
                  System.out.println("Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp.\nWomp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp.\nWomp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp.\nWomp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp. Womp.\n");
               }
               System.out.println("Which way would you like to run, left or right");
               user_input = sc.nextLine();
               
            }//end next 4 letters
            else {
               System.out.println("OH!, It's a cute little knome. He's friendly and gives you a health potion");
               health += 20;
               System.out.println("Which way would you like to run, left or right");
               user_input = sc.nextLine();
            }
            if (name.equals("danae")){
               System.out.println("\n\n\nYOU LOSE");
               health -= 300;
            }
            direction = user_input;            
         }
      
         
         
            
         if (direction.equals("left")){
           
            if (name.equals("Landyn")){
               System.out.println("How dare you pick that disgraceful name!");
               health = 0;
               System.out.println("Goodbye London! You have been banished to the depths of hell!");
            }
         
            if (health < 0){
               System.out.println("Game over! Sorry, but you have died.");
               break;
            }
           
           // Danae      
            if (health > 0) 
            {
                 // reaches second landmark
               System.out.println("You have reached the Cave of Despair." +
                                "\nYou can either go through the cave or go around it." + 
                                "\nIf you go through the cave, you will encounter rats." + 
                                "\nIf you go around the cave, you will encounter a wolf.");
               System.out.println("Enter 1 to go through the cave or 2 to go around the cave");
               int cave = sc.nextInt();
                   // turning right 
               if (cave == 1) {
                  System.out.println("You have encountered rats.");
                  System.out.println("Enter 1 to fight the rats or 2 to run away.");
                  int rats = sc.nextInt();
                  if (rats == 1){
                     health -= 35;
                     System.out.println("You have defeated the rats. You are at " + health + "% health.");
                  }
                  else if (rats == 2){
                     System.out.println("You ran away from the rats and fell into a bottomless pit.");
                     health = 0;
                     System.out.println("Womp womp, you died. You are at " + health + "% health. Punk. You should've fought the rats.");
                  }
                  else
                     System.out.println("Please enter 1 or 2.");
                 
               }
                        // turning left
               else if (cave == 2){
                  System.out.println("You have encountered a sleeping wolf.");
                  System.out.println("Enter 1 to slowly walk past the wolf or 2 to run.");
                  int wolf = sc.nextInt();
                  if (wolf == 1) {
                     System.out.println("You have slowly walked past the wolf and suffered no damage. You are at " + health + "% health.");
                  }
                  else if (wolf == 2) {
                     health -= 50;
                     System.out.println("You have run away and woke the wolf. It attacked you. You are at " + health + "% health.");
                  }
                  else
                     System.out.print("Please enter 1 or 2.");
               }
               else
                  System.out.print("Please enter 1 or 2.");
               sc.nextLine();
            }
         
         
            if (health <= 0) {
               System.out.println("Game over! Sorry, but you have died.");
               break;
            }
         }
      
      
      
         if (direction.equals("right")){
           //health checker
            if (health > 0)
            {
               String crystal = "";
               String game = "";
               String rps = "";
               String potion;
                   // reaches third landmark -jenysis
               System.out.println("\nYou have reached the Mysterious Fog. You can either walk through the fog or take a different path.");
                  // player has to pick fog or another path
               System.out.println("Enter 1 to walk through the fog or 2 to take a different path.");
               String fog = sc.nextLine();
               
                   //if they choose to go through the fog
               if (fog.equals("1")){
                  System.out.print("You blindly walk through and hit your head on a branch.");
                     //loss of health
                  health -= 5;
                  System.out.println("You are at " + health + "% health.");}
                   //if they choose to take another path
               if (fog.equals("2")){
                  System.out.print("You take a different path and see a shiny crystal!");
                  System.out.print("Enter 1 to pick up the crystal or 2 to leave it.");
                  crystal = sc.nextLine();}
               
                   //if they choose to pick up the crystal(health gain)
               if (crystal.equals("1")){
                  System.out.println("You pick up the crystal and it lights up the entire area around you.");
                  System.out.println("The crystal gives you a surge of energy and you instantly feel stronger!");
                  health += 10;
                  System.out.println("You are at " + health + "% health.");}
               
                   //if they choose to leave it
               if (crystal.equals("2")){
                  System.out.println("You leave the crystal and continue on your journey. But you feel the dread of unused potential as you walk away.");
                  
                  System.out.println("You hear voices and carages in the distance.");
                  System.out.println("You follow the sounds to a small but busy market. You are bombarded by some crazy man.");
                  System.out.println("He asks you to play a game of rock paper scissors with him.");
                  System.out.print("'Will you play a simpe game?? You're going to LOVE the prize if you win!' He says. Enter 1 to play or 2 to walk away.");
                  game = sc.nextLine();}
                  
               if (game.equals("1")){
                  System.out.println("Ah yes! You have chosen to play the game. You will play against the man.");
                  System.out.print("Enter 1 for rock, 2 for paper, or 3 for scissors.");
                  rps = sc.nextLine();
                  
                  if (rps.equals("1")){
                     System.out.println("You chose rock.");
                     System.out.println("The man chose paper, you have lost the game. And your life!");
                     health = 0;}
                     
                  if (rps.equals("2")){
                     System.out.println("You chose paper.");
                     System.out.println("The man chose scissors, you have lost the game. And your life!");
                     health = 0; }
                     
                  if (rps.equals("3")){
                     System.out.println("You chose scissors.");
                     System.out.println("The man chose paper! Huh, usually this is where youd die..");
                     System.out.println("You have won the game! The man can't believe he couldn't kill this player, and he frantically runs off into the woods.");
                     System.out.println("As he runs away he drops a potion bottle. You pick it up.");
                     System.out.print("Do you drink the potion? Enter 1 to drink or 2 to leave it.");
                     potion = sc.nextLine();
                     
                  
                     if (potion.equals("1")){
                        System.out.println("You drink the potion and instantly feel weaker!");
                        System.out.println("You have drank the man's poison!! He laughs as he creeps out of the woods and watches you die.");
                        health = 0;
                     }
                     else if (potion.equals("2")){
                        System.out.println("You turn the bottle in your hand and read in big red letters, 'LETHAL FROM JUST ONE DROP'");
                        System.out.println("You leave the potion and continue on your journey, good thing you read the label...");
                     }
                     }
               }
            }
            
            if (health < 0){
               System.out.println("Game over! Sorry, but you have died.");
               break;
            }
         }
         
         if (health > 0)
         {//last
          // reaches Landslide
            System.out.println(" Oh no! LANDSLIDE!");
            System.out.println("What will you do?- run straight, run left, or don't run?");
            String landslide = sc.nextLine();
          
          // player runs straight in landslide 
            if (landslide.equals("run straight")){
               System.out.println("You successfully ran away. You Survived! Your health is at " + health);
            
            // you reach a temple 
               System.out.println("You continue on and reach an ancient temple. You can enter or continue on the path. What will you do? (enter or continue)");
               String temple = sc.nextLine(); 
            
            // you enter the temple
               if (temple.equals("enter")){
                  System.out.println("You enter the temple and find a statue room do you take the statue or leave it?(take or leave)");
                  String statue = sc.nextLine();
                  
               // you take statue
                  if (statue.equals("take"))
                  {
                     System.out.println("You take the statue, the walls around you start crumbling and a giant boulder starts rolling towards you. you run and don't make it");
                     System.out.println("Have you learned nothing from Indiana Jones?");
                     health = 0;}
               // you leave the statue
                  if (statue.equals("leave")){
                     health = health - 20;
                     System.out.println("you choose to leave the statue while walking out you get struck by an arrow in the knee from a trap");
                     System.out.println("Your health is at " + health);
                     System.out.println("You walk on your injured knee till you see smoke in the distance you run till you make it to a village. Congrats you escaped the Woods!");
                     System.out.println(" you survived with "+ health+" health");
                  }
               }
            
            
            // you don't go into the temple
               if (temple.equals("continue")){
                  System.out.println("you continue on the path and find your way back to civilization you made it out of the Woods Congrats.");
                  System.out.println(" you survived with "+ health+" health"); 
               }
            }//straight
          
          // you run left in landslide 
            if (landslide.equals("run left")) {
               health = health - 50;
               System.out.println("You have come to a dead end. Oh No! the landslide comes closer. -50 heath, your health is now at "+ health);
            
            // you reach the cannibal camp
               System.out.println(" even though you are hurt you continue on, eventually you reach a camp of cannibals do you go in to see if they have supplies that could aid you or try to walk past? (go in or walk past)");
               String cannibal = sc.nextLine();
            
            // you go into cannibal camp
               if (cannibal.equals("go in")){
                  System.out.println("you enter and get attacked by the cannibals they tie you up and roast you on the fire");
                  health = 0;
                  System.out.println("they ate good at your expense HAHA");}
            
            // they walk past the cannibals
               if(cannibal.equals("walk past")){
               
                  System.out.println(" you get away safely and but trip over a rock -10 health");
                  health = health - 10;
                  System.out.println("Your health is now at " + health);
                  System.out.println("After a while you make it to civilization once again. Congrats you made it out of the woods");
                  System.out.println(" you survived with "+ health+" health"); 
               }
            
            }// run left
         
         
         
         
         
         // player dosn't run in landslide
            if(landslide.equals("don't run")){
               health = 0;
               System.out.println("HAHA YOU DIED! Why wouldn't you run?! Your really dumb");
            }
         
         
            if (health > 0){
               System.out.println("\nCongratulations, You've finished with " + health + "% health");
               
            }
           
         }
         System.out.print("Do you want to play again?\nor\nPress 1 to shut down");
         user = sc.nextLine();
      }//while
   }//end main
}//end class
