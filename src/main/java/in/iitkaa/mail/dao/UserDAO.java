package in.iitkaa.mail.dao;

import in.iitkaa.mail.dto.UserRequestDTO;
import in.iitkaa.mail.dto.UserResponseDTO;

/**
 * @author Alok
 * @since 27-02-2015
 */
public interface UserDAO {
    /**
     * @param userRequestDTO    requestDTO
     * @return responseDTO
     */
    public UserResponseDTO search(UserRequestDTO userRequestDTO);
}
