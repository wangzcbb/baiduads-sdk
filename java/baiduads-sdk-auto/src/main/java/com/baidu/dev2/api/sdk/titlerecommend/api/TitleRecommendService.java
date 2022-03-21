/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.titlerecommend.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.titlerecommend.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.titlerecommend.model.GetTitleRequestWrapper;
import com.baidu.dev2.api.sdk.titlerecommend.model.GetTitleResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TitleRecommendService {
  private ApiClient apiClient;

  public TitleRecommendService() {
    this(Configuration.getDefaultApiClient());
  }

  public TitleRecommendService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param getTitleRequestWrapper  (required)
   * @return GetTitleResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetTitleResponseWrapper getTitle(GetTitleRequestWrapper getTitleRequestWrapper) throws ApiException {
    Object localVarPostBody = getTitleRequestWrapper;
    
    // verify the required parameter 'getTitleRequestWrapper' is set
    if (getTitleRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getTitleRequestWrapper' when calling getTitle");
    }
    
    // create path and map variables
    String localVarPath = "/json/feed/v1/TitleRecommendService/getTitle";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json;charset=UTF-8"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json;charset=UTF-8"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    TypeReference<GetTitleResponseWrapper> localVarReturnType = new TypeReference<GetTitleResponseWrapper>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
