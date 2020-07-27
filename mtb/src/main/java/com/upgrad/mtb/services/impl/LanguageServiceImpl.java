package com.upgrad.mtb.services.impl;

import com.upgrad.mtb.dao.LanguageDAO;
import com.upgrad.mtb.entities.Language;
import com.upgrad.mtb.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("languageService")
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    @Qualifier("languageDAO")
    private LanguageDAO languageDAO;

    @Override
    public Language acceptLanguageDetails(Language language) {
        return languageDAO.save(language);
    }

    @Override
    public Language getLanguageDetails(int id) {
        return languageDAO.findById(id).get();
    }

    @Override
    public Language getLanguageDetailsByLanguageName(String languageName) {
        /**
         * This #findByLanguage method is created by manually in LanguageDAO class.
         */
        return languageDAO.findByLanguage(languageName);
    }

    @Override
    public boolean deleteLanguageDetails(int id) {
        Language language = getLanguageDetails(id);
        languageDAO.delete(language);
        return true;
    }

    @Override
    public List<Language> getAllLanguageDetails() {
        return languageDAO.findAll();
    }
}
