package io.swagger.api;


import java.util.*;

import io.swagger.model.ContingencyTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContingencyTableDateNamesApiControllerIntegrationTest {

    @Autowired
    private ContingencyTableDateNamesApi api;

    @Test
    public void contingencyTableDateNamesTest() throws Exception {
        String drugName = "drugName_example";
        String outcomeName = "outcomeName_example";
        String startDate = "startDate_example";
        String endDate = "endDate_example";
        ResponseEntity<List<ContingencyTable>> responseEntity = api.contingencyTableDateNames(drugName, outcomeName, startDate, endDate);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
