package MainPackage;

import java.util.ArrayList;

public class MainClass {

    /**Pass as parameters D(dimension of grid)
     * and R(range of sensor). Pass as terminal parameters if there is time
    **/
    final static int D = 4;
    final static double R = 1.5;

    public static void main(String [ ] args){

        /**
         * At the start overwrite topology.txt if exists
         */
        FileCreator fc = new FileCreator();
        fc.FileInitCreator();

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
