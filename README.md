# Text-RPG  
This project is intended as a way to consolidate skills learned over the duration of the course so far.  
The goal is to create simple text-based RPG where the user can navigate to find some treasure, interacting through the command-line.
  
## Requirements:
* Java 8 / JDK 13
* Lombok 1.18.x *(included in POM)*
* ImageIO 3.4.x *(included in POM)*
  
## Running the code:  
'Runner.java' under `src/main/java` contains the main method. Running this will start the application.  
  
I have used a fairly simple command structure to control this program - a command, and if relevant a direction.  
i.e: `WALK FORWARD` will cause the character to walk forward.  
  
The program will let you know if you put in an incorrect command / need something more.  
(Note: This program is *NOT* case sensitive)
  
## Testing:
  
## Acknowledgements: 
* [Nick Johnson](https://github.com/nickrstewarttds) - Training in Java
* [Alan Davies](https://github.com/MorickClive) - Training in Testing technologies
* [Ben Ranson](https://github.com/Benoniy) - Worked on the [GameJam project](https://github.com/Benoniy/game-jam-2020) with me, from which I borrowed the code for generating a map from an image.