package io.swagger.service;

import io.swagger.model.ROR;
import io.swagger.repository.RorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class RORServiceImpl {
    @Autowired
    private RorRepo rorRepo;

    public List<ROR> getRORByCode(int drugCode, int outcomeCode) {

        ROR ror = rorRepo.getRORByCode(drugCode, outcomeCode);
        List<ROR> rorList = new ArrayList<>();
        rorList.add(ror);
        ror.toString();
        return rorList;
    }

    public List<ROR> getRORByName(String drugName, String outcomeName) {

        ROR rorName = rorRepo.getRORByName(drugName, outcomeName);
        List<ROR> rorListName = new ArrayList<>();
        rorListName.add(rorName);
        rorName.toString();
        return rorListName;
    }

    public List<ROR> getRORByDateCode(int drugCode, int outcomeCode, int startDate, int endDate) {

        ROR ror = rorRepo.getRORByDateCode(drugCode, outcomeCode, startDate, endDate);
        List<ROR> rorList = new ArrayList<>();
        rorList.add(ror);
        ror.toString();
        return rorList;
    }

    public List<ROR> getRORByDateName(String drugName, String outcomeName, int startDate, int endDate) {

        ROR rorName = rorRepo.getRORByDateName(drugName, outcomeName, startDate, endDate);
        List<ROR> rorListName = new ArrayList<>();
        rorListName.add(rorName);
        rorName.toString();
        return rorListName;
    }
}

