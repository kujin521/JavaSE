/**
 * 类：远程调试Debug
 * 编写人：kujin
 * 创建时间：2020/6/14
 * 修改时间：2020/6/14
 */
public class Alphabet {
    public static void main(String[] args) {
        System.out.println("Starting");
        for (char c = 'A'; c < 'Z'; c++) {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(c);
        }
        System.out.println("Complete");
    }

}
