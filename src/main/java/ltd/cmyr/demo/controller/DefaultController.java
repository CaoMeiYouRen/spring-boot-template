package ltd.cmyr.demo.controller;


import io.swagger.annotations.ApiOperation;
import ltd.cmyr.demo.entity.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DefaultController {

    private final Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @ApiOperation(value = "获取时间", httpMethod = "GET")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object time() {
        ResponseData data = new ResponseData(200, "OK", new Date());
        if (logger.isDebugEnabled()) {
            logger.debug("返回结果: {}", data);
        }
        return new ResponseEntity<ResponseData>(data, HttpStatus.OK);
    }
}
