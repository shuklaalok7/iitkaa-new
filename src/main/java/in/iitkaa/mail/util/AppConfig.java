package in.iitkaa.mail.util;

/**
 * @author Alok
 * @since 17-02-2015
 */
public abstract class AppConfig {
    public static final boolean DEV_MODE = true;

    public static final String SEND_GRID_USERNAME   = "c2h1a2xhYWxvazc=";
    public static final String SEND_GRID_PASSWORD   = "MW5pc2h0aGE=";

    public static final String JAVASCRIPT_ENGINE    = "nashorn";

    public static final class MailConfig {
        public static final String FROM_NAME    = "Delhi Office of Alumni Association, IIT Kanpur";
        public static final String FROM_EMAIL   = "iitkaa.delhi@gmail.com";
    }
}
