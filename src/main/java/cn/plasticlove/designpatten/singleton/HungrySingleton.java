package cn.plasticlove.designpatten.singleton;



import java.io.Serializable;

/**
 * @author luka-seu
 * @description 饿汉式单例模式
 * @create 2019/3/20-19:17
 */
public class HungrySingleton implements Serializable {
    /**
     * 防止反射注入，破坏单例
     * (只针对饿汉式和静态内部类的方式)
     */
    private HungrySingleton(){
        if (hungrySingleton!=null){
            throw  new RuntimeException("单例创建不允许调用构造方法！");
        }
    }

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 序列化会破坏单例模式，这里通过方法反射的方法
     * 确保序列化后获得的对象实例仍然是同一个
     *
     */
    private Object readResolve(){
        return hungrySingleton;
    }

}
