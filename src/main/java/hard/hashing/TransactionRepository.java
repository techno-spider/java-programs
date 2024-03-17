package hard.hashing;

import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
public interface TransactionRepository extends JpaRepository<Transaction, Double> {

}