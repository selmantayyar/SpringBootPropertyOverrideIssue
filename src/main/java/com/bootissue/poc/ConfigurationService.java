package com.bootissue.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Ymest on 3/7/2018.
 */
@Service
public class ConfigurationService {

    @Value("${spring.prop}")
    private String prop;

    public String getProp() {
        return prop;
    }
}
