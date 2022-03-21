/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.baidu.dev2.api.sdk.danubecreativegroup.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.Configuration;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.*;
import com.baidu.dev2.api.sdk.invoke.Pair;

import com.baidu.dev2.api.sdk.danubecreativegroup.model.AddDanubeCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.AddDanubeCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.CopyDanubeCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.CopyDanubeCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DeleteDanubeCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.DeleteDanubeCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.GetDanubeConstantsRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.GetDanubeConstantsResponseWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.GetDanubeCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.GetDanubeCreativeGroupResponseWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.UpdateDanubeCreativeGroupRequestWrapper;
import com.baidu.dev2.api.sdk.danubecreativegroup.model.UpdateDanubeCreativeGroupResponseWrapper;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DanubeCreativeGroupService {
  private ApiClient apiClient;

  public DanubeCreativeGroupService() {
    this(Configuration.getDefaultApiClient());
  }

  public DanubeCreativeGroupService(ApiClient apiClient) {
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
   * @param addDanubeCreativeGroupRequestWrapper  (required)
   * @return AddDanubeCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public AddDanubeCreativeGroupResponseWrapper addDanubeCreativeGroup(AddDanubeCreativeGroupRequestWrapper addDanubeCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = addDanubeCreativeGroupRequestWrapper;
    
    // verify the required parameter 'addDanubeCreativeGroupRequestWrapper' is set
    if (addDanubeCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'addDanubeCreativeGroupRequestWrapper' when calling addDanubeCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/addDanubeCreativeGroup";

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

    TypeReference<AddDanubeCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<AddDanubeCreativeGroupResponseWrapper>() {};
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
   * @param copyDanubeCreativeGroupRequestWrapper  (required)
   * @return CopyDanubeCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public CopyDanubeCreativeGroupResponseWrapper copyDanubeCreativeGroup(CopyDanubeCreativeGroupRequestWrapper copyDanubeCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = copyDanubeCreativeGroupRequestWrapper;
    
    // verify the required parameter 'copyDanubeCreativeGroupRequestWrapper' is set
    if (copyDanubeCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'copyDanubeCreativeGroupRequestWrapper' when calling copyDanubeCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/copyDanubeCreativeGroup";

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

    TypeReference<CopyDanubeCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<CopyDanubeCreativeGroupResponseWrapper>() {};
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
   * @param deleteDanubeCreativeGroupRequestWrapper  (required)
   * @return DeleteDanubeCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public DeleteDanubeCreativeGroupResponseWrapper deleteDanubeCreativeGroup(DeleteDanubeCreativeGroupRequestWrapper deleteDanubeCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = deleteDanubeCreativeGroupRequestWrapper;
    
    // verify the required parameter 'deleteDanubeCreativeGroupRequestWrapper' is set
    if (deleteDanubeCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'deleteDanubeCreativeGroupRequestWrapper' when calling deleteDanubeCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/deleteDanubeCreativeGroup";

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

    TypeReference<DeleteDanubeCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<DeleteDanubeCreativeGroupResponseWrapper>() {};
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
   * @param getDanubeConstantsRequestWrapper  (required)
   * @return GetDanubeConstantsResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetDanubeConstantsResponseWrapper getDanubeConstants(GetDanubeConstantsRequestWrapper getDanubeConstantsRequestWrapper) throws ApiException {
    Object localVarPostBody = getDanubeConstantsRequestWrapper;
    
    // verify the required parameter 'getDanubeConstantsRequestWrapper' is set
    if (getDanubeConstantsRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getDanubeConstantsRequestWrapper' when calling getDanubeConstants");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/getDanubeConstants";

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

    TypeReference<GetDanubeConstantsResponseWrapper> localVarReturnType = new TypeReference<GetDanubeConstantsResponseWrapper>() {};
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
   * @param getDanubeCreativeGroupRequestWrapper  (required)
   * @return GetDanubeCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public GetDanubeCreativeGroupResponseWrapper getDanubeCreativeGroup(GetDanubeCreativeGroupRequestWrapper getDanubeCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = getDanubeCreativeGroupRequestWrapper;
    
    // verify the required parameter 'getDanubeCreativeGroupRequestWrapper' is set
    if (getDanubeCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'getDanubeCreativeGroupRequestWrapper' when calling getDanubeCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/getDanubeCreativeGroup";

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

    TypeReference<GetDanubeCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<GetDanubeCreativeGroupResponseWrapper>() {};
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
   * @param updateDanubeCreativeGroupRequestWrapper  (required)
   * @return UpdateDanubeCreativeGroupResponseWrapper
   * @throws ApiException if fails to make API call
   */
  public UpdateDanubeCreativeGroupResponseWrapper updateDanubeCreativeGroup(UpdateDanubeCreativeGroupRequestWrapper updateDanubeCreativeGroupRequestWrapper) throws ApiException {
    Object localVarPostBody = updateDanubeCreativeGroupRequestWrapper;
    
    // verify the required parameter 'updateDanubeCreativeGroupRequestWrapper' is set
    if (updateDanubeCreativeGroupRequestWrapper == null) {
      throw new ApiException(400, "Missing the required parameter 'updateDanubeCreativeGroupRequestWrapper' when calling updateDanubeCreativeGroup");
    }
    
    // create path and map variables
    String localVarPath = "/json/sms/service/DanubeCreativeGroupService/updateDanubeCreativeGroup";

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

    TypeReference<UpdateDanubeCreativeGroupResponseWrapper> localVarReturnType = new TypeReference<UpdateDanubeCreativeGroupResponseWrapper>() {};
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
