package in.iitkaa.mail.manager;

import in.iitkaa.mail.dto.UserRequestDTO;
import in.iitkaa.mail.dto.UserResponseDTO;

/**
 * For the people who would login to the portal
 * @author Alok
 * @since 27-02-2015
 */
public interface UserService {

    public UserResponseDTO search(UserRequestDTO userRequestDTO);

}
