package v1ch01;

import org.junit.Before;

/**
 * 类：测试
 * 编写人：kujin
 * 创建时间：2020/6/6
 * 修改时间：2020/6/6
 */
public class Test {

    @org.junit.Test
    public void Test1(){
        System.out.println(gcd(6,9));
    }

    /**
     * 计算两个非负整数 p 和 q 的最大公约数：
     * 若q 是 0，则最大公约数为 p。
     *                      否则，将 p 除以 q 得到余数 r，
     * p 和 q 的最大公约数即为
     *                      q 和 r 的最大公约数。
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}

