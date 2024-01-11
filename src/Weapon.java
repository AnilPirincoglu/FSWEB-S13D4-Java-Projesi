public enum Weapon {
    MP7(10),
    AUG(15),
    M4A4(20),
    Revolver(10),
    AWP(75);

    private final int damage;
    Weapon(int damage) {
        this.damage=damage;
    }

    public int getDamage() {
        return damage;
    }
}
