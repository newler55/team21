package se.g21.backend.reviewcourse.repository;
import se.g21.backend.reviewcourse.entity.Improvement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface ImprovementRepository extends JpaRepository<Improvement, Long> {
	Improvement findById(long id);
}