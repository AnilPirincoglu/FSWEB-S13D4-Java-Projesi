public class Player {
    private String name;
    private int healthPercentage;
    Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage > 100 ? 100 : Math.max(healthPercentage, 0);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0)
            System.out.println(name + " player has been knocked out of game");
    }

    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if (healthPercentage > 100)
            healthPercentage = 100;
    }

    @Override
    public String toString() {
        return "Name= " + name.toUpperCase() + '\n' +
                "Health= " + healthPercentage + '\n' +
                "Weapon= " + weapon + '\n' +
                '}';
    }
}
