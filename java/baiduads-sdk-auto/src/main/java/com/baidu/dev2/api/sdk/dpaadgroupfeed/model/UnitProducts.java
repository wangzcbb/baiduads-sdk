/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dpaadgroupfeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.dpaadgroupfeed.model.ProductSetRule;
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
 * UnitProducts
 */
@JsonPropertyOrder({
  UnitProducts.JSON_PROPERTY_CATALOG_ID,
  UnitProducts.JSON_PROPERTY_RULE_PRODUCTS
})
@JsonTypeName("UnitProducts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnitProducts {
  public static final String JSON_PROPERTY_CATALOG_ID = "catalogId";
  private Long catalogId;

  public static final String JSON_PROPERTY_RULE_PRODUCTS = "ruleProducts";
  private List<ProductSetRule> ruleProducts = null;

  public UnitProducts() { 
  }

  public UnitProducts catalogId(Long catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCatalogId() {
    return catalogId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }


  public UnitProducts ruleProducts(List<ProductSetRule> ruleProducts) {
    
    this.ruleProducts = ruleProducts;
    return this;
  }

  public UnitProducts addRuleProductsItem(ProductSetRule ruleProductsItem) {
    if (this.ruleProducts == null) {
      this.ruleProducts = new ArrayList<>();
    }
    this.ruleProducts.add(ruleProductsItem);
    return this;
  }

   /**
   * Get ruleProducts
   * @return ruleProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSetRule> getRuleProducts() {
    return ruleProducts;
  }


  @JsonProperty(JSON_PROPERTY_RULE_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleProducts(List<ProductSetRule> ruleProducts) {
    this.ruleProducts = ruleProducts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitProducts unitProducts = (UnitProducts) o;
    return Objects.equals(this.catalogId, unitProducts.catalogId) &&
        Objects.equals(this.ruleProducts, unitProducts.ruleProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, ruleProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitProducts {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    ruleProducts: ").append(toIndentedString(ruleProducts)).append("\n");
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

