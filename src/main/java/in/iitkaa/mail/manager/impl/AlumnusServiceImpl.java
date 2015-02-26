package in.iitkaa.mail.manager.impl;

import in.iitkaa.mail.dto.AlumnusRequestDTO;
import in.iitkaa.mail.manager.AlumnusService;
import in.iitkaa.mail.model.Alumnus;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Alok
 * @since 20-02-2015
 */
@Service("AlumnusService")
public class AlumnusServiceImpl extends IitkaaManagerSupport implements AlumnusService {
    @Override
    public Set<Alumnus> search(AlumnusRequestDTO alumnusRequestDTO) {
        return null;
    }
}
