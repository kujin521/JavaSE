package v2ch02.kj;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 类：java路径学习
 * 编写人：kujin
 * 创建时间：2020/6/13
 * 修改时间：2020/6/13
 */
public class MyPath {

    @Test
    public void testPath(){
        Path path= Paths.get("");
        Path absolute= Paths.get("/file","b");
        Path relative= Paths.get("/file","b");
        System.out.println(path.getParent());
        System.out.println(absolute);
    }

    @Test
    public void testScanner(){
        try {
            var in=new Scanner(Paths.get("./file/a.txt"));
            System.out.println(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void getFileName(){

    }

    @Test
    public void createDirectory(){
        try {
            //创建文件目录
            Files.createDirectory(Paths.get("./myfile"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
