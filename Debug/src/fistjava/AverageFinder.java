package fistjava;

/**
 * 类：
 * 编写人：kujin
 * 创建时间：2020/6/14
 * 修改时间：2020/6/14
 */
public class AverageFinder {
    public static void main(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }
}

