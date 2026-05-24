class Bicycle {

    // Owner object instead of name and phone
    private Owner owner;

    // No-Argument Constructor
    public Bicycle() {
        owner = new Owner();
    }

    // Parameterized Constructor
    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Getter method
    public Owner getOwner() {
        return owner;
    }

    // Setter method
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}