/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 * The version of the OpenAPI document: 1.0.1-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dsareport.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeDetailReportRequestWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeDetailReportResponseWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeGroupDetailReportRequestWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeGroupDetailReportResponseWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeGroupReportRequestWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetCreativeGroupReportResponseWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetProductDetailReportRequestWrapper;
import com.baidu.dev2.api.sdk.dsareport.model.GetProductDetailReportResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DsaReportService
 */
@Ignore
public class DsaReportServiceTest {

    private final DsaReportService api = new DsaReportService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCreativeDetailReportTest() throws ApiException {
        GetCreativeDetailReportRequestWrapper getCreativeDetailReportRequestWrapper = null;
        GetCreativeDetailReportResponseWrapper response = api.getCreativeDetailReport(getCreativeDetailReportRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCreativeGroupDetailReportTest() throws ApiException {
        GetCreativeGroupDetailReportRequestWrapper getCreativeGroupDetailReportRequestWrapper = null;
        GetCreativeGroupDetailReportResponseWrapper response = api.getCreativeGroupDetailReport(getCreativeGroupDetailReportRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCreativeGroupReportTest() throws ApiException {
        GetCreativeGroupReportRequestWrapper getCreativeGroupReportRequestWrapper = null;
        GetCreativeGroupReportResponseWrapper response = api.getCreativeGroupReport(getCreativeGroupReportRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductDetailReportTest() throws ApiException {
        GetProductDetailReportRequestWrapper getProductDetailReportRequestWrapper = null;
        GetProductDetailReportResponseWrapper response = api.getProductDetailReport(getProductDetailReportRequestWrapper);

        // TODO: test validations
    }
}
