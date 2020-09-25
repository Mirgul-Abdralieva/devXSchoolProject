package mirgulHomeWorkAugust;

public class FishMaster {
    public static void main (String[] args){
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(3);
        String fishReaction;
        fishReaction = myFish.say("Hello");
        System.out.println(fishReaction);

        myFish.sleep();
    }
}
