package guessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;

        int num = (int) (Math.random() * 10);
        System.out.println("I'm guessing a number...");

        while(true){
            System.out.println("The number is "+num);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.num;
            System.out.println("Player 1 guess: "+guessp1);

            guessp2 = p2.num;
            System.out.println("Player 2 guess: "+guessp2);

            guessp3 = p3.num;
            System.out.println("Player 3 guess: "+guessp3);

            if(guessp1 == num){
                p1Right = true;
            }
            if(guessp2 == num){
                p2Right = true;
            }
            if(guessp3 == num){
                p3Right = true;
            }

            if(p1Right || p2Right || p3Right){
                System.out.println("We have a winner!");
                System.out.println("Player 1 correct? "+p1Right);
                System.out.println("Player 2 correct? "+p2Right);
                System.out.println("Player 3 correct? "+p3Right);
                System.out.println("Game over");
                break;
            }else{
                System.out.println("Players must try again");
            }
        }
    }

}
