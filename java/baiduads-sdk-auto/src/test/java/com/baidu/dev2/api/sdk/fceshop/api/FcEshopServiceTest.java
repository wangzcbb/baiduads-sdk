/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fceshop.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.fceshop.model.GetAutoDeeplinkRequestWrapper;
import com.baidu.dev2.api.sdk.fceshop.model.GetAutoDeeplinkResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FcEshopService
 */
@Ignore
public class FcEshopServiceTest {

    private final FcEshopService api = new FcEshopService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutoDeeplinkTest() throws ApiException {
        GetAutoDeeplinkRequestWrapper getAutoDeeplinkRequestWrapper = null;
        GetAutoDeeplinkResponseWrapper response = api.getAutoDeeplink(getAutoDeeplinkRequestWrapper);

        // TODO: test validations
    }
}
