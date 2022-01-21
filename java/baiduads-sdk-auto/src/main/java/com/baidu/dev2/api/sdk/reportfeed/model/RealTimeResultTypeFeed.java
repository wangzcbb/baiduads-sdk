/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.reportfeed.model;

import java.util.Objects;
import java.util.Arrays;
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
 * RealTimeResultTypeFeed
 */
@JsonPropertyOrder({
  RealTimeResultTypeFeed.JSON_PROPERTY_ID,
  RealTimeResultTypeFeed.JSON_PROPERTY_RELATED_ID,
  RealTimeResultTypeFeed.JSON_PROPERTY_DATE,
  RealTimeResultTypeFeed.JSON_PROPERTY_RELATE_IDS_LIST,
  RealTimeResultTypeFeed.JSON_PROPERTY_KPIS,
  RealTimeResultTypeFeed.JSON_PROPERTY_NAME,
  RealTimeResultTypeFeed.JSON_PROPERTY_TOTAL_ROW_NUMBER,
  RealTimeResultTypeFeed.JSON_PROPERTY_PAGE_INDEX
})
@JsonTypeName("RealTimeResultTypeFeed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RealTimeResultTypeFeed {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RELATED_ID = "relatedId";
  private String relatedId;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_RELATE_IDS_LIST = "relateIdsList";
  private List<String> relateIdsList = null;

  public static final String JSON_PROPERTY_KPIS = "kpis";
  private List<String> kpis = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private List<String> name = null;

  public static final String JSON_PROPERTY_TOTAL_ROW_NUMBER = "totalRowNumber";
  private String totalRowNumber;

  public static final String JSON_PROPERTY_PAGE_INDEX = "pageIndex";
  private String pageIndex;

  public RealTimeResultTypeFeed() { 
  }

  public RealTimeResultTypeFeed id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public RealTimeResultTypeFeed relatedId(String relatedId) {
    
    this.relatedId = relatedId;
    return this;
  }

   /**
   * Get relatedId
   * @return relatedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRelatedId() {
    return relatedId;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedId(String relatedId) {
    this.relatedId = relatedId;
  }


  public RealTimeResultTypeFeed date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public RealTimeResultTypeFeed relateIdsList(List<String> relateIdsList) {
    
    this.relateIdsList = relateIdsList;
    return this;
  }

  public RealTimeResultTypeFeed addRelateIdsListItem(String relateIdsListItem) {
    if (this.relateIdsList == null) {
      this.relateIdsList = new ArrayList<>();
    }
    this.relateIdsList.add(relateIdsListItem);
    return this;
  }

   /**
   * Get relateIdsList
   * @return relateIdsList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATE_IDS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRelateIdsList() {
    return relateIdsList;
  }


  @JsonProperty(JSON_PROPERTY_RELATE_IDS_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelateIdsList(List<String> relateIdsList) {
    this.relateIdsList = relateIdsList;
  }


  public RealTimeResultTypeFeed kpis(List<String> kpis) {
    
    this.kpis = kpis;
    return this;
  }

  public RealTimeResultTypeFeed addKpisItem(String kpisItem) {
    if (this.kpis == null) {
      this.kpis = new ArrayList<>();
    }
    this.kpis.add(kpisItem);
    return this;
  }

   /**
   * Get kpis
   * @return kpis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KPIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKpis() {
    return kpis;
  }


  @JsonProperty(JSON_PROPERTY_KPIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKpis(List<String> kpis) {
    this.kpis = kpis;
  }


  public RealTimeResultTypeFeed name(List<String> name) {
    
    this.name = name;
    return this;
  }

  public RealTimeResultTypeFeed addNameItem(String nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<>();
    }
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(List<String> name) {
    this.name = name;
  }


  public RealTimeResultTypeFeed totalRowNumber(String totalRowNumber) {
    
    this.totalRowNumber = totalRowNumber;
    return this;
  }

   /**
   * Get totalRowNumber
   * @return totalRowNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ROW_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalRowNumber() {
    return totalRowNumber;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ROW_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalRowNumber(String totalRowNumber) {
    this.totalRowNumber = totalRowNumber;
  }


  public RealTimeResultTypeFeed pageIndex(String pageIndex) {
    
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageIndex() {
    return pageIndex;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageIndex(String pageIndex) {
    this.pageIndex = pageIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealTimeResultTypeFeed realTimeResultTypeFeed = (RealTimeResultTypeFeed) o;
    return Objects.equals(this.id, realTimeResultTypeFeed.id) &&
        Objects.equals(this.relatedId, realTimeResultTypeFeed.relatedId) &&
        Objects.equals(this.date, realTimeResultTypeFeed.date) &&
        Objects.equals(this.relateIdsList, realTimeResultTypeFeed.relateIdsList) &&
        Objects.equals(this.kpis, realTimeResultTypeFeed.kpis) &&
        Objects.equals(this.name, realTimeResultTypeFeed.name) &&
        Objects.equals(this.totalRowNumber, realTimeResultTypeFeed.totalRowNumber) &&
        Objects.equals(this.pageIndex, realTimeResultTypeFeed.pageIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedId, date, relateIdsList, kpis, name, totalRowNumber, pageIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealTimeResultTypeFeed {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedId: ").append(toIndentedString(relatedId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    relateIdsList: ").append(toIndentedString(relateIdsList)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalRowNumber: ").append(toIndentedString(totalRowNumber)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
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

