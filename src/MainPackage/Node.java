package MainPackage;


import java.util.ArrayList;

public class Node {

    ArrayList<Integer> neighbours = new ArrayList<>();

    private FileCreator  fcr = new FileCreator();
    private int id, D;
    private int[][] nodes = new int[D][D];
    private int[][] neighboursCoor = new int[D][D];

    /**
     *Constructors for Node class. The second constructor would be used in another implementation
     * Right now, it is not used
     * @param id Node's ID
     * @param dimensions Dimensions of grid (D*D)
     */
    public Node(int id, int dimensions){
        this.id = id;
        this.D = dimensions;
//        ArrayList<Node> neighboursC;
    }

    public Node(int[][] nodes){
        this.nodes = nodes;
//        int id;
//        ArrayList<Node> neighbours;
    }


    /**
     * checkNeighbours finds for every node given its coordinates, all the neighbours
     * within specific range. Could be also implemented in another way but the final
     * approach(and the most simple) that we followed is that every time we find a neighbour we append in
     * topology.txt
     */

    public void checkNeighbours(int row, int column, int dimension, double range){
        int node_counter=-1;

        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                node_counter++;
                double coordX = Math.pow((double)i-(double)row,2);
                double coordY = Math.pow((double)j-(double)column,2);
                double distance = Math.sqrt(coordX+coordY);

                //it means that we found the spot are so continue with the next loop
                if(distance == 0.0){
                    continue;
                }

                if(distance <= range){
                    neighbours.add(node_counter);
                    //Node gridPos = new Node(neighboursCoor[i][j]);
                    //neighboursC.add(gridPos);
                    fcr.createFile(this.id, node_counter);
                }else{
                    continue;
                }

            }
        }
    }
}
