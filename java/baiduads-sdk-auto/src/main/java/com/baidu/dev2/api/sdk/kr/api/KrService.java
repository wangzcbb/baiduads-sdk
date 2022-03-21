/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.kr.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.kr.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.kr.model.GetFilePathRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFilePathResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFileStatusRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetFileStatusResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRByQueryRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRByQueryResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRCustomRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRCustomResponseWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRFileIdByWordsRequestWrapper;
import com.baidu.dev2.api.sdk.kr.model.GetKRFileIdByWordsResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KrService {
  private ApiClient apiClient;

  public KrService() {
    this(Configuration.getDefaultApiClient());
  }

  public KrService(ApiClient apiClient) {
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
   * @param getFilePathRequestWrapper  (required)
   * @return GetFilePathResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetFilePathResponseWrapper getFilePath(GetFilePathRequestWrapper getFilePathRequestWrapper) throws ApiException {
    Object localVarPostBody = getFilePathRequestWrapper;
    
    // verify the required parameter 'getFilePathRequestWrapper' is set
    if (getFilePathRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getFilePathRequestWrapper' when calling getFilePath");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KRService/getFilePath";

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

    TypeReference<GetFilePathResponseWrapper> localVarReturnType = new TypeReference<GetFilePathResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getFileStatusRequestWrapper  (required)
   * @return GetFileStatusResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetFileStatusResponseWrapper getFileStatus(GetFileStatusRequestWrapper getFileStatusRequestWrapper) throws ApiException {
    Object localVarPostBody = getFileStatusRequestWrapper;
    
    // verify the required parameter 'getFileStatusRequestWrapper' is set
    if (getFileStatusRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getFileStatusRequestWrapper' when calling getFileStatus");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KRService/getFileStatus";

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

    TypeReference<GetFileStatusResponseWrapper> localVarReturnType = new TypeReference<GetFileStatusResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getKRByQueryRequestWrapper  (required)
   * @return GetKRByQueryResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetKRByQueryResponseWrapper getKRByQuery(GetKRByQueryRequestWrapper getKRByQueryRequestWrapper) throws ApiException {
    Object localVarPostBody = getKRByQueryRequestWrapper;
    
    // verify the required parameter 'getKRByQueryRequestWrapper' is set
    if (getKRByQueryRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getKRByQueryRequestWrapper' when calling getKRByQuery");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KRService/getKRByQuery";

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

    TypeReference<GetKRByQueryResponseWrapper> localVarReturnType = new TypeReference<GetKRByQueryResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getKRCustomRequestWrapper  (required)
   * @return GetKRCustomResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetKRCustomResponseWrapper getKRCustom(GetKRCustomRequestWrapper getKRCustomRequestWrapper) throws ApiException {
    Object localVarPostBody = getKRCustomRequestWrapper;
    
    // verify the required parameter 'getKRCustomRequestWrapper' is set
    if (getKRCustomRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getKRCustomRequestWrapper' when calling getKRCustom");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KRService/getKRCustom";

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

    TypeReference<GetKRCustomResponseWrapper> localVarReturnType = new TypeReference<GetKRCustomResponseWrapper>() {};
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
  /**
   * 
   * 
   * @param getKRFileIdByWordsRequestWrapper  (required)
   * @return GetKRFileIdByWordsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetKRFileIdByWordsResponseWrapper getKRFileIdByWords(GetKRFileIdByWordsRequestWrapper getKRFileIdByWordsRequestWrapper) throws ApiException {
    Object localVarPostBody = getKRFileIdByWordsRequestWrapper;
    
    // verify the required parameter 'getKRFileIdByWordsRequestWrapper' is set
    if (getKRFileIdByWordsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getKRFileIdByWordsRequestWrapper' when calling getKRFileIdByWords");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/KRService/getKRFileIdByWords";

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

    TypeReference<GetKRFileIdByWordsResponseWrapper> localVarReturnType = new TypeReference<GetKRFileIdByWordsResponseWrapper>() {};
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
