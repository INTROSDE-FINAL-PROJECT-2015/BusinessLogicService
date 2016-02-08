package introsde.mail;

import introsde.mail.ws.MailServiceImplService;
import introsde.mail.ws.MailService;

public class MailClient{
  public static void main(String[] args) {
    MailServiceImplService mailImplService = new MailServiceImplService();
    MailService mailService = mailImplService.getMailServiceImplPort();
    System.out.println("Response:" + mailService.sendMail("kingokongo46@hotmail.it","OGGETTO E-MAIL","Contenuto e-mail"));
  }
}
