public class Critter2 extends Critter1 {


    public Critter2(String input) {
        super(input);
    }
    @Override
    public void sleep() {
        System.out.println( super.getName() +" sleeps.");
        super.writeTiredness(0);
        super.writeFoodLevel(super.getFoodLevel()-3);
        super.writeEx(super.getExer()+1);
        if (super.getExer() == 10){
            System.out.println("You win");
            super.die();
        }
        else if (super.getFoodLevel() <= 0) {
            System.out.println(super.getName() +" starves to death.");
            super.die();
        }
        // Actually we dont have to override anything here for the sleep() since "Zzz" is implemented in the App, so by adding the selector in App, we are done

    }

}
