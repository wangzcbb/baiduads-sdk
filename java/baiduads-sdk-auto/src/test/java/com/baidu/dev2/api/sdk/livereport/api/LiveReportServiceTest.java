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


package com.baidu.dev2.api.sdk.livereport.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.livereport.model.GetAccountLiveDataRequestWrapper;
import com.baidu.dev2.api.sdk.livereport.model.GetAccountLiveDataResponseWrapper;
import com.baidu.dev2.api.sdk.livereport.model.GetKeywordLiveDataRequestWrapper;
import com.baidu.dev2.api.sdk.livereport.model.GetKeywordLiveDataResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LiveReportService
 */
@Ignore
public class LiveReportServiceTest {

    private final LiveReportService api = new LiveReportService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountLiveDataTest() throws ApiException {
        GetAccountLiveDataRequestWrapper getAccountLiveDataRequestWrapper = null;
        GetAccountLiveDataResponseWrapper response = api.getAccountLiveData(getAccountLiveDataRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKeywordLiveDataTest() throws ApiException {
        GetKeywordLiveDataRequestWrapper getKeywordLiveDataRequestWrapper = null;
        GetKeywordLiveDataResponseWrapper response = api.getKeywordLiveData(getKeywordLiveDataRequestWrapper);

        // TODO: test validations
    }
}
