package cn.plasticlove.designpatten.singleton.test;


import cn.plasticlove.designpatten.threads.ThreadDemo;
import org.junit.Test;

public class LazyDoubleCheckSingletonTest {



    @Test
    public void testDoubleCheckSingleton(){
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());

        t1.start();
        t2.start();

    }
}