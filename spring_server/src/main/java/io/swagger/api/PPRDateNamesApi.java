/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.PRR;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-07T17:04:41.912Z[GMT]")
@Api(value = "PPRDateNames", description = "the PPRDateNames API")
public interface PPRDateNamesApi {

    @ApiOperation(value = "Uses drug and outcome names in RxNorm and SNOMEDCT respectively and start and end dates to search AEOLUS and return the PPR, 95% confidence intervals and case count within the specified date range.", nickname = "pprDateNames", notes = "Returns the Proportional Reporting Ratio (PPR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count. Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. & Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)", response = Object.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Object.class, responseContainer = "List") })
    @RequestMapping(value = "/PPRDateNames",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<PRR>> pprDateNames(@NotNull @ApiParam(value = "RxNorm drug name for search", required = true) @Valid @RequestParam(value = "drugName", required = true) String drugName,@NotNull @ApiParam(value = "SNOMEDCT outcome name for search", required = true) @Valid @RequestParam(value = "outcomeName", required = true) String outcomeName,@NotNull @ApiParam(value = "Start date for search YYYYMMDD", required = true) @Valid @RequestParam(value = "startDate", required = true) String startDate,@NotNull @ApiParam(value = "End date for search YYYYMMDD", required = true) @Valid @RequestParam(value = "endDate", required = true) String endDate);

}
