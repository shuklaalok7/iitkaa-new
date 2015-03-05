package in.iitkaa.mail.dto;

import com.nishionline.struts.core.dto.RequestDTO;
import in.iitkaa.mail.model.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Getter
@Setter
public class UserRequestDTO extends RequestDTO<User> {
    private String username;
}
