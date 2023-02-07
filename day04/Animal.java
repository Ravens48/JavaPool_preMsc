public class Animal{
    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;

    private Type type;
    private String name;
    private int legs;

    // overload operator
    protected enum Type{
        MAMMAL {
            @Override
            public String toString() {
                return "mammal";
            }
        },
        FISH {
            @Override
            public String toString() {
                return "fish";
            }
        },
        BIRD {
            @Override
            public String toString() {
                return "bird";
            }
        };
    }

    protected Animal(String animalName, int nLegs, Type animalType) {
        this.name = animalName;
        this.legs = nLegs;
        this.type = animalType;
        System.out.println("My name is " +animalName + " and I am a "+ animalType.toString()+"!");
        numberOfAnimals++;
        if (animalType == Type.MAMMAL)
            numberOfMammals++;
        if (animalType == Type.BIRD)
            numberOfBirds++;
        else if (animalType == Type.FISH)
           numberOfFish++;
    }

    //------getter and setter//////

    public String getName() {
        return this.name;
    }

    public int getLegs() {
        return this.legs;
    }

    public String getType() {
        return this.type.toString();
    }

    public static int getNumberOfAnimals() {
        //There is(are) currently [x] animal(s) in our world.
        if (numberOfAnimals == 1)
            System.out.println("There is currently "+ numberOfAnimals + " animal in our world.");
        else
            System.out.println("There are currently "+ numberOfAnimals + " animals in our world.");
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        //There is(are) currently [x] animal(s) in our world.
        if (numberOfMammals == 1)
            System.out.println("There is currently "+ numberOfMammals + " mammal in our world.");
        else
            System.out.println("There are currently "+ numberOfMammals + " mammals in our world.");
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1)
            System.out.println("There is currently "+ numberOfFish + " fish in our world.");
        else
            System.out.println("There are currently "+ numberOfFish + " fish in our world.");
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if (numberOfBirds == 1)
            System.out.println("There is currently "+ numberOfBirds + " bird in our world.");
        else
            System.out.println("There are currently "+ numberOfBirds + " birds in our world.");
        return numberOfBirds;
    }
}