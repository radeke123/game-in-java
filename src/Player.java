public  class Player {
    boolean gameIsRunning;
    String name;
    int age;
    int health = 100;
    double exp = 0;
    int lvl = 0;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public void heal(int amount) {
        health += amount;
        if (health > 250) {
        health = 250;
    }
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
        health = 0;
        }
    }

    public void giveExp(int amount) {
        exp += amount;
        nextLevel();
    }

    public void nextLevel() {
        if (exp >= 10) {
        lvl++;
        exp = 0;
        }
    }
} 