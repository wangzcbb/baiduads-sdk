/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.tab.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.tab.model.GetTabsRequestWrapper;
import com.baidu.dev2.api.sdk.tab.model.GetTabsResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TabService
 */
@Ignore
public class TabServiceTest {

    private final TabService api = new TabService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTabsTest() throws ApiException {
        GetTabsRequestWrapper getTabsRequestWrapper = null;
        GetTabsResponseWrapper response = api.getTabs(getTabsRequestWrapper);

        // TODO: test validations
    }
}
