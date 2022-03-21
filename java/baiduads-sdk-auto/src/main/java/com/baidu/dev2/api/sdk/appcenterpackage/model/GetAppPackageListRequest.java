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
import com.baidu.dev2.api.sdk.appcenterpackage.model.FilterCondition;
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
 * GetAppPackageListRequest
 */
@JsonPropertyOrder({
  GetAppPackageListRequest.JSON_PROPERTY_STATE,
  GetAppPackageListRequest.JSON_PROPERTY_SEARCH_QUERY,
  GetAppPackageListRequest.JSON_PROPERTY_IS_DESC,
  GetAppPackageListRequest.JSON_PROPERTY_SORT_FIELD,
  GetAppPackageListRequest.JSON_PROPERTY_SEARCH_TYPE,
  GetAppPackageListRequest.JSON_PROPERTY_START_TIME,
  GetAppPackageListRequest.JSON_PROPERTY_END_TIME,
  GetAppPackageListRequest.JSON_PROPERTY_STATES,
  GetAppPackageListRequest.JSON_PROPERTY_JUDGE_LOGIN,
  GetAppPackageListRequest.JSON_PROPERTY_IS_GATHER,
  GetAppPackageListRequest.JSON_PROPERTY_TYPE,
  GetAppPackageListRequest.JSON_PROPERTY_TARGET_USER_ID,
  GetAppPackageListRequest.JSON_PROPERTY_FILTERS,
  GetAppPackageListRequest.JSON_PROPERTY_PAGE_SIZE,
  GetAppPackageListRequest.JSON_PROPERTY_PAGE_NO
})
@JsonTypeName("GetAppPackageListRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetAppPackageListRequest {
  public static final String JSON_PROPERTY_STATE = "state";
  private Integer state;

  public static final String JSON_PROPERTY_SEARCH_QUERY = "searchQuery";
  private String searchQuery;

  public static final String JSON_PROPERTY_IS_DESC = "isDesc";
  private Boolean isDesc;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_SEARCH_TYPE = "searchType";
  private String searchType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_STATES = "states";
  private List<Integer> states = null;

  public static final String JSON_PROPERTY_JUDGE_LOGIN = "judgeLogin";
  private Integer judgeLogin;

  public static final String JSON_PROPERTY_IS_GATHER = "isGather";
  private Integer isGather;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_TARGET_USER_ID = "targetUserId";
  private Long targetUserId;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FilterCondition> filters = null;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public GetAppPackageListRequest() { 
  }

  public GetAppPackageListRequest state(Integer state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(Integer state) {
    this.state = state;
  }


  public GetAppPackageListRequest searchQuery(String searchQuery) {
    
    this.searchQuery = searchQuery;
    return this;
  }

   /**
   * Get searchQuery
   * @return searchQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchQuery() {
    return searchQuery;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }


  public GetAppPackageListRequest isDesc(Boolean isDesc) {
    
    this.isDesc = isDesc;
    return this;
  }

   /**
   * Get isDesc
   * @return isDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDesc() {
    return isDesc;
  }


  @JsonProperty(JSON_PROPERTY_IS_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDesc(Boolean isDesc) {
    this.isDesc = isDesc;
  }


  public GetAppPackageListRequest sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Get sortField
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortField() {
    return sortField;
  }


  @JsonProperty(JSON_PROPERTY_SORT_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public GetAppPackageListRequest searchType(String searchType) {
    
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSearchType() {
    return searchType;
  }


  @JsonProperty(JSON_PROPERTY_SEARCH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }


  public GetAppPackageListRequest startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public GetAppPackageListRequest endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public GetAppPackageListRequest states(List<Integer> states) {
    
    this.states = states;
    return this;
  }

  public GetAppPackageListRequest addStatesItem(Integer statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Get states
   * @return states
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getStates() {
    return states;
  }


  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStates(List<Integer> states) {
    this.states = states;
  }


  public GetAppPackageListRequest judgeLogin(Integer judgeLogin) {
    
    this.judgeLogin = judgeLogin;
    return this;
  }

   /**
   * Get judgeLogin
   * @return judgeLogin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JUDGE_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getJudgeLogin() {
    return judgeLogin;
  }


  @JsonProperty(JSON_PROPERTY_JUDGE_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJudgeLogin(Integer judgeLogin) {
    this.judgeLogin = judgeLogin;
  }


  public GetAppPackageListRequest isGather(Integer isGather) {
    
    this.isGather = isGather;
    return this;
  }

   /**
   * Get isGather
   * @return isGather
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_GATHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIsGather() {
    return isGather;
  }


  @JsonProperty(JSON_PROPERTY_IS_GATHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGather(Integer isGather) {
    this.isGather = isGather;
  }


  public GetAppPackageListRequest type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public GetAppPackageListRequest targetUserId(Long targetUserId) {
    
    this.targetUserId = targetUserId;
    return this;
  }

   /**
   * Get targetUserId
   * @return targetUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetUserId() {
    return targetUserId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetUserId(Long targetUserId) {
    this.targetUserId = targetUserId;
  }


  public GetAppPackageListRequest filters(List<FilterCondition> filters) {
    
    this.filters = filters;
    return this;
  }

  public GetAppPackageListRequest addFiltersItem(FilterCondition filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FilterCondition> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FilterCondition> filters) {
    this.filters = filters;
  }


  public GetAppPackageListRequest pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public GetAppPackageListRequest pageNo(Integer pageNo) {
    
    this.pageNo = pageNo;
    return this;
  }

   /**
   * Get pageNo
   * @return pageNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNo() {
    return pageNo;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppPackageListRequest getAppPackageListRequest = (GetAppPackageListRequest) o;
    return Objects.equals(this.state, getAppPackageListRequest.state) &&
        Objects.equals(this.searchQuery, getAppPackageListRequest.searchQuery) &&
        Objects.equals(this.isDesc, getAppPackageListRequest.isDesc) &&
        Objects.equals(this.sortField, getAppPackageListRequest.sortField) &&
        Objects.equals(this.searchType, getAppPackageListRequest.searchType) &&
        Objects.equals(this.startTime, getAppPackageListRequest.startTime) &&
        Objects.equals(this.endTime, getAppPackageListRequest.endTime) &&
        Objects.equals(this.states, getAppPackageListRequest.states) &&
        Objects.equals(this.judgeLogin, getAppPackageListRequest.judgeLogin) &&
        Objects.equals(this.isGather, getAppPackageListRequest.isGather) &&
        Objects.equals(this.type, getAppPackageListRequest.type) &&
        Objects.equals(this.targetUserId, getAppPackageListRequest.targetUserId) &&
        Objects.equals(this.filters, getAppPackageListRequest.filters) &&
        Objects.equals(this.pageSize, getAppPackageListRequest.pageSize) &&
        Objects.equals(this.pageNo, getAppPackageListRequest.pageNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, searchQuery, isDesc, sortField, searchType, startTime, endTime, states, judgeLogin, isGather, type, targetUserId, filters, pageSize, pageNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppPackageListRequest {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    judgeLogin: ").append(toIndentedString(judgeLogin)).append("\n");
    sb.append("    isGather: ").append(toIndentedString(isGather)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetUserId: ").append(toIndentedString(targetUserId)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
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

