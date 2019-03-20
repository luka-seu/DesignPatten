package cn.plasticlove.designpatten.singleton;

/**
 * @author luka-seu
 * @description 双重检查机制单例模式
 * @create 2019/3/20-16:22
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}
    //volatile 解决指令重排序问题
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton==null){
                    //这里仍然会存在指令重排序问题
                    /**new 可以分为3步：
                     * 1.分配内存
                     * 2.对象初始化
                     * 3.将初始化的对象指向刚刚分配的内存
                     * 2步和3步有可能会调换，也就是说可能会instance不为空，但是并没有被初始化。
                     * 因此拿到的单例实例在使用的时候会出现问题
                     * 解决方法：加volatile关键字
                    */
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
