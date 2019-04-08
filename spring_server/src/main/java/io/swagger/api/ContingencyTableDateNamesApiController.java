package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.ContingencyTable;
import io.swagger.service.ContingencyTableServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-07T17:04:41.912Z[GMT]")
@Controller
public class ContingencyTableDateNamesApiController implements ContingencyTableDateNamesApi {

    private static final Logger log = LoggerFactory.getLogger(ContingencyTableDateNamesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    ContingencyTableServiceImpl contService;

    @org.springframework.beans.factory.annotation.Autowired
    public ContingencyTableDateNamesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ContingencyTable>> contingencyTableDateNames(@NotNull @ApiParam(value = "RxNorm drug name for search", required = true) @Valid @RequestParam(value = "drugName", required = true) String drugName,@NotNull @ApiParam(value = "SNOMEDCT outcome name for search", required = true) @Valid @RequestParam(value = "outcomeName", required = true) String outcomeName,@NotNull @ApiParam(value = "Start date YYYYMMDD", required = true) @Valid @RequestParam(value = "startDate", required = true) String startDate,@NotNull @ApiParam(value = "End date YYYYMMDD", required = true) @Valid @RequestParam(value = "endDate", required = true) String endDate) {
        String accept = request.getHeader("Accept");
        String DrugName = drugName.toUpperCase();
        String OutcomeName = outcomeName.toUpperCase();
        int StartDate = Integer.parseInt(startDate);
        int EndDate = Integer.parseInt(endDate);
        List<ContingencyTable> contingencyTable = contService.getContingencyTableByNameDate(DrugName, OutcomeName, StartDate, EndDate);
        if (!contingencyTable.isEmpty()) {
            return ResponseEntity.ok().body(contingencyTable);
        }else{
            return new ResponseEntity<List<ContingencyTable>>(HttpStatus.NOT_IMPLEMENTED);
        }
    }

}
