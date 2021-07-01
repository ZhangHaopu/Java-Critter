public class Apple extends Food{
    int tired = 1;
    int ex = 3;
    int hunger = 2;
    void applyFood(Critter1 creature){
        creature.writeFoodLevel(creature.getFoodLevel()+hunger);
        creature.writeEx(creature.getExer()+ex);
        creature.writeTiredness(creature.getTiredness()+tired);
    }
}