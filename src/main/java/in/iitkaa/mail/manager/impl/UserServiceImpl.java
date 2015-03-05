package in.iitkaa.mail.manager.impl;

import in.iitkaa.mail.dto.UserRequestDTO;
import in.iitkaa.mail.dto.UserResponseDTO;
import in.iitkaa.mail.manager.UserService;
import in.iitkaa.mail.model.User;

/**
 * @author Alok
 * @since 27-02-2015
 */
public class UserServiceImpl extends IitkaaManagerSupport implements UserService {
    @Override
    public UserResponseDTO search(UserRequestDTO userRequestDTO) {
        return this.userDAO.search(userRequestDTO);
    }

    @Override
    public User getUserByUsername(String username) {
        UserRequestDTO userRequestDTO = new UserRequestDTO();
        userRequestDTO.setUsername(username);
        UserResponseDTO responseDTO = this.search(userRequestDTO);
        if(responseDTO.getSearchResults().size()==1) {
            return responseDTO.getSearchResults().get(0);
        }
        return null;
    }
}
