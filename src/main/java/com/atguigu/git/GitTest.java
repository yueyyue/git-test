package com.atguigu.git;

/**
 * @version 1.0
 * @auther 石群
 */
public class GitTest {

    /**
     * //通过git建立版本控制后,文件是红色
     * //添加暂存区后变成绿色, 提交本地库后变成正常颜色
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("hello git!");
        System.out.println("hello git2!"); //一旦代码修改后,会显示蓝色, 证明被追踪过 添加暂存区,提交本地库
        System.out.println("hello git3!"); //一旦代码修改后,会显示蓝色, 也可以直接提交本地库
        System.out.println("hello git4!");

    }
}
