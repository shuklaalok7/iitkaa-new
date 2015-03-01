package in.iitkaa.mail.manager.impl;

import in.iitkaa.mail.dto.UserRequestDTO;
import in.iitkaa.mail.dto.UserResponseDTO;
import in.iitkaa.mail.manager.UserService;

/**
 * @author Alok
 * @since 27-02-2015
 */
public class UserServiceImpl extends IitkaaManagerSupport implements UserService {
    @Override
    public UserResponseDTO search(UserRequestDTO userRequestDTO) {
        return this.userDAO.search(userRequestDTO);
    }
}
