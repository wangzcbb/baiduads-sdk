/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.recmwordfeed.api;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.recmwordfeed.model.GetRecmWordRequestWrapper;
import com.baidu.dev2.api.sdk.recmwordfeed.model.GetRecmWordResponseWrapper;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecmWordFeedService
 */
@Ignore
public class RecmWordFeedServiceTest {

    private final RecmWordFeedService api = new RecmWordFeedService();

    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRecmWordTest() throws ApiException {
        GetRecmWordRequestWrapper getRecmWordRequestWrapper = null;
        GetRecmWordResponseWrapper response = api.getRecmWord(getRecmWordRequestWrapper);

        // TODO: test validations
    }
}
