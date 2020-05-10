import java.time.ZonedDateTime;

/**
 * Created By Halen 2020/5/10 16:07
 */
public class Test {

    @org.junit.Test
    public void test1() {
        ZonedDateTime zbj = ZonedDateTime.now();// 默认时区
        System.out.println(zbj);
    }

}
