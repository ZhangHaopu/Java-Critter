public class Critter1 {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private int exerciseLevel;
    private String name;

    public Critter1(String input) {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        exerciseLevel = 0;
        name = input;
    }


    public int getTiredness(){
        return tiredness;
    }
    public int getFoodLevel(){
        return foodLevel;
    }
    public int getExer(){
        return exerciseLevel;
    }
    public String getName(){
        return name;
    }


    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println( name +" sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        exerciseLevel += 1;
        if (exerciseLevel == 10){
            System.out.println("You win");
            die();
        }
        else if (foodLevel <= 0) {
            System.out.println(name +" starves to death.");
            die();
        }

    }

    public void feed() {
        if (isAlive) {
            System.out.println(name +" eats.");
            foodLevel++;
            tiredness++;
            exerciseLevel++;
            if (exerciseLevel == 10){
                System.out.println("You win");
                die();
            }
            else if (foodLevel > 10) {
                System.out.println(name+" over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(name+" is sleepy from so much food.");
                sleep();
            }
        }
    }
}

