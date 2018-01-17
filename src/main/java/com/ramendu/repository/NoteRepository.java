package com.ramendu.repository;

import com.ramendu.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by failedOptimus on 17-01-2018.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{



}
