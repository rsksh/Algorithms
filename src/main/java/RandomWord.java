import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
/*
        String challenger = "";
        String champ = StdIn.readString();
        StdOut.print("Initial Champ:");
        StdOut.println(champ);

        int count = 1;
        while (!StdIn.isEmpty()) {
            count++;
            challenger = StdIn.readString();
            StdOut.print("A new Challenger approaches:  ");
            StdOut.println(champ);

            if (StdRandom.bernoulli((1.0/count))) {
                champ = challenger;
                StdOut.println("Yes, Change the champ to the challenger");
            } else {
                StdOut.println("No, the champ should remain unchanged");
            }
            StdOut.print("Current champ: ");
            StdOut.println(champ);
        }
        StdOut.println(champ);


 */

        String challenger = "";
        String champ = StdIn.readString();
      //  StdOut.print("Initial Champ:");
    //    StdOut.println(champ);

        int count = 1;
        while (!StdIn.isEmpty()) {
            count++;
            challenger = StdIn.readString();
     //       StdOut.print("A new Challenger approaches:  ");
    //       StdOut.println(champ);

            if (StdRandom.bernoulli((1.0/count))) {
                champ = challenger;
      //          StdOut.println("Yes, Change the champ to the challenger");
            }
      //      StdOut.print("Current champ: ");
            StdOut.println(champ);
        }
        StdOut.println(champ);
    }
}