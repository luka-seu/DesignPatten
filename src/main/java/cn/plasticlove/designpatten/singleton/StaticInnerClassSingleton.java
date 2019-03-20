package cn.plasticlove.designpatten.singleton;

/**
 * @author luka-seu
 * @description 静态内部类的单例模式
 * @create 2019/3/20-19:13
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}
    /**
     * 静态内部类在类加载时就会初始化，从而解决多线程之间的指令重排序问题
     */
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
}
