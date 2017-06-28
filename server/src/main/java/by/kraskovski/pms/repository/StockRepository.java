package by.kraskovski.pms.repository;

import by.kraskovski.pms.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * DAO repository for working with {@link Stock}.
 */
public interface StockRepository extends JpaRepository<Stock, Integer> {

    /**
     * find {@link Stock} from database by specialize
     */
    Stock findBySpecialize(String specialize);
}
