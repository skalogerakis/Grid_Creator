package MainPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass {

    /**Pass as parameters D, dimension of grid
     * and R(range of sensor)
    **/
    public static void main(String [ ] args){

        int D = 8;
        double R = 1.5;

        ArrayList[][] gridMaker = new ArrayList[D][D];
        ArrayList<Node> gridTest = new ArrayList<>();
        //Node n = new Node[D][D];

        FileCreator fc = new FileCreator();
        fc.FileInitCreator();

        int node_counter=0;

        int[][] coor = new int[D][D];


        for(int i = 0; i < D; i++){
            for(int j = 0; j < D; j++){
                //gridMaker
                coor[i][j] = node_counter;
                //Node gridPos = new Node(node_counter,gridMaker);
                Node gridPos = new Node(coor[i][j]);
                //Node n = gridMaker[i][j];
                //gridMaker[i][j] = node_counter;
                gridPos.checkNeighbours(i,j,D,R);
                //System.out.println(gridPos.neighbours.size());

                node_counter++;
            }
        }


    }
}
