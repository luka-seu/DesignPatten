package cn.plasticlove.designpatten.singleton.test;


import cn.plasticlove.designpatten.singleton.HungrySingleton;
import cn.plasticlove.designpatten.threads.ThreadDemo;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HungrySingletonTest {


    @Test
    public void testHungrySingleton() {
        Thread t1 = new Thread(new ThreadDemo());
        Thread t2 = new Thread(new ThreadDemo());

        t1.start();
        t2.start();
    }

    @Test
    //测试序列化
    public void testSerializable() throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        //对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial_file"));
        oos.writeObject(instance);
        //通过反射创建对象，则和原来的实例不是同一个
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial_file"));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);
    }

    @Test
    //测试反射攻击
    public void testReflect() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        HungrySingleton instance = HungrySingleton.getInstance();

        Class c1 = HungrySingleton.class;
        Constructor constructor = c1.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);


    }





}