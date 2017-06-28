package by.kraskovski.pms.service;

import by.kraskovski.pms.model.Authority;
import by.kraskovski.pms.model.enums.AuthorityEnum;

import java.util.List;

/**
 * Service for {@link Authority}
 */
public interface AuthorityService {

    /**
     * Find authority in database by id.
     */
    Authority find(int id);

    /**
     * Find authority in database by name.
     */
    Authority findByName(AuthorityEnum name);

    /**
     * Find all authoroties in database.
     */
    List<Authority> findAll();
}
