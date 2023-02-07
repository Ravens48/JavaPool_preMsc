public class Canary extends Animal {
    private int eggs;
    public Canary(String canaryName) {
        super(canaryName, 2, Type.BIRD);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }


    //-----method--------
    public int getEggsCount(){
        return this.eggs;
    }

    public void layEgg() {
        this.eggs++;
    }
}
