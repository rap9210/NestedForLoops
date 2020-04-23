import javax.swing.plaf.synth.SynthMenuBarUI;

public class NestedForLoops {
    public static void main(String[] args){

       /*
       Each for loop executes only once. Use .repeat() to fill in
       as many of that number I need the one time it runs.
        */
        int i, j, k, l, m, n, o, p ,q;
        for (i=1;i>0; i--){
            System.out.println("1");
            for (j=1; j>0; j--){
                System.out.println("2".repeat(2));
                for (k = 1; k>0;k--){
                    System.out.println("3".repeat(3));
                    for (l=1; l>0; l--){
                        System.out.println("4".repeat(4));
                        for (m=1; m>0; m--){
                            System.out.println("5".repeat(5));
                            for (n=1; n>0; n--){
                                System.out.println("6".repeat(6));
                                for (o=1; o>0;o--){
                                    System.out.println("7".repeat(7));
                                    for (p=1; p>0; p--){
                                        System.out.println("8".repeat(8));
                                        for(q=1; q>0; q--){
                                            System.out.println("9".repeat(9));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
