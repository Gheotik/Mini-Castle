package Mini_Castle.app.model.repository;

import Mini_Castle.app.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface Mini_CastleRepository extends JpaRepository<Card, Integer> {
    List<Card> findAllByOrderByIdAsc();
    Card findById(int id);
}
