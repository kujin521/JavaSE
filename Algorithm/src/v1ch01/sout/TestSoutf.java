package v1ch01.sout;

import org.junit.Test;

/**
 * 类：字符串输出
 * 编写人：kujin
 * 创建时间：2020/6/7
 * 修改时间：2020/6/7
 */
public class TestSoutf {

    @Test
    public void testSout(){
        System.out.print("打印输出不换行");
        System.out.println("打印输出换行");
        System.out.printf("%.2f",2.125);
    }
}
