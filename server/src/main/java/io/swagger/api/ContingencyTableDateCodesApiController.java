package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import io.swagger.model.ContingencyTableWrapper;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-07T17:04:41.912Z[GMT]")
@Controller
public class ContingencyTableDateCodesApiController implements ContingencyTableDateCodesApi {

    private static final Logger log = LoggerFactory.getLogger(ContingencyTableDateCodesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    ContingencyTableServiceImpl contService;

    @Autowired
    public ContingencyTableDateCodesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ContingencyTableWrapper> contingencyTableDateCodes(@NotNull @ApiParam(value = "RxNorm drug code for search", required = true) @Valid @RequestParam(value = "drugCode", required = true) String drugCode, @NotNull @ApiParam(value = "SNOMEDCT outcome code for search", required = true) @Valid @RequestParam(value = "outcomeCode", required = true) String outcomeCode, @NotNull @ApiParam(value = "Start date for range search", required = true) @Valid @RequestParam(value = "startDate", required = true) String startDate, @NotNull @ApiParam(value = "End date for range search", required = true) @Valid @RequestParam(value = "endDate", required = true) String endDate) {
        String accept = request.getHeader("Accept");
        int DrugCode = Integer.parseInt(drugCode);
        int OutcomeCode = Integer.parseInt(outcomeCode);
        int StartDate = Integer.parseInt(startDate);
        int EndDate = Integer.parseInt(endDate);
        ContingencyTableWrapper contingencyTable = contService.getContingencyTableByCodeDate(DrugCode, OutcomeCode, StartDate, EndDate);
        if (!contingencyTable.getOutcome().isEmpty()) {
            return ResponseEntity.ok().body(contingencyTable);
        }else{
            return new ResponseEntity("Record not found for drug/outcome values", HttpStatus.NOT_FOUND);
        }
    }

}
