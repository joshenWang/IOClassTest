import java.io.InputStream;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 16:37 星期五
 *
 * @author: WJZ
 **/
public class SystemStream {


    public static void main(String[] args)throws Exception {


        InputStream in=System.in;

        StringBuilder sb=new StringBuilder();

        while (true)
        {
           int b= in.read();
           if(b=='\r')
               continue;
           if (b=='\n') {
               if ("over".equals(sb.toString()))
                   break;
               System.out.println(sb.toString());
               sb.delete(0, sb.length());
           }
           else

           sb.append((char)b);



        }






    }



}
