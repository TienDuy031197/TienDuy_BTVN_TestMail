package program;

import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        MailHandler mailHandler = new MailHandler(Config.PROTOCOL_IMAP, Config.HOST_IMAP, Config.PORT_IMAP, Config.USER_NAME, Config.PASS);
        mailHandler.setSaveDirectory(Config.DOWNLOAD_PATH);
        mailHandler.readMail();
    }
}
