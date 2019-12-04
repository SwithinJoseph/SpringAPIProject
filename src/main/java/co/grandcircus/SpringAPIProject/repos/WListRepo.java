package co.grandcircus.SpringAPIProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WListRepo extends JpaRepository<WListEntry, Integer> {

}
