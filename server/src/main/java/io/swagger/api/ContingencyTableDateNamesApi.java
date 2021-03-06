/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.ContingencyTableWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-07T17:04:41.912Z[GMT]")
@Api(value = "contingencyTableDateNames", description = "the contingencyTableDateNames API")
public interface ContingencyTableDateNamesApi {

    @ApiOperation(value = "Uses drug and outcome names in RxNorm and SNOMEDCT along with fda report date respectively to search AEOLUS and produce the corresponding contingency table.", nickname = "contingencyTableDateNames", notes = "Makes drug/outcome coded query with date range and returns two by two contingency table.", response = Object.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Object.class, responseContainer = "List") })
    @RequestMapping(value = "/contingencyTableDateNames",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ContingencyTableWrapper> contingencyTableDateNames(@NotNull @ApiParam(value = "RxNorm drug name for search", required = true) @Valid @RequestParam(value = "drugName", required = true) String drugName, @NotNull @ApiParam(value = "SNOMEDCT outcome name for search", required = true) @Valid @RequestParam(value = "outcomeName", required = true) String outcomeName, @NotNull @ApiParam(value = "Start date for range search", required = true) @Valid @RequestParam(value = "startDate", required = true) String startDate, @NotNull @ApiParam(value = "End date for range search", required = true) @Valid @RequestParam(value = "endDate", required = true) String endDate);

}
