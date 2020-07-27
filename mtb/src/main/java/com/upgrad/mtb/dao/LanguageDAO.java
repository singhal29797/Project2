package com.upgrad.mtb.dao;

import com.upgrad.mtb.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("languageDAO")
public interface LanguageDAO extends JpaRepository<Language, Integer> {
    Language findByLanguage(String language);
}
