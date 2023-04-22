package testGame;

public class NumberGuess {

    String name;
    int guess;

    NumberGuess(String name){
        this.name = name;
    }


    void makeGuess(){
        // ?input
        guess = (int)(Math.random()*10);
        System.out.println(name + "is guessing" + guess);



    }
}
