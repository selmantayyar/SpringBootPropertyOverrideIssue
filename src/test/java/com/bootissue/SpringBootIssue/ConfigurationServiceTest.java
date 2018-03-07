package com.bootissue.SpringBootIssue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Ymest on 3/7/2018.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations="classpath:application-test.yml")
public class ConfigurationServiceTest {

    @Autowired
    ConfigurationService configurationService;

    @Test
    public void testApplicationProp(){

        assertEquals("valueTest",configurationService.getProp());

    }

}