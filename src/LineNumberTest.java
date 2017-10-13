import java.io.*;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 15:25 星期五
 *
 * @author: WJZ
 **/
public class LineNumberTest {


    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d:\\demo1.txt");
        LineNumberReader lnr=new LineNumberReader(fr);
        String line=null;
        while((line=lnr.readLine())!=null)
        {

            System.out.println(lnr.getLineNumber()+":::::::"+line);


        }





    }


}
