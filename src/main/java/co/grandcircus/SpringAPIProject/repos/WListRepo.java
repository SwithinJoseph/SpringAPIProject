package co.grandcircus.SpringAPIProject.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface WListRepo extends JpaRepository<WListEntry, Integer> {
	@Query("SELECT title FROM WListEntry WHERE id=:inputId")
	public List<String> findMovieInWList(@Param("inputId")int id);
}
