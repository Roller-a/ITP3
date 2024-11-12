public class Cow extends Animal {
    public Cow() {
        this.name = "Cow";
        this.weight = 1.5f;
        this.height = 1.5f;
        this.color = "blue";
        System.out.println("Animal: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
    }
    Animal eat = new Animal().eat(name);
    Animal sleep = new Animal().sleep();
    Animal makeSound = new Animal().makeSound();
}
