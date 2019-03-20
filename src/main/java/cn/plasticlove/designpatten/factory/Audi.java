package cn.plasticlove.designpatten.factory;

/**
 * @author luka-seu
 * @description 奥迪车
 * @create 2019/3/20-19:37
 */
public class Audi implements Car{

    @Override
    public void createCar() {
        System.out.println("奥迪车");
    }
}
