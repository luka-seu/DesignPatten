package cn.plasticlove.designpatten.prototype;

import java.util.Date;

/**
 * @author luka-seu
 * @description
 * @create 2019/12/12-14:42
 */
public class Mail implements Cloneable{
    private String name;
    private String address;
    private String destination;
    private Date mailDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Mail(){
        System.out.println("Mail constructor");

    }

    public Date getMailDate() {
        return mailDate;
    }

    public void setMailDate(Date mailDate) {
        this.mailDate = mailDate;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", destination='" + destination + '\'' +
                ", mailDate=" + mailDate +
                '}'+super.toString();
    }

    @Override
    /**
     * 实现Cloneable接口实现深克隆（引用类型）
     * 由于属性都是基本类型，故没事
     * 如果属性由应用类型则一般必须实现深克隆
     */
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        System.out.println("clone mail object");
        mail.mailDate = (Date) mail.mailDate.clone();
        return mail;
    }
}
