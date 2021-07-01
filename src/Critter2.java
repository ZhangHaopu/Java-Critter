public class Critter2 extends Critter1 {


    public Critter2(String input) {
        super(input);
    }
    @Override
    public void sleep() {
        System.out.println( super.getName() +" sleeps.");
        super.getTiredness() = 0;
        foodLevel -= 3;
        exerciseLevel += 1;
        if (exerciseLevel == 10){
            System.out.println("You win");
            super.die();
        }
        else if (foodLevel <= 0) {
            System.out.println(name +" starves to death.");
            super.die();
        }

    }

}
