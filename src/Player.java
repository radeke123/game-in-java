public  class Player {
    String name;
    int age;
    int health = 100;

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

    public void Heal(int amount) {
        health += amount;
    }

    public void takeDamage(int amount) {
        health -= amount;
    }
} 