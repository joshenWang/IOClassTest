import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Title:
 * description:
 * Create Time: 2017/10/12 22:27 星期四
 *
 * @author: WJZ
 **/
public class ReaderTest {

    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("d://demo.txt");

        char[] ch=new char[1024];
         int num=0;
         while ((num=fr.read(ch))!=-1) {
             System.out.println("num>>>>>>" + num + "         String>>>>>>" + new String(ch,0,num)+"j");
         }

    }
}
