/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.FieldFilter;
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
 * DetailQueryCondition
 */
@JsonPropertyOrder({
  DetailQueryCondition.JSON_PROPERTY_LIMIT,
  DetailQueryCondition.JSON_PROPERTY_SORT_FIELD,
  DetailQueryCondition.JSON_PROPERTY_DESC,
  DetailQueryCondition.JSON_PROPERTY_FILTERS,
  DetailQueryCondition.JSON_PROPERTY_ID_TYPE,
  DetailQueryCondition.JSON_PROPERTY_IDS,
  DetailQueryCondition.JSON_PROPERTY_PART_TYPE,
  DetailQueryCondition.JSON_PROPERTY_START_TIME,
  DetailQueryCondition.JSON_PROPERTY_END_TIME,
  DetailQueryCondition.JSON_PROPERTY_FIELDS
})
@JsonTypeName("DetailQueryCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DetailQueryCondition {
  public static final String JSON_PROPERTY_LIMIT = "limit";
  private List<Integer> limit = null;

  public static final String JSON_PROPERTY_SORT_FIELD = "sortField";
  private String sortField;

  public static final String JSON_PROPERTY_DESC = "desc";
  private Boolean desc;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<FieldFilter> filters = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_PART_TYPE = "partType";
  private Integer partType;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<String> fields = null;

  public DetailQueryCondition() { 
  }

  public DetailQueryCondition limit(List<Integer> limit) {
    
    this.limit = limit;
    return this;
  }

  public DetailQueryCondition addLimitItem(Integer limitItem) {
    if (this.limit == null) {
      this.limit = new ArrayList<>();
    }
    this.limit.add(limitItem);
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

  public List<Integer> getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(List<Integer> limit) {
    this.limit = limit;
  }


  public DetailQueryCondition sortField(String sortField) {
    
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


  public DetailQueryCondition desc(Boolean desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDesc() {
    return desc;
  }


  @JsonProperty(JSON_PROPERTY_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDesc(Boolean desc) {
    this.desc = desc;
  }


  public DetailQueryCondition filters(List<FieldFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public DetailQueryCondition addFiltersItem(FieldFilter filtersItem) {
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

  public List<FieldFilter> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(List<FieldFilter> filters) {
    this.filters = filters;
  }


  public DetailQueryCondition idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  public DetailQueryCondition ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public DetailQueryCondition addIdsItem(Long idsItem) {
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


  public DetailQueryCondition partType(Integer partType) {
    
    this.partType = partType;
    return this;
  }

   /**
   * Get partType
   * @return partType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PART_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPartType() {
    return partType;
  }


  @JsonProperty(JSON_PROPERTY_PART_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartType(Integer partType) {
    this.partType = partType;
  }


  public DetailQueryCondition startTime(String startTime) {
    
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


  public DetailQueryCondition endTime(String endTime) {
    
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


  public DetailQueryCondition fields(List<String> fields) {
    
    this.fields = fields;
    return this;
  }

  public DetailQueryCondition addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(List<String> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailQueryCondition detailQueryCondition = (DetailQueryCondition) o;
    return Objects.equals(this.limit, detailQueryCondition.limit) &&
        Objects.equals(this.sortField, detailQueryCondition.sortField) &&
        Objects.equals(this.desc, detailQueryCondition.desc) &&
        Objects.equals(this.filters, detailQueryCondition.filters) &&
        Objects.equals(this.idType, detailQueryCondition.idType) &&
        Objects.equals(this.ids, detailQueryCondition.ids) &&
        Objects.equals(this.partType, detailQueryCondition.partType) &&
        Objects.equals(this.startTime, detailQueryCondition.startTime) &&
        Objects.equals(this.endTime, detailQueryCondition.endTime) &&
        Objects.equals(this.fields, detailQueryCondition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, sortField, desc, filters, idType, ids, partType, startTime, endTime, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailQueryCondition {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    partType: ").append(toIndentedString(partType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

