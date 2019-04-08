package io.swagger.service;

import io.swagger.model.ContingencyTable;
import io.swagger.repository.ContingencyTableRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ContingencyTableServiceImpl {

    @Autowired
    private ContingencyTableRepo contRepo;

    public List<ContingencyTable> getContingencyTableByCode(int drugCode, int outcomeCode) {
        ContingencyTable ctCode = contRepo.getContingencyTableByCode(drugCode, outcomeCode);
        List<ContingencyTable> contListCode = new ArrayList<>();
        contListCode.add(ctCode);
        ctCode.toString();
        return contListCode;

    }

    public List<ContingencyTable> getContingencyTableByName(String drugName, String outcomeName) {
        ContingencyTable ctName = contRepo.getContingencyTableByName(drugName, outcomeName);
        List<ContingencyTable> contListName = new ArrayList<>();
        contListName.add(ctName);
        ctName.toString();
        return contListName;
    }

    public List<ContingencyTable> getContingencyTableByCodeDate(int drugCode, int outcomeCode, int startDate, int endDate) {
        ContingencyTable ctCode = contRepo.getContingencyTableByCodeDate(drugCode, outcomeCode, startDate, endDate);
        List<ContingencyTable> contListCode = new ArrayList<>();
        contListCode.add(ctCode);
        ctCode.toString();
        return contListCode;
    }

    public List<ContingencyTable> getContingencyTableByNameDate(String drugName, String outcomeName, int startDate, int endDate) {
        ContingencyTable ctName = contRepo.getContingencyTableByNameDate(drugName, outcomeName, startDate, endDate);
        List<ContingencyTable> contListName = new ArrayList<>();
        contListName.add(ctName);
        ctName.toString();
        return contListName;
    }


}