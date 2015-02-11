package com.edu.app.repositories;

import com.edu.app.domain.EduInstitution;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 */
public interface EduInstitutionRepository extends JpaRepository<EduInstitution, Integer> {
}
