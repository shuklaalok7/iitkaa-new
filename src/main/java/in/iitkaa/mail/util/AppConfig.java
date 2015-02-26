package in.iitkaa.mail.util;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Alok
 * @since 17-02-2015
 */
@Getter
@Component("AppConfig")
public class AppConfig {
    public static final String JAVASCRIPT_ENGINE    = "nashorn";
    public static final String CURRENT_DIRECTORY    = System.getProperty("user.dir");
    public static final String RESOURCE_DIRECTORY   = CURRENT_DIRECTORY+"/resources";

    @Resource(name = "devMode")
    private Boolean devMode;

    @Resource(name = "databaseHost")
    private String databaseHost;

    @Resource(name = "databaseName")
    private String databaseName;

    @Resource(name = "databasePort")
    private Integer databasePort;

    @Resource(name = "sendGridUsername")
    private String sendGridUsername;

    @Resource(name = "sendGridPassword")
    private String sendGridPassword;

    @Resource(name = "templateFile")
    private String templateFile;

    @Resource(name = "templateFileVersion")
    private Integer templateFileVersion;

    @Resource(name = "pageTitle")
    private String pageTitle;

    @Resource(name = "mailConfig")
    private MailConfig mailConfig;

    @Getter
    public static class MailConfig {
        private String fromName;
        private String fromEmail;

        public MailConfig(String fromName, String fromEmail) {
            this.fromName = fromName;
            this.fromEmail = fromEmail;
        }
    }
}
