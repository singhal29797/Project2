package com.upgrad.mtb.services;

import com.upgrad.mtb.entities.Language;

import java.util.List;

public interface LanguageService {

    public Language acceptLanguageDetails(Language language);
    public Language getLanguageDetails(int id);
    public Language getLanguageDetailsByLanguageName(String languageName);
    public boolean deleteLanguageDetails(int id);
    public List<Language> getAllLanguageDetails();
}
