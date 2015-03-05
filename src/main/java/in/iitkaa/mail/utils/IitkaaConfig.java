package in.iitkaa.mail.utils;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Alok
 * @since 02-03-2015
 */
@Getter
@Component("IitkaaConfig")
public class IitkaaConfig {

    @Resource(name = "fromName")
    private String fromName;

    @Resource(name = "fromEmail")
    private String fromEmail;

    @Resource(name = "templateFile")
    private String templateFile;

    @Resource(name = "templateFileVersion")
    private Integer templateFileVersion;

}
