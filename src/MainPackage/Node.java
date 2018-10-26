package MainPackage;

import sun.nio.cs.ext.MacThai;

import java.util.ArrayList;

public class Node {

    ArrayList<Integer> neighbours = new ArrayList<>();
    //TODO change that
    int D = 8;
    int[][] nodes = new int[D][D];
    int[][] neighboursCoor = new int[D][D];
    private FileCreator  fcr = new FileCreator();
    private int id;

    public Node(int id){
        this.id = id;
//        int id;
//        ArrayList<Node> neighbours;
    }


    public Node(int[][] nodes){
        this.nodes = nodes;
//        int id;
//        ArrayList<Node> neighbours;
    }



    public void checkNeighbours(int row, int column, int dimension, double range){
        int node_counter=-1;
        //System.out.println("Coordinates:" +row+" ,"+column);
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                node_counter++;
                //System.out.println("Id "+this.id+ " and row "+i+" and column "+j);
                //double test = ;
                double coordX = Math.pow((double)i-(double)row,2);
                double coordY = Math.pow((double)j-(double)column,2);
                double distance = Math.sqrt(coordX+coordY);

                //it means that we found the spot are so continue with the next loop
                if(distance == 0.0){
                    //System.out.println("Skip");
                    continue;
                }

                if(distance <= range){
                    //System.out.println("Id "+this.id+ " and neighbour coordinates "+i+" ,"+j+" and distance "+distance+" and"+node_counter);
                    neighbours.add(node_counter);
                    fcr.createFile(this.id, node_counter);

                    //Node gridPos = new Node(neighboursCoor[i][j]);
                    //neighbours.add(gridPos);
//                    neighbours.add();
                }else{
                    continue;
                }

            }
        }
    }
}
