/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.appcenterpackage.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.appcenterpackage.model.AppPackageDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AppPackageListResponse
 */
@JsonPropertyOrder({
  AppPackageListResponse.JSON_PROPERTY_APP_LIST,
  AppPackageListResponse.JSON_PROPERTY_IF_SEARCH,
  AppPackageListResponse.JSON_PROPERTY_BIND_TYPE,
  AppPackageListResponse.JSON_PROPERTY_ACCOUNT,
  AppPackageListResponse.JSON_PROPERTY_PASS_ID,
  AppPackageListResponse.JSON_PROPERTY_TOTAL_COUNT
})
@JsonTypeName("AppPackageListResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppPackageListResponse {
  public static final String JSON_PROPERTY_APP_LIST = "appList";
  private List<AppPackageDTO> appList = null;

  public static final String JSON_PROPERTY_IF_SEARCH = "ifSearch";
  private Boolean ifSearch;

  public static final String JSON_PROPERTY_BIND_TYPE = "bindType";
  private Integer bindType;

  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private String account;

  public static final String JSON_PROPERTY_PASS_ID = "passId";
  private Long passId;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
  private Integer totalCount;

  public AppPackageListResponse() { 
  }

  public AppPackageListResponse appList(List<AppPackageDTO> appList) {
    
    this.appList = appList;
    return this;
  }

  public AppPackageListResponse addAppListItem(AppPackageDTO appListItem) {
    if (this.appList == null) {
      this.appList = new ArrayList<>();
    }
    this.appList.add(appListItem);
    return this;
  }

   /**
   * Get appList
   * @return appList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AppPackageDTO> getAppList() {
    return appList;
  }


  @JsonProperty(JSON_PROPERTY_APP_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppList(List<AppPackageDTO> appList) {
    this.appList = appList;
  }


  public AppPackageListResponse ifSearch(Boolean ifSearch) {
    
    this.ifSearch = ifSearch;
    return this;
  }

   /**
   * Get ifSearch
   * @return ifSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IF_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIfSearch() {
    return ifSearch;
  }


  @JsonProperty(JSON_PROPERTY_IF_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIfSearch(Boolean ifSearch) {
    this.ifSearch = ifSearch;
  }


  public AppPackageListResponse bindType(Integer bindType) {
    
    this.bindType = bindType;
    return this;
  }

   /**
   * Get bindType
   * @return bindType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBindType() {
    return bindType;
  }


  @JsonProperty(JSON_PROPERTY_BIND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBindType(Integer bindType) {
    this.bindType = bindType;
  }


  public AppPackageListResponse account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccount(String account) {
    this.account = account;
  }


  public AppPackageListResponse passId(Long passId) {
    
    this.passId = passId;
    return this;
  }

   /**
   * Get passId
   * @return passId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPassId() {
    return passId;
  }


  @JsonProperty(JSON_PROPERTY_PASS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassId(Long passId) {
    this.passId = passId;
  }


  public AppPackageListResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPackageListResponse appPackageListResponse = (AppPackageListResponse) o;
    return Objects.equals(this.appList, appPackageListResponse.appList) &&
        Objects.equals(this.ifSearch, appPackageListResponse.ifSearch) &&
        Objects.equals(this.bindType, appPackageListResponse.bindType) &&
        Objects.equals(this.account, appPackageListResponse.account) &&
        Objects.equals(this.passId, appPackageListResponse.passId) &&
        Objects.equals(this.totalCount, appPackageListResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appList, ifSearch, bindType, account, passId, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPackageListResponse {\n");
    sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
    sb.append("    ifSearch: ").append(toIndentedString(ifSearch)).append("\n");
    sb.append("    bindType: ").append(toIndentedString(bindType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    passId: ").append(toIndentedString(passId)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

