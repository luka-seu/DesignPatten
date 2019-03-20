package cn.plasticlove.designpatten.singleton;

/**
 * @author luka-seu
 * @description 懒汉式单例模式
 * @create 2019/3/20-16:07
 */
public class LazySinglton {

    //构造方法必须为私有
    private LazySinglton(){}

    private static LazySinglton lazySinglton = null;
    //加入synchronized 确保线程安全。但是开销很大
    public synchronized static LazySinglton getInstance(){
        if (lazySinglton==null){
            lazySinglton = new LazySinglton();
        }
        return lazySinglton;
    }
}
