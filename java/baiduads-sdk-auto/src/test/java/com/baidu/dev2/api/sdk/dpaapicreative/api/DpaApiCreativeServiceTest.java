/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpaapicreative.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.dpaapicreative.model.AddDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.AddDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.DeleteDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.DeleteDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.GetDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.GetDpaCreativeResponseWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.GetDpaMaterialTypesRequestWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.GetDpaMaterialTypesResponseWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.UpdateDpaCreativeRequestWrapper;
import com.baidu.dev2.api.sdk.dpaapicreative.model.UpdateDpaCreativeResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DpaApiCreativeService
 */
@Ignore
public class DpaApiCreativeServiceTest {

    private final DpaApiCreativeService api = new DpaApiCreativeService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDpaCreativeTest() throws ApiException {
        AddDpaCreativeRequestWrapper addDpaCreativeRequestWrapper = null;
        AddDpaCreativeResponseWrapper response = api.addDpaCreative(addDpaCreativeRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDpaCreativeTest() throws ApiException {
        DeleteDpaCreativeRequestWrapper deleteDpaCreativeRequestWrapper = null;
        DeleteDpaCreativeResponseWrapper response = api.deleteDpaCreative(deleteDpaCreativeRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDpaCreativeTest() throws ApiException {
        GetDpaCreativeRequestWrapper getDpaCreativeRequestWrapper = null;
        GetDpaCreativeResponseWrapper response = api.getDpaCreative(getDpaCreativeRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDpaMaterialTypesTest() throws ApiException {
        GetDpaMaterialTypesRequestWrapper getDpaMaterialTypesRequestWrapper = null;
        GetDpaMaterialTypesResponseWrapper response = api.getDpaMaterialTypes(getDpaMaterialTypesRequestWrapper);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDpaCreativeTest() throws ApiException {
        UpdateDpaCreativeRequestWrapper updateDpaCreativeRequestWrapper = null;
        UpdateDpaCreativeResponseWrapper response = api.updateDpaCreative(updateDpaCreativeRequestWrapper);

        // TODO: test validations
    }
}
