package in.iitkaa.mail.dao.impl;

import in.iitkaa.mail.dao.UserDAO;
import in.iitkaa.mail.dto.UserRequestDTO;
import in.iitkaa.mail.dto.UserResponseDTO;
import in.iitkaa.mail.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author Alok
 * @since 27-02-2015
 */
@Repository("UserDAO")
public class UserDAOImpl extends IitkaaDAOSupport implements UserDAO {
    @Override
    public UserResponseDTO search(UserRequestDTO userRequestDTO) {
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setSearchResults(this.genericDAO.search(User.class, userRequestDTO));
        // TODO Filter the results by the fields of UserRequestDTO
        return userResponseDTO;
    }
}
