import java.util.*;

public class ch3_dog {
    String name;
    public static void main(String[] args) {
    	ch3_dog dog1 = new ch3_dog();
        dog1.bark();
        dog1.name = "Bart";
        
        ch3_dog[] myDogs = new ch3_dog[3];
        myDogs[0] = new ch3_dog();
        myDogs[1] = new ch3_dog();
        myDogs[2] = dog1;
        
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        
        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);
        
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x+1;
        }
    }
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    
    public void eat() { }
    
    public void chaseCat() { }
}
