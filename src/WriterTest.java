import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Title:
 * description:
 * Create Time: 2017/10/12 21:44 星期四
 *
 * @author: WJZ
 **/
public class WriterTest {


    public static void main(String[] args) throws IOException {

       /*    FileWriter fw=null;
        try {

             fw=new FileWriter("d:\\demo.txt",true);

             fw.write("dsfds\r\negjehfkerk");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(fw!=null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }*/


        FileReader fr=null;

        try {
            fr=new FileReader("d:\\demo.txt");


         while(true)
         { 
             int ch=fr.read();
             if(ch==-1)
                break;
             System.out.println(ch);

         }


        } catch (FileNotFoundException e) {


            e.printStackTrace();

        } finally {

            if(fr!=null)
            {


                try {
                    fr.close();

                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }


    }






}
