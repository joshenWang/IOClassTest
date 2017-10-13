import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Title:
 * description:
 * Create Time: 2017/10/13 11:18 星期五
 *
 * @author: WJZ
 **/
public class BufferWriterTest {


    public static void main(String[] args) throws IOException {

        FileWriter fw= new FileWriter("d:\\demo2.txt");



        BufferedWriter bufw=new BufferedWriter(fw);

        for (int i = 0; i <20 ; i++) {

            bufw.write("abcdefg");
            bufw.newLine();

            bufw.flush();



        }


        bufw.close();





    }




}
