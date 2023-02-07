public class Cat extends Animal {
    private String color = "grey";
    public Cat(String catName, String catColor) {
        super(catName, 4, Type.MAMMAL);
        System.out.println(catName+ ": MEEEOOWWWW");
        if (catColor != null)
            this.color = catColor;
    }
    public Cat(String catName) {
        super(catName, 4, Type.MAMMAL);
        System.out.println(catName+ ": MEEEOOWWWW");
    }


    //------method----------------
    public void meow(){
        System.out.println(super.getName()+ " the "+ this.color+ " kitty is meowing.");
    }

    //------getter and setter------
    public String getColor() {
        return this.color;
    }
}
