package MainPackage;

import java.io.*;

public class FileCreator {

    private static File directory = new File(".");  /**Get current directory to create topology or overwrite it*/
    File cFile;

    /**
     * Main Constuctor
     */
    public FileCreator(){
        try{

            FileOutputStream fsout = new FileOutputStream(directory.getCanonicalPath() + File.separator + "topology.txt",true);
        }catch(IOException io){
            System.exit(-1);
        }

    }

    public void FileInitCreator(){
        try{
            FileOutputStream fsout = new FileOutputStream(directory.getCanonicalPath() + File.separator + "topology.txt",false);
            fsout.flush();
            fsout.close();
        }catch(IOException io){
            System.exit(-1);
        }

    }

    /**
     * Called every time we find a neighbour
     * So we need to append data every time
     */
    public void createFile(int currNode, int neighNode){

        try{
            FileOutputStream fsout = new FileOutputStream(directory.getCanonicalPath() + File.separator + "topology.txt",true);
            String data = currNode+" "+neighNode+" -50.0"+"\n";
            fsout.write(data.getBytes());

        }catch(IOException io){
            System.out.println("Error!");
        }

    }
}
