package cn.plasticlove.designpatten.threads;

import cn.plasticlove.designpatten.singleton.LazyDoubleCheckSingleton;


/**
 * @author luka-seu
 * @description 多线程创建类
 * @create 2019/3/20-16:16
 */
public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazySinglton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"-----"+lazySinglton);
    }
}
