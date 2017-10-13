import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 17:26 星期五
 *
 * @author: WJZ
 **/
public class ChangeStream {

    public static void main(String[] args)throws Exception {


        FileInputStream fi=new FileInputStream("d:\\demo.txt");

        InputStreamReader ism=new InputStreamReader(fi,"GBK");
        BufferedReader buf=new BufferedReader(ism);
        String line=null;
        while ((line=buf.readLine())!=null)
        {
            System.out.println(
                    line.toString()
            );


        }


    }




}
