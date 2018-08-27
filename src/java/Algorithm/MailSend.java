package Algorithm;

import java.util.Properties;
//import com.business.*;
//import com.dao.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSend {

    public void emailUtility(String email, String messageContent) {

        System.out.println("hello ..i'm in messageContent");

        String to = email;//change accordingly  

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("cda2017gen@gmail.com", "LMPS2017");//change accordingly  
                    }
                });

        //compose message  
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cda2017gen@gmail.com"));//change accordingly  sem email-d
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("CDA File Process");
            message.setText(messageContent);


            //send message  
            Transport.send(message);

            System.out.println("message sent successfully");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
