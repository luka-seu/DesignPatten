package cn.plasticlove.designpatten.factory.test;

import cn.plasticlove.designpatten.factory.AudiCarFactory;
import cn.plasticlove.designpatten.factory.BenzCarFactory;
import cn.plasticlove.designpatten.factory.Car;
import cn.plasticlove.designpatten.factory.CarFactory;
import org.junit.Test;

/**
 * @author luka-seu
 * @description 工厂测试类
 * @create 2019/3/20-19:42
 */
public class FactoryTest {
    @Test
    public void testCarFactory() {
        CarFactory factory1 = new BenzCarFactory();
        Car car = factory1.create();
        car.createCar();
    }


}
