import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 10:45 星期五
 *
 * @author: WJZ
 **/
public class Copy {


    public static void main(String[] args) {

        copy_1();




    }


    public static void copy_1(){

        FileWriter fw=null;
        FileReader fr=null;
        try {

            fr=new FileReader("d:\\demo.txt");

            fw=new FileWriter("d:\\demo1.txt",true);

            char[] ch=new char[1024];

            int num=0;

            while((num=fr.read(ch))!=-1)
            {

                fw.write(ch,0,num);

            }

            fw.flush();




        } catch (IOException e) {

            e.printStackTrace();

        }

        finally
        {
            if(fw!=null)
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            if(fr!=null)
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }




}
