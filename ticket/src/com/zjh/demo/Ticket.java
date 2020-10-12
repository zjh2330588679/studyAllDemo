package com.zjh.demo;

/**
 * @author Zhaijihan
 * @create 2020-09-30 9:43
 */
public class Ticket extends Thread{

    private Integer balance = 100;

    @Override
    public void run() {
        synchronized (this){
            while (true){
                if (balance > 0){
                    SellTicket();
                }else{
                    break;
                }
            }
        }
    }

    private void SellTicket(){

        try {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName()+"出售第--"+balance--+"--张票");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");

        t1.start();
        t2.start();
    }
}
