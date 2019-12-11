package cn.plasticlove.designpatten.builder.test;

import cn.plasticlove.designpatten.builder.Course;

/**
 * @author luka-seu
 * @description
 * @create 2019/12/11-21:28
 */
public class CourseBuiderTest {
    public static void main(String[] args) {
        //静态内部类调用：new Course.CourseBuilder()
        Course course = new Course.CourseBuilder().buildCourseName("数学").buildCoursePrice(124.30).build();
        System.out.println(course);
    }
}
