package wang.lvshang.blog;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

/**
 * LocalDateFactory Tester.
 *
 * @author <Authors name>
 * @since <pre>10�� 26, 2022</pre>
 * @version 1.0
 */
public class LocalDateFactoryTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: fromInt(int yyyyMMdd)
     *
     */
    @Test
    public void testFromInt() throws Exception {
            //TODO: Test goes here...
        LocalDate date1 = LocalDateFactory.fromInt(20000112);
        LocalDate local1 = LocalDate.of(2000, 1, 12);
        Assertions.assertEquals(date1, local1);
    }



}
