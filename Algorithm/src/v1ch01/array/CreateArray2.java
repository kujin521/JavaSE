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
public class CreateArray2 {
    //声明数组
    double[][] a;
    double[][] b;
    //测试数量
    int M=5;
    int N=5;
    //随机数范围
    int bound=100;

    @Before
    public void init(){
        //创建数组
        a=new double[M][N];
        b=new double[M][N];
        Random random=new Random();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                //初始化数组
                a[i][j]=random.nextInt(bound);
                b[i][j]=random.nextInt(bound);
            }
        }
    }

    @After
    public void desstory(){
        a=null;
        b=null;
    }

    /**
     * 矩阵
     */
    @Test
    public void matrix(){
        double[][] c = new double[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            { // 计算行 i 和列 j 的点乘
                for (int k = 0; k < N; k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
            { // 计算行 i 和列 j 的点乘
                for (int k = 0; k < N; k++)
                    System.out.println(c[i][j]);
            }

    }

}
