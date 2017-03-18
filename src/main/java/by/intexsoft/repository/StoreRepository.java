package by.intexsoft.repository;

import by.intexsoft.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DAO repository for working with {@link Store}.
 */
public interface StoreRepository extends JpaRepository<Store, Integer> {

    /**
     * find {@link Store} from database by name
     * @param name of store
     * @return {@link Store}
     */
    Store findByName(String name);
}