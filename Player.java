class Player { 
  private static int numPlayers = 0;
  private String name;
  private int hp;
  private int direction;
  private int x;
  private int y;
  private int z;
 
  public Player() {
    this("P" + (numPlayers + 1), 0, 0, 0); //default constructor
  }
  public Player(String name, int x, int y, int z) {
    this(name, x, y, z, 20, 1);
  }
  public Player(String name, int x, int y, int z, int hp, int direction) {
    this.name = name;
    this.x = x;
    this.y = y;
    this.z = z;
    setHp(hp);
    this.direction = 1;
    setDirection(direction);
    numPlayers += 1;
  }
 
 
  // Gets the total number of players


  
  // Gets the x-coordinate of the current player


  
  // Gets the y-coordinate of the current player


  
  // Gets the z-coordinate of the current player


  
  // Gets the current health of the player


  
  // Gets the direction of the player


  
  // Sets the health of the player
  
    
      
    
   


  // Moves the player by a given number of units in the specified direction














  
  // Teleport the player to the given coordinates
  



  
  // Teleport the player to the position of the given player





  
  // Gets the distance between this player and another player



  

  // Gets the distance between this player and the given coordinates




  
  // Subtracts the damage dealt from the given player's hp, and adds half the
  // damage dealt to the attacking players hp




  
  // Sets the direction that the player is facing






  
  // Gets the player as a string in the specified format







  

  // Gets the player's name



  
}
