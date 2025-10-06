class Player { 
  private static int numPlayers = 0;
  private String name;
  private int hp;
  private int direction;
  private int x;
  private int y;
  private int z;
 
  public Player() {
    this("P" + (numPlayers + 1), 0, 0, 0); //instatiation
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
  public static int getNumPlayers() {
    return Player.numPlayers;
  }
  // Gets the x-coordinate of the current player
  public int getX() {
    return this.x;
  }
  // Gets the y-coordinate of the current player
  public int getY() {
    return this.y;
  }
  // Gets the z-coordinate of the current player
  public int getZ() {
    return this.z;
  }
  // Gets the current health of the player
  public int getHp() {
    return this.hp;
  }
  // Gets the direction of the player
  public int getDirection() {
    return this.direction;
  }
  // Sets the health of the player
  public void setHp(int hp) {
    if (hp < 0) {
      this.hp = 0;
    } else {
      this.hp = hp;
    }
  }
  // Moves the player by a given number of units in the specified direction
  public void move(int direction, int units) {
    if (direction == 1) {
      this.x += units;
    } else if (direction == 2) {
      this.x -= units;
    } else if (direction == 3) {
      this.y += units;
    } else if (direction == 4) {
      this.y -= units;
    } else if (direction == 5) {
      this.z += units;
    } else if (direction == 6) {
      this.z -= units;
    }
  }
  // Teleport the player to the given coordinates
  public void teleport(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  // Teleport the player to the position of the given player
  public void teleport(Player player) {
    this.x = player.getX();
    this.y = player.getY();
    this.z = player.getZ();
  }
  // Gets the distance between this player and another player
  public double getDistance(Player player) {
    return Math.sqrt(Math.pow(player.getX() - this.x, 2) +
            Math.pow(player.getY() - this.y, 2) +
            Math.pow(player.getZ() - this.z, 2));
  }

  // Gets the distance between this player and the given coordinates
  public double getDistance(int x, int y, int z) {
    return Math.sqrt(Math.pow(x - this.x, 2) +
            Math.pow(y - this.y, 2) +
            Math.pow(z - this.z, 2));
  }
  // Subtracts the damage dealt from the given player's hp, and adds half the
  // damage dealt to the attacking players hp
  public void attack(Player player, int damage) {
    player.setHp(player.getHp() - damage);
    this.hp += damage / 2;
  }
  // Sets the direction that the player is facing
  public void setDirection(int direction) {
    if (direction > 0 && direction < 7) {
      this.direction = direction;
    }
  }
  // Gets the player as a string in the specified format
  public String toString() {
    return "Name: " + this.name +
            "\nHealth: " + this.hp +
            "\nCoordinates: X " + this.x + " Y " + this.y + " Z " + this.z +
            "\nDirection: " + this.direction;
  }

  // Gets the player's name
  public String getName() {
    return this.name;
  }
}