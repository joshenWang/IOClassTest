import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 21:53 星期五
 *
 * @author: WJZ
 **/
public class InputStramReader {

    public static void main(String[] args)throws Exception {

        InputStream in=new FileInputStream("d://demo.txt");

        InputStreamReader inr=new InputStreamReader(in);

        BufferedReader br=new BufferedReader(inr);

        String line=null;
        while((line=br.readLine())!=null)
        {

            System.out.println(line);

        }



    }



}
