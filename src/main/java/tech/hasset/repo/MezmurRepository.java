package tech.hasset.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.hasset.domain.Mezmur;

import java.util.Collection;

/**
 * Created by biniamasnake on 16/02/16.
 */
public interface MezmurRepository extends JpaRepository<Mezmur, Long> {

    Collection<Mezmur> findAllByTitle(String title);
}
