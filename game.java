package testGame;

public class game {

    int expectedGuess;
    NumberGuess p1,p2,p3;

    //Constructor
    game(String name1, String name2, String name3){
        p1= new NumberGuess(name1);
        p2= new NumberGuess(name2);
        p3= new NumberGuess(name3);

    }

    boolean checkWinner(){
        if(p1.guess == expectedGuess){
            System.out.println(p1.name + "Wins!");
            return true;
        }
        else if(p2.guess == expectedGuess){
            System.out.println(p2.name + "Wins!");
            return true;
        }
        else if(p3.guess == expectedGuess){
            System.out.println(p3.name + "Wins!");
            return true;
        }
        return false;

    }

    void start(){
        //launch the game
        System.out.println("Welcome to the Game" + p1.name + p2.name + p3.name);
        expectedGuess = (int)(Math.random()*10);


        while(true){
            System.out.println("Number to guess is " + expectedGuess);
            p1.makeGuess();
            p2.makeGuess();
            p3.makeGuess();
            boolean someOneWins = checkWinner();
            if(someOneWins){
                System.out.println("Game Over");
                break;
            }else{
                expectedGuess = (int)(Math.random()*10);
            }
        }
    }
}
