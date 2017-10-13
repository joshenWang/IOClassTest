import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 16:09 星期五
 *
 * @author: WJZ
 **/
public class PictureTrans {

    public static void main(String[] args) throws Exception {

        FileInputStream fi=new FileInputStream("d:\\1.jpg");
        FileOutputStream fo=new FileOutputStream("d:\\2.jpg");

        byte[] by=new byte[1024];
        int num=0;

        while((num=fi.read(by))!=-1)
        {
            fo.write(by,0,num);

        }

        fo.close();
        fi.close();



    }




}
