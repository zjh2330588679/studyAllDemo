package com.zjh;

/**
 * @author Zhaijihan
 * @create 2020-09-30 16:45
 */
class InnerClass {
    private int num = 50;

    public class clazz{
        public void printMethod(){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        clazz clazz = innerClass.new clazz();
        clazz.printMethod();
        System.out.println(666);
    }
}
