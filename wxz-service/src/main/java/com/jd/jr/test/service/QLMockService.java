package com.jd.jr.test.service;

import com.jd.jr.test.service.vo.QueryRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by wuxiaozhou on 2017/8/11.13:51
 */
@Path("/service")
@Consumes("application/json")
@Produces("application/json")
public interface QLMockService {

    @POST
    @Path("/query")
    Boolean query(QueryRequest request);
}
