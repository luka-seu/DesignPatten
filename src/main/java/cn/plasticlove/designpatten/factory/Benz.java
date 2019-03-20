package cn.plasticlove.designpatten.factory;

/**
 * @author luka-seu
 * @description 奔驰车
 * @create 2019/3/20-19:38
 */
public class Benz implements Car{
    @Override
    public void createCar() {
        System.out.println("奔驰车");
    }
}
