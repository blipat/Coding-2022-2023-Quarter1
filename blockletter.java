public class blockletter {
    public static void main(String[] args){
        World habitat = new World(300, 300);

        Turtle yertle = new Turtle(habitat);

        yertle.forward(50);
        habitat.show(true);


    }
}