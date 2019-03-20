package cn.plasticlove.designpatten.threads;

import cn.plasticlove.designpatten.singleton.HungrySingleton;
import cn.plasticlove.designpatten.singleton.LazyDoubleCheckSingleton;


/**
 * @author luka-seu
 * @description 多线程创建类
 * @create 2019/3/20-16:16
 */
public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"-----"+hungrySingleton);
    }
}
