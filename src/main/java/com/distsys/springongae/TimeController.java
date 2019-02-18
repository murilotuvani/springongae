package com.distsys.springongae;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@RestController
@RequestMapping("/time")
public class TimeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        Date now = new Date();
        String toReturn = dateFormat.format(now);
        return toReturn;
    }

}
