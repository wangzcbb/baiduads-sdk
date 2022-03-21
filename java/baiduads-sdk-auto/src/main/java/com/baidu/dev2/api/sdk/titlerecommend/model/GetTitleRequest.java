/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.titlerecommend.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.titlerecommend.model.FilterCondition;
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
 * GetTitleRequest
 */
@JsonPropertyOrder({
  GetTitleRequest.JSON_PROPERTY_ADGROUP_ID,
  GetTitleRequest.JSON_PROPERTY_QUERY,
  GetTitleRequest.JSON_PROPERTY_LIMIT,
  GetTitleRequest.JSON_PROPERTY_FILTERS,
  GetTitleRequest.JSON_PROPERTY_ORG_TITLE,
  GetTitleRequest.JSON_PROPERTY_SRC,
  GetTitleRequest.JSON_PROPERTY_QUERY_TYPE,
  GetTitleRequest.JSON_PROPERTY_LENGTH_LEVEL,
  GetTitleRequest.JSON_PROPERTY_SORT_FIELD,
  GetTitleRequest.JSON_PROPERTY_SORT_ORDER,
  GetTitleRequest.JSON_PROPERTY_PAGE_NO,
  GetTitleRequest.JSON_PROPERTY_PAGE_SIZE
})
@JsonTypeName("GetTitleRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetTitleRequest {
  public static final String JSON_PROPERTY_ADGROUP_ID = "adgroupId";
  private Long adgroupId;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FilterCondition> filters = null;

  public static final String JSON_PROPERTY_ORG_TITLE = "orgTitle";
  private String orgTitle;

  public static final String JSON_PROPERTY_SRC = "src";
  private String src;

  public static final String JSON_PROPERTY_QUERY_TYPE = "queryType";
  private Integer queryType;

  public static final String JSON_PROPERTY_LENGTH_LEVEL = "lengthLevel";
  private Integer lengthLevel;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private String sortOrder;

  public static final String JSON_PROPERTY_PAGE_NO = "pageNo";
  private Integer pageNo;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Integer pageSize;

  public GetTitleRequest() { 
  }

  public GetTitleRequest adgroupId(Long adgroupId) {
    
    this.adgroupId = adgroupId;
    return this;
  }

   /**
   * Get adgroupId
   * @return adgroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdgroupId() {
    return adgroupId;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }


  public GetTitleRequest query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuery() {
    return query;
  }


  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuery(String query) {
    this.query = query;
  }


  public GetTitleRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetTitleRequest filters(List<FilterCondition> filters) {
    
    this.filters = filters;
    return this;
  }

  public GetTitleRequest addFiltersItem(FilterCondition filtersItem) {
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


  public GetTitleRequest orgTitle(String orgTitle) {
    
    this.orgTitle = orgTitle;
    return this;
  }

   /**
   * Get orgTitle
   * @return orgTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORG_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgTitle() {
    return orgTitle;
  }


  @JsonProperty(JSON_PROPERTY_ORG_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgTitle(String orgTitle) {
    this.orgTitle = orgTitle;
  }


  public GetTitleRequest src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * Get src
   * @return src
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SRC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSrc() {
    return src;
  }


  @JsonProperty(JSON_PROPERTY_SRC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrc(String src) {
    this.src = src;
  }


  public GetTitleRequest queryType(Integer queryType) {
    
    this.queryType = queryType;
    return this;
  }

   /**
   * Get queryType
   * @return queryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQueryType() {
    return queryType;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryType(Integer queryType) {
    this.queryType = queryType;
  }


  public GetTitleRequest lengthLevel(Integer lengthLevel) {
    
    this.lengthLevel = lengthLevel;
    return this;
  }

   /**
   * Get lengthLevel
   * @return lengthLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LENGTH_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLengthLevel() {
    return lengthLevel;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLengthLevel(Integer lengthLevel) {
    this.lengthLevel = lengthLevel;
  }


  public GetTitleRequest sortField(String sortField) {
    
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


  public GetTitleRequest sortOrder(String sortOrder) {
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSortOrder() {
    return sortOrder;
  }


  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortOrder(String sortOrder) {
    this.sortOrder = sortOrder;
  }


  public GetTitleRequest pageNo(Integer pageNo) {
    
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


  public GetTitleRequest pageSize(Integer pageSize) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTitleRequest getTitleRequest = (GetTitleRequest) o;
    return Objects.equals(this.adgroupId, getTitleRequest.adgroupId) &&
        Objects.equals(this.query, getTitleRequest.query) &&
        Objects.equals(this.limit, getTitleRequest.limit) &&
        Objects.equals(this.filters, getTitleRequest.filters) &&
        Objects.equals(this.orgTitle, getTitleRequest.orgTitle) &&
        Objects.equals(this.src, getTitleRequest.src) &&
        Objects.equals(this.queryType, getTitleRequest.queryType) &&
        Objects.equals(this.lengthLevel, getTitleRequest.lengthLevel) &&
        Objects.equals(this.sortField, getTitleRequest.sortField) &&
        Objects.equals(this.sortOrder, getTitleRequest.sortOrder) &&
        Objects.equals(this.pageNo, getTitleRequest.pageNo) &&
        Objects.equals(this.pageSize, getTitleRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adgroupId, query, limit, filters, orgTitle, src, queryType, lengthLevel, sortField, sortOrder, pageNo, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTitleRequest {\n");
    sb.append("    adgroupId: ").append(toIndentedString(adgroupId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orgTitle: ").append(toIndentedString(orgTitle)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    lengthLevel: ").append(toIndentedString(lengthLevel)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

