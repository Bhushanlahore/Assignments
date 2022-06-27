package com.user;
class One implements Runnable
{
    public void run()
    {
        System.out.print(Thread.currentThread().getName());
    }
}
class Two implements Runnable
{
    public void run()
    {
        new One().run();
        new Thread(new One(),"one").run();
        new Thread(new One(),"two").start();
    }
}
class Three
{
    public static void main (String[] args)
    {
        new Thread(new Two(),"three").start();
    }
}

