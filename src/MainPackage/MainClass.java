package MainPackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    /**Pass as parameters D(dimension of grid)
     * and R(range of sensor). Pass as terminal parameters if there is time
    **/
    //final static int D = 4;
    static int D;
    static float R;
    //final static double R = 1.5;

    public static void main(String [ ] args){

        /**
         * At the start overwrite topology.txt if exists
         */
        FileCreator fc = new FileCreator();
        fc.FileInitCreator();

        Scanner reader = new Scanner(System.in);

        try{
            System.out.println("Enter D(dimension of grid):" );
            D = reader.nextInt();

            /**
             * Input for Range must be float otherwise the program
             * will fail. ex 1.5 will fail, 1,5 will run as expected
             */
            System.out.println("Enter R(range):" );
            R = reader.nextFloat();
        }catch (InputMismatchException io){
            System.out.println("Non valid input was given. Terminating.....");
            System.exit(-1);
        }


        if(D <= 0 || R <= 0){
            System.out.println("Non valid grid dimension or range was given. Terminating.....");
            System.exit(-1);
        }

        int node_counter=0;

        int[][] coor = new int[D][D];

        for(int i = 0; i < D; i++){
            for(int j = 0; j < D; j++){
                /**
                 * Could implement in another way but we used 2D array to approach
                 * grid layout. Node counter is the id of every Node
                 */
                coor[i][j] = node_counter;
                Node gridPos = new Node(coor[i][j], D);
                gridPos.checkNeighbours(i,j,D,R);

                node_counter++;
            }
        }


    }
}
