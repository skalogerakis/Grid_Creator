package MainPackage;

import java.io.*;

public class FileCreator {

    //TODO change some declarations and clean code
    private static File directory = new File(".");  /**Get current directory to create topology or overwrite it*/
    File cFile;

    public FileCreator(){
        try{
//            cFile = new File(directory.getCanonicalPath() + File.separator + "topology.txt");
//            if (cFile.createNewFile())
//            {
//                System.out.println("File is created!");
//            } else {
//                System.out.println("File already exists.");
//            }
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


    public void createFile(int currNode, int neighNode){
        //System.out.println("currNode "+currNode+" neighbour "+neighNode);
        //File directory = new File(".");

        try{
//            FileWriter fileWriter = new FileWriter(cFile,true);
//            fileWriter.write(currNode + " " +neighNode+"\n");
//            fileWriter.close();

            FileOutputStream fsout = new FileOutputStream(directory.getCanonicalPath() + File.separator + "topology.txt",true);
            String data = currNode+" "+neighNode+"\n";
            fsout.write(data.getBytes());
            //fsout.close();
            //BufferedWriter br = new BufferedWriter(fileWriter);
            //PrintWriter outp = new PrintWriter(br);

            //System.out.println("currNode "+currNode+" neighbour "+neighNode);
        }catch(IOException io){
            System.out.println("Error!");
        }

    }
}
