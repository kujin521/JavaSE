package v1ch01.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * 类：数组的使用
 * 编写人：kujin
 * 创建时间：2020/6/6
 * 修改时间：2020/6/6
 */
public class CreateArray {
    //声明数组
    double[] a;
    //测试数量
    int N=5;
    //随机数范围
    int bound=100;

    @Before
    public void init(){
        //创建数组
        a=new double[N];
        Random random=new Random();
        for (int i = 0; i < N; i++) {
            //初始化数组
            a[i]=random.nextInt(10);
        }
    }

    @After
    public void desstory(){
        a=null;
    }

    /**
     * 数组别名
     */
    @Test
    public void alias(){
        double[] b=a;
        for (int i = 0; i < b.length; i++) {
            System.out.print(" "+a[i]);
            b[i]=7.7;
        }
        System.out.println("\n"+"数组a,b引用同一地址");
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
    }

    /**
     * 找出数组中的最大数
     */
    @Test
    public void maxSum(){
        double max=a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            if (a[i]>max) max=a[i];
        }
        System.out.println("最大数："+max);
    }

    /**
     * 计算数组平均值
     */
    @Test
    public void average(){
        double sum=0.0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            sum+=a[i];
        }
        System.out.println("\n"+"数组平均值："+sum);
    }

    /**
     * 复制数组
     */
    @Test
    public void copyArray(){
        double[] b=new double[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            b[i]=a[i];
        }
        System.out.println("");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }

    /**
     * 反转数组
     */
    @Test
    public void resetArray(){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            double temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }


}
