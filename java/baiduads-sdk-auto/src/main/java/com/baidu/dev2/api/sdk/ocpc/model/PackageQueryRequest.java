/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpc.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.ocpc.model.FilterCondition;
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
 * PackageQueryRequest
 */
@JsonPropertyOrder({
  PackageQueryRequest.JSON_PROPERTY_TARGET_PACKAGE_TYPE_FIELDS,
  PackageQueryRequest.JSON_PROPERTY_FILTERS,
  PackageQueryRequest.JSON_PROPERTY_SORT_FIELD,
  PackageQueryRequest.JSON_PROPERTY_SORT_ORDER,
  PackageQueryRequest.JSON_PROPERTY_IDS,
  PackageQueryRequest.JSON_PROPERTY_LEVEL
})
@JsonTypeName("PackageQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PackageQueryRequest {
  public static final String JSON_PROPERTY_TARGET_PACKAGE_TYPE_FIELDS = "targetPackageTypeFields";
  private List<String> targetPackageTypeFields = null;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FilterCondition> filters = null;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private String sortOrder;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level;

  public PackageQueryRequest() { 
  }

  public PackageQueryRequest targetPackageTypeFields(List<String> targetPackageTypeFields) {
    
    this.targetPackageTypeFields = targetPackageTypeFields;
    return this;
  }

  public PackageQueryRequest addTargetPackageTypeFieldsItem(String targetPackageTypeFieldsItem) {
    if (this.targetPackageTypeFields == null) {
      this.targetPackageTypeFields = new ArrayList<>();
    }
    this.targetPackageTypeFields.add(targetPackageTypeFieldsItem);
    return this;
  }

   /**
   * Get targetPackageTypeFields
   * @return targetPackageTypeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_TYPE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTargetPackageTypeFields() {
    return targetPackageTypeFields;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_TYPE_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageTypeFields(List<String> targetPackageTypeFields) {
    this.targetPackageTypeFields = targetPackageTypeFields;
  }


  public PackageQueryRequest filters(List<FilterCondition> filters) {
    
    this.filters = filters;
    return this;
  }

  public PackageQueryRequest addFiltersItem(FilterCondition filtersItem) {
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


  public PackageQueryRequest sortField(String sortField) {
    
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


  public PackageQueryRequest sortOrder(String sortOrder) {
    
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


  public PackageQueryRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public PackageQueryRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public PackageQueryRequest level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageQueryRequest packageQueryRequest = (PackageQueryRequest) o;
    return Objects.equals(this.targetPackageTypeFields, packageQueryRequest.targetPackageTypeFields) &&
        Objects.equals(this.filters, packageQueryRequest.filters) &&
        Objects.equals(this.sortField, packageQueryRequest.sortField) &&
        Objects.equals(this.sortOrder, packageQueryRequest.sortOrder) &&
        Objects.equals(this.ids, packageQueryRequest.ids) &&
        Objects.equals(this.level, packageQueryRequest.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackageTypeFields, filters, sortField, sortOrder, ids, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageQueryRequest {\n");
    sb.append("    targetPackageTypeFields: ").append(toIndentedString(targetPackageTypeFields)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

