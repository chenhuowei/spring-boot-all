import com.fireway.dubbo.Application;
import com.fireway.dubbo.service.DubboProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/17 16:12
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest {

    @Autowired
    private DubboProviderService dubboProviderService;

    @Test
    public void test(){
        System.out.println(dubboProviderService.providerStr("消费者请求..."));
    }
}
