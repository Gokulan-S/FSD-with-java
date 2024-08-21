import java.io.File;
import java.io.IOException;
public class CreateFile{
    public static void main(String [] args){
        try{
            File myob=new File("myfile.txt");
            if(myob.createNewFile()){
                System.out.println("file is created "+myob.getName());
                
            }
            else{
                System.out.println("File is not created");

            }
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
