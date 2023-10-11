package hole.detector.api.repository;

import hole.detector.api.model.entity.HoleLocationData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoleLocationDataRepository extends JpaRepository<HoleLocationData, Long> {
}
