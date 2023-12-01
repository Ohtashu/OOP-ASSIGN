import java.util.Scanner;
public class ReadyPlayer implements Player, Story, username, Play{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
ReadyPlayer ready = new ReadyPlayer();

    String PlayerName = ready.userinput();
int selectedMode = ready.Mode();
if(selectedMode == 1)
{
ready.Story(PlayerName, selectedMode);
if(scanner.nextLine().equalsIgnoreCase("p"))
{

    ready.storyGame();
}
}
else if(selectedMode == 2)
{
ready.Survival(PlayerName, selectedMode);
if(scanner.nextLine().equalsIgnoreCase("p"))
{
ready.survivalGame();
     
}


}
    }
    public void Story(String userinput, int Mode)
    {
        System.out.println("___________________________________________");
        System.out.println("\nEntered in Story Mode ");
        System.out.println("Press P to start playing, " + userinput);
    }

    public void Survival(String userinput, int Mode) {
        System.out.println("___________________________________________");
        System.out.println("\nEntered in Survival Mode ");
        System.out.println("Press P to start playing, " + userinput);
    }


    public int Mode()
    {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Press 1 or 2 to select your game mode.");
     System.out.println("1 - Story");
     System.out.println("2 - Survival");


     return scanner.nextInt();

    }
    
    public String userinput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");

        return scanner.nextLine();
    }
    public void storyGame() {
        System.out.println("In the mystical realm of Eldoria, where magic and mystery intertwine," 
        + " \na prophecy foretells the rise of a chosen one –"+
        "\nthe Arcane Heir. This chosen individual is destined to wield unimaginable \npowers and restore balance to a world on the brink of chaos.");
        
    }

    public void survivalGame() {
       System.out.println("Game Has Started");
    }
}