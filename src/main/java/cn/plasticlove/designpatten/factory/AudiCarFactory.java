package cn.plasticlove.designpatten.factory;

/**
 * @author luka-seu
 * @description 奥迪车工厂
 * @create 2019/3/20-19:40
 */
public class AudiCarFactory implements CarFactory{

    @Override
    public Car create() {
        return new Audi();
    }
}
