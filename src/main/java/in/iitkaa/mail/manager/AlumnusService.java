package in.iitkaa.mail.manager;

import in.iitkaa.mail.dto.AlumnusRequestDTO;
import in.iitkaa.mail.model.Alumnus;

import java.util.Set;

/**
 * @author Alok
 * @since 20-02-2015
 */
public interface AlumnusService {

    /**
     * Searches the Alumnus and finds the ones to receive the emails
     * @param alumnusRequestDTO    AlumnusRequestDTO to search
     * @return Set of Alumnus
     * @see in.iitkaa.mail.model.Alumnus
     */
    public Set<Alumnus> search(AlumnusRequestDTO alumnusRequestDTO);
}
