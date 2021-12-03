package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)

        Pyramid newPyramid = new Pyramid();
        newPyramid.Output();

        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)

        Adlibs newStory = new Adlibs();
        System.out.println(newStory.story("Katie", "26", "Pink"));
        

        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        
        Replace newReplace = new Replace();
        System.out.println(newReplace.charReplace("I MAKE BREAD", 2, 'T')); 

    }
}
