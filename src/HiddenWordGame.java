import java.util.Scanner;
public class HiddenWordGame {
    private String secret;
    private String guess;
    private String hint;

    Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        HiddenWordGame game = new HiddenWordGame();
        game.run();
    }

    public void run() {
        System.out.println("Enter a secret word and tell no one.");
        secret = kb.nextLine();
        System.out.println("The game is afoot! Guess a " + secret.length() + " letter word.");
        guess = kb.nextLine();
        while (!guess.equals(secret)) {
            hint = "";
            for (int x = 0; x < secret.length(); x++) {
                if (guess.substring(x, x+1).equals(secret.substring(x, x+1))) {
                   hint += guess.substring(x, x+1);
                }
               else if (secret.indexOf(guess.substring(x, x+1)) != -1) {
                    hint += "+";
                }
               else {
                    hint += "*";
                }

            }
            System.out.println(hint);
            System.out.println("Guess again!");
            guess = kb.nextLine();
        }
        System.out.println("you won!!");
    }
    }

