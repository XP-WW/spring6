import org.junit.Test;

/**
 * @author 苏禾
 * @version 1.0
 * @title test
 * @description <TODO description class purpose>
 * @create 2023/7/28 15:45
 * @since 1.0
 **/
public class test {
    @Test
    public void testException(){
        int a = 9;
        int b=0;
        try{
            int c = a / 5;
        }finally {
            System.out.println("ok");
        }


    }
}
