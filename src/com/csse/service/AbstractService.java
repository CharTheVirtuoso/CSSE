package com.csse.service;


import java.util.logging.Level;
import java.util.logging.Logger;
import CommonConstant;


import com.csse.common.EmployeeServiceImpl2;

import java.io.IOException;
import java.util.Properties;


public class AbstractService {
    public static final Properties properties = new Properties();
    public static final Logger log = Logger.getLogger(AbstractService.class.getName());

    static {
        try {
            properties.load(EmployeeServiceImpl2.class.getResourceAsStream(CommonConstant.CONFIG_FILE_PATH));
        } catch (Exception e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }
}
