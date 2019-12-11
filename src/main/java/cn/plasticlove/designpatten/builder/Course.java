package cn.plasticlove.designpatten.builder;

/**
 * @author luka-seu
 * @description
 * @create 2019/12/11-21:13
 */
public class Course {
    /**
     * course name
     */
    private String CoureseName;

    /**
     * course video
     */
    private String courseVideo;

    /**
     * course price
     */
    private double coursePrice;

    public Course(CourseBuilder courseBuilder){
        this.CoureseName = courseBuilder.coureseName;
        this.courseVideo = courseBuilder.courseVideo;
        this.coursePrice = courseBuilder.coursePrice;
    }

    public String getCoureseName() {
        return CoureseName;
    }

    public void setCoureseName(String coureseName) {
        CoureseName = coureseName;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CoureseName='" + CoureseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePrice=" + coursePrice +
                '}';
    }
    /**
     * 静态内部类，建造器
     */
    public static class CourseBuilder {
        /**
         * course name
         */
        private String coureseName;

        /**
         * course video
         */
        private String courseVideo;

        /**
         * course price
         */
        private double coursePrice;


        /**
         * 返回自身主要是为了链式调用
         * @param courseName
         * @return
         */
        public CourseBuilder buildCourseName(String courseName){
            this.coureseName = courseName;
            return this;
        }
        public CourseBuilder buildCourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder buildCoursePrice(double coursePrice){
            this.coursePrice = coursePrice;
            return this;
        }

        /**
         * 建造者模式中建造者中一般都会有一个build()方法，用于返回最后的建造主体
         * @return
         */
        public Course build(){
            return new Course(this);
        }
    }

}
