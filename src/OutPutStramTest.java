import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 15:36 星期五
 *
 * @author: WJZ
 **/
public class OutPutStramTest {

    public static void main(String[] args)throws Exception {

        FileOutputStream fo=new FileOutputStream("d:\\demo4.txt");

        fo.write("abcdefghijklmneeee".getBytes());


        fo.close();



      FileInputStream fi=new FileInputStream("d:\\demo4.txt");

        int num=0;
        byte[] by=new byte[1024];

        while ((num=fi.read(by))!=-1)
        {
            System.out.print(new String(by,0,num));
        }


        fi.close();



    }


}
