//practice and encapsulation
 public class Monsters {
    private String name;
    private int health;
    private int attackPower;
    private boolean flight;
    private String elementType;

    public Monsters(String name, int health, boolean flight, int attack, String element){
        this.name = name;
        this.health = health;
        this.attackPower = attack;
        this.flight = flight;
        this.elementType = element;
    }
//Getters and Setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setFlight(boolean flight){
        this.flight = flight;
    }

    public boolean getFlight(){
        return flight;
    }

    public void setElementType(String element){
        this.elementType = element;
    }

    public String getElementType(){
        return elementType;
    }

    public String toString(){
        return "Name: " + name + ","+ " health: " + health + ", " + "flight: " + flight +", " +  "attack power: " + attackPower + "," + " element: " + elementType + "\n";
    }
}
