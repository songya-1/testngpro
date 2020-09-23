
import com.ryan.HelloWorld;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {


    /* 测试返回结果不为空 */
    @Test
    public void tester1(){
        HelloWorld hello = new HelloWorld();
        String helloworld = hello.hello();

        Assert.assertNotNull(helloworld);
    }

    //测试返回结果为”hello world !“字符串
    @Test
    public void tester2(){
        HelloWorld hello = new HelloWorld();
        String helloworld = hello.hello();
        System.out.println(helloworld);

        Assert.assertEquals(helloworld, "hello world !");
    }
}
