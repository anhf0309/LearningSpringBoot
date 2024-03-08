package com.perscholas.exerciseten.repository;

import com.perscholas.exerciseten.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TutorialReposiory extends JpaRepository<Tutorial,Long>{
    List<Tutorial> findByPublished(boolean published);
}
