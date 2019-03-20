package cn.plasticlove.designpatten.factory;

/**
 * @author luka-seu
 * @description 奔驰车工厂
 * @create 2019/3/20-19:40
 */
public class BenzCarFactory implements CarFactory{

    @Override
    public Car create() {
        return new Benz();
    }
}
