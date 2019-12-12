package cn.plasticlove.designpatten.prototype;

import cn.plasticlove.designpatten.prototype.Mail;
import cn.plasticlove.designpatten.prototype.Mailutil;

import java.util.Date;

/**
 * @author luka-seu
 * @description
 * @create 2019/12/12-14:47
 */
public class MailTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setMailDate(new Date(0));
        Mail mailTemp = (Mail) mail.clone();
        mail.getMailDate().setTime(100000000L);


        // for (int i = 0;i < 10;i++){
        //     Mail mailTemp = (Mail) mail.clone();
        //     mailTemp.setName("数学"+i);
        //     mailTemp.setAddress("数学"+i+"@mail.com");
        //     mailTemp.setMailDate(new Date(0));
        //     Mailutil.sendMail(mailTemp);
        // }
        System.out.println(mail);
        System.out.println(mailTemp);
    }
}
