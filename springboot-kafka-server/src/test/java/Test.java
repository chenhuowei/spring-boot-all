import com.fireway.kafka.Application;
import com.fireway.kafka.service.DubboProviderService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/17 14:39
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test {

    @Autowired
    private DubboProviderService dubboProviderService;

    @org.junit.Test
    public void testService(){
        System.out.println(dubboProviderService.providerStr("test"));
    }


}
