import java.util.Scanner;
public class RunAnimal 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String user_input = scanner.nextLine();
        
        

       if(user_input.equalsIgnoreCase("B")) {
       
            Bird bird = new Bird();
            System.out.println("Cat Loves to Eat" );
           
            bird.eat();
            bird.sleep();
            bird.makeSound();
            
       }
        if (user_input.equalsIgnoreCase("C"))
        {
           Cat cat = new Cat();
            System.out.println("Cat Love to Eat ");
            cat.eat();
            cat.sleep();
            cat.makeSound();
            
        }
        if (user_input.equalsIgnoreCase("D")){
            Dog dog = new Dog();
            System.out.println("Dog Loves to Eat");
            dog.eat();
            dog.sleep();
            dog.makeSound();
           
       }
    }
}