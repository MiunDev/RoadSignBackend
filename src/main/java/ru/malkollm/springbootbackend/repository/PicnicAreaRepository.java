package ru.malkollm.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.malkollm.springbootbackend.model.PicnicArea;

public interface PicnicAreaRepository extends JpaRepository<PicnicArea, Long> {
}
