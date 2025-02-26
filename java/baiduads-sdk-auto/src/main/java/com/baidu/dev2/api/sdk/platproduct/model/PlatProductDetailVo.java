/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.platproduct.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductDeliveryConfigVo;
import com.baidu.dev2.api.sdk.platproduct.model.PlatProductSkuVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductCategoryVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductImageVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductSpuAttributeVo;
import com.baidu.dev2.api.sdk.platproduct.model.ProductSpuSpecificationVo;
import com.baidu.dev2.api.sdk.platproduct.model.ServiceItem;
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
 * PlatProductDetailVo
 */
@JsonPropertyOrder({
  PlatProductDetailVo.JSON_PROPERTY_SPU_ID,
  PlatProductDetailVo.JSON_PROPERTY_APP_ID,
  PlatProductDetailVo.JSON_PROPERTY_SUB_APP_ID,
  PlatProductDetailVo.JSON_PROPERTY_SHOP_ID,
  PlatProductDetailVo.JSON_PROPERTY_NAME,
  PlatProductDetailVo.JSON_PROPERTY_SUBTITLE,
  PlatProductDetailVo.JSON_PROPERTY_TYPE,
  PlatProductDetailVo.JSON_PROPERTY_SPU_STATE,
  PlatProductDetailVo.JSON_PROPERTY_CATEGORY,
  PlatProductDetailVo.JSON_PROPERTY_ATTRIBUTES,
  PlatProductDetailVo.JSON_PROPERTY_SUPPORT_PAY_TYPE,
  PlatProductDetailVo.JSON_PROPERTY_SPECIFICATIONS,
  PlatProductDetailVo.JSON_PROPERTY_SKU_LIST,
  PlatProductDetailVo.JSON_PROPERTY_VIRTUAL_CODE_START_TIME,
  PlatProductDetailVo.JSON_PROPERTY_VIRTUAL_CODE_END_TIME,
  PlatProductDetailVo.JSON_PROPERTY_IMAGE_ALBUM,
  PlatProductDetailVo.JSON_PROPERTY_DESCRIPTION,
  PlatProductDetailVo.JSON_PROPERTY_QUOTATION,
  PlatProductDetailVo.JSON_PROPERTY_SERVICE_PROCESS,
  PlatProductDetailVo.JSON_PROPERTY_SERVICE_AREA,
  PlatProductDetailVo.JSON_PROPERTY_FREIGHT_TEMPLATE_ID,
  PlatProductDetailVo.JSON_PROPERTY_DELIVERY_CONFIG,
  PlatProductDetailVo.JSON_PROPERTY_PRICE,
  PlatProductDetailVo.JSON_PROPERTY_APPLY_SHOP_IDS,
  PlatProductDetailVo.JSON_PROPERTY_SEND_EXCHANGE_CODE,
  PlatProductDetailVo.JSON_PROPERTY_EXCHANGE_CODE_DESC,
  PlatProductDetailVo.JSON_PROPERTY_SERVICE_ITEM,
  PlatProductDetailVo.JSON_PROPERTY_LIMIT_STOCK,
  PlatProductDetailVo.JSON_PROPERTY_SHOP_BRAND_NAME,
  PlatProductDetailVo.JSON_PROPERTY_SHOP_BRAND_ID
})
@JsonTypeName("PlatProductDetailVo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlatProductDetailVo {
  public static final String JSON_PROPERTY_SPU_ID = "spuId";
  private String spuId;

  public static final String JSON_PROPERTY_APP_ID = "appId";
  private Integer appId;

  public static final String JSON_PROPERTY_SUB_APP_ID = "subAppId";
  private Integer subAppId;

  public static final String JSON_PROPERTY_SHOP_ID = "shopId";
  private Long shopId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBTITLE = "subtitle";
  private String subtitle;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_SPU_STATE = "spuState";
  private Integer spuState;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<ProductCategoryVo> category = null;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<ProductSpuAttributeVo> attributes = null;

  public static final String JSON_PROPERTY_SUPPORT_PAY_TYPE = "supportPayType";
  private Integer supportPayType;

  public static final String JSON_PROPERTY_SPECIFICATIONS = "specifications";
  private List<ProductSpuSpecificationVo> specifications = null;

  public static final String JSON_PROPERTY_SKU_LIST = "skuList";
  private List<PlatProductSkuVo> skuList = null;

  public static final String JSON_PROPERTY_VIRTUAL_CODE_START_TIME = "virtualCodeStartTime";
  private String virtualCodeStartTime;

  public static final String JSON_PROPERTY_VIRTUAL_CODE_END_TIME = "virtualCodeEndTime";
  private String virtualCodeEndTime;

  public static final String JSON_PROPERTY_IMAGE_ALBUM = "imageAlbum";
  private List<ProductImageVo> imageAlbum = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_QUOTATION = "quotation";
  private String quotation;

  public static final String JSON_PROPERTY_SERVICE_PROCESS = "serviceProcess";
  private String serviceProcess;

  public static final String JSON_PROPERTY_SERVICE_AREA = "serviceArea";
  private String serviceArea;

  public static final String JSON_PROPERTY_FREIGHT_TEMPLATE_ID = "freightTemplateId";
  private Long freightTemplateId;

  public static final String JSON_PROPERTY_DELIVERY_CONFIG = "deliveryConfig";
  private PlatProductDeliveryConfigVo deliveryConfig;

  public static final String JSON_PROPERTY_PRICE = "price";
  private java.math.BigDecimal price;

  public static final String JSON_PROPERTY_APPLY_SHOP_IDS = "applyShopIds";
  private List<Long> applyShopIds = null;

  public static final String JSON_PROPERTY_SEND_EXCHANGE_CODE = "sendExchangeCode";
  private Integer sendExchangeCode;

  public static final String JSON_PROPERTY_EXCHANGE_CODE_DESC = "exchangeCodeDesc";
  private String exchangeCodeDesc;

  public static final String JSON_PROPERTY_SERVICE_ITEM = "serviceItem";
  private List<ServiceItem> serviceItem = null;

  public static final String JSON_PROPERTY_LIMIT_STOCK = "limitStock";
  private Integer limitStock;

  public static final String JSON_PROPERTY_SHOP_BRAND_NAME = "shopBrandName";
  private String shopBrandName;

  public static final String JSON_PROPERTY_SHOP_BRAND_ID = "shopBrandId";
  private Long shopBrandId;

  public PlatProductDetailVo() { 
  }

  public PlatProductDetailVo spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * Get spuId
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpuId() {
    return spuId;
  }


  @JsonProperty(JSON_PROPERTY_SPU_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public PlatProductDetailVo appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAppId() {
    return appId;
  }


  @JsonProperty(JSON_PROPERTY_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public PlatProductDetailVo subAppId(Integer subAppId) {
    
    this.subAppId = subAppId;
    return this;
  }

   /**
   * Get subAppId
   * @return subAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSubAppId() {
    return subAppId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_APP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAppId(Integer subAppId) {
    this.subAppId = subAppId;
  }


  public PlatProductDetailVo shopId(Long shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * Get shopId
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopId() {
    return shopId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopId(Long shopId) {
    this.shopId = shopId;
  }


  public PlatProductDetailVo name(String name) {
    
    this.name = name;
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

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PlatProductDetailVo subtitle(String subtitle) {
    
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Get subtitle
   * @return subtitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubtitle() {
    return subtitle;
  }


  @JsonProperty(JSON_PROPERTY_SUBTITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  public PlatProductDetailVo type(Integer type) {
    
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


  public PlatProductDetailVo spuState(Integer spuState) {
    
    this.spuState = spuState;
    return this;
  }

   /**
   * Get spuState
   * @return spuState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPU_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSpuState() {
    return spuState;
  }


  @JsonProperty(JSON_PROPERTY_SPU_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpuState(Integer spuState) {
    this.spuState = spuState;
  }


  public PlatProductDetailVo category(List<ProductCategoryVo> category) {
    
    this.category = category;
    return this;
  }

  public PlatProductDetailVo addCategoryItem(ProductCategoryVo categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductCategoryVo> getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(List<ProductCategoryVo> category) {
    this.category = category;
  }


  public PlatProductDetailVo attributes(List<ProductSpuAttributeVo> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public PlatProductDetailVo addAttributesItem(ProductSpuAttributeVo attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSpuAttributeVo> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(List<ProductSpuAttributeVo> attributes) {
    this.attributes = attributes;
  }


  public PlatProductDetailVo supportPayType(Integer supportPayType) {
    
    this.supportPayType = supportPayType;
    return this;
  }

   /**
   * Get supportPayType
   * @return supportPayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSupportPayType() {
    return supportPayType;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportPayType(Integer supportPayType) {
    this.supportPayType = supportPayType;
  }


  public PlatProductDetailVo specifications(List<ProductSpuSpecificationVo> specifications) {
    
    this.specifications = specifications;
    return this;
  }

  public PlatProductDetailVo addSpecificationsItem(ProductSpuSpecificationVo specificationsItem) {
    if (this.specifications == null) {
      this.specifications = new ArrayList<>();
    }
    this.specifications.add(specificationsItem);
    return this;
  }

   /**
   * Get specifications
   * @return specifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPECIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductSpuSpecificationVo> getSpecifications() {
    return specifications;
  }


  @JsonProperty(JSON_PROPERTY_SPECIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecifications(List<ProductSpuSpecificationVo> specifications) {
    this.specifications = specifications;
  }


  public PlatProductDetailVo skuList(List<PlatProductSkuVo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public PlatProductDetailVo addSkuListItem(PlatProductSkuVo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * Get skuList
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlatProductSkuVo> getSkuList() {
    return skuList;
  }


  @JsonProperty(JSON_PROPERTY_SKU_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkuList(List<PlatProductSkuVo> skuList) {
    this.skuList = skuList;
  }


  public PlatProductDetailVo virtualCodeStartTime(String virtualCodeStartTime) {
    
    this.virtualCodeStartTime = virtualCodeStartTime;
    return this;
  }

   /**
   * Get virtualCodeStartTime
   * @return virtualCodeStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualCodeStartTime() {
    return virtualCodeStartTime;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualCodeStartTime(String virtualCodeStartTime) {
    this.virtualCodeStartTime = virtualCodeStartTime;
  }


  public PlatProductDetailVo virtualCodeEndTime(String virtualCodeEndTime) {
    
    this.virtualCodeEndTime = virtualCodeEndTime;
    return this;
  }

   /**
   * Get virtualCodeEndTime
   * @return virtualCodeEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVirtualCodeEndTime() {
    return virtualCodeEndTime;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_CODE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVirtualCodeEndTime(String virtualCodeEndTime) {
    this.virtualCodeEndTime = virtualCodeEndTime;
  }


  public PlatProductDetailVo imageAlbum(List<ProductImageVo> imageAlbum) {
    
    this.imageAlbum = imageAlbum;
    return this;
  }

  public PlatProductDetailVo addImageAlbumItem(ProductImageVo imageAlbumItem) {
    if (this.imageAlbum == null) {
      this.imageAlbum = new ArrayList<>();
    }
    this.imageAlbum.add(imageAlbumItem);
    return this;
  }

   /**
   * Get imageAlbum
   * @return imageAlbum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_ALBUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProductImageVo> getImageAlbum() {
    return imageAlbum;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ALBUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageAlbum(List<ProductImageVo> imageAlbum) {
    this.imageAlbum = imageAlbum;
  }


  public PlatProductDetailVo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlatProductDetailVo quotation(String quotation) {
    
    this.quotation = quotation;
    return this;
  }

   /**
   * Get quotation
   * @return quotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuotation() {
    return quotation;
  }


  @JsonProperty(JSON_PROPERTY_QUOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotation(String quotation) {
    this.quotation = quotation;
  }


  public PlatProductDetailVo serviceProcess(String serviceProcess) {
    
    this.serviceProcess = serviceProcess;
    return this;
  }

   /**
   * Get serviceProcess
   * @return serviceProcess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceProcess() {
    return serviceProcess;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PROCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceProcess(String serviceProcess) {
    this.serviceProcess = serviceProcess;
  }


  public PlatProductDetailVo serviceArea(String serviceArea) {
    
    this.serviceArea = serviceArea;
    return this;
  }

   /**
   * Get serviceArea
   * @return serviceArea
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceArea() {
    return serviceArea;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceArea(String serviceArea) {
    this.serviceArea = serviceArea;
  }


  public PlatProductDetailVo freightTemplateId(Long freightTemplateId) {
    
    this.freightTemplateId = freightTemplateId;
    return this;
  }

   /**
   * Get freightTemplateId
   * @return freightTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREIGHT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFreightTemplateId() {
    return freightTemplateId;
  }


  @JsonProperty(JSON_PROPERTY_FREIGHT_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreightTemplateId(Long freightTemplateId) {
    this.freightTemplateId = freightTemplateId;
  }


  public PlatProductDetailVo deliveryConfig(PlatProductDeliveryConfigVo deliveryConfig) {
    
    this.deliveryConfig = deliveryConfig;
    return this;
  }

   /**
   * Get deliveryConfig
   * @return deliveryConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlatProductDeliveryConfigVo getDeliveryConfig() {
    return deliveryConfig;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryConfig(PlatProductDeliveryConfigVo deliveryConfig) {
    this.deliveryConfig = deliveryConfig;
  }


  public PlatProductDetailVo price(java.math.BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.math.BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }


  public PlatProductDetailVo applyShopIds(List<Long> applyShopIds) {
    
    this.applyShopIds = applyShopIds;
    return this;
  }

  public PlatProductDetailVo addApplyShopIdsItem(Long applyShopIdsItem) {
    if (this.applyShopIds == null) {
      this.applyShopIds = new ArrayList<>();
    }
    this.applyShopIds.add(applyShopIdsItem);
    return this;
  }

   /**
   * Get applyShopIds
   * @return applyShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLY_SHOP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getApplyShopIds() {
    return applyShopIds;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_SHOP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyShopIds(List<Long> applyShopIds) {
    this.applyShopIds = applyShopIds;
  }


  public PlatProductDetailVo sendExchangeCode(Integer sendExchangeCode) {
    
    this.sendExchangeCode = sendExchangeCode;
    return this;
  }

   /**
   * Get sendExchangeCode
   * @return sendExchangeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEND_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSendExchangeCode() {
    return sendExchangeCode;
  }


  @JsonProperty(JSON_PROPERTY_SEND_EXCHANGE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendExchangeCode(Integer sendExchangeCode) {
    this.sendExchangeCode = sendExchangeCode;
  }


  public PlatProductDetailVo exchangeCodeDesc(String exchangeCodeDesc) {
    
    this.exchangeCodeDesc = exchangeCodeDesc;
    return this;
  }

   /**
   * Get exchangeCodeDesc
   * @return exchangeCodeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_CODE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExchangeCodeDesc() {
    return exchangeCodeDesc;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_CODE_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchangeCodeDesc(String exchangeCodeDesc) {
    this.exchangeCodeDesc = exchangeCodeDesc;
  }


  public PlatProductDetailVo serviceItem(List<ServiceItem> serviceItem) {
    
    this.serviceItem = serviceItem;
    return this;
  }

  public PlatProductDetailVo addServiceItemItem(ServiceItem serviceItemItem) {
    if (this.serviceItem == null) {
      this.serviceItem = new ArrayList<>();
    }
    this.serviceItem.add(serviceItemItem);
    return this;
  }

   /**
   * Get serviceItem
   * @return serviceItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceItem> getServiceItem() {
    return serviceItem;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceItem(List<ServiceItem> serviceItem) {
    this.serviceItem = serviceItem;
  }


  public PlatProductDetailVo limitStock(Integer limitStock) {
    
    this.limitStock = limitStock;
    return this;
  }

   /**
   * Get limitStock
   * @return limitStock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT_STOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimitStock() {
    return limitStock;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_STOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitStock(Integer limitStock) {
    this.limitStock = limitStock;
  }


  public PlatProductDetailVo shopBrandName(String shopBrandName) {
    
    this.shopBrandName = shopBrandName;
    return this;
  }

   /**
   * Get shopBrandName
   * @return shopBrandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopBrandName() {
    return shopBrandName;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopBrandName(String shopBrandName) {
    this.shopBrandName = shopBrandName;
  }


  public PlatProductDetailVo shopBrandId(Long shopBrandId) {
    
    this.shopBrandId = shopBrandId;
    return this;
  }

   /**
   * Get shopBrandId
   * @return shopBrandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopBrandId() {
    return shopBrandId;
  }


  @JsonProperty(JSON_PROPERTY_SHOP_BRAND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopBrandId(Long shopBrandId) {
    this.shopBrandId = shopBrandId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlatProductDetailVo platProductDetailVo = (PlatProductDetailVo) o;
    return Objects.equals(this.spuId, platProductDetailVo.spuId) &&
        Objects.equals(this.appId, platProductDetailVo.appId) &&
        Objects.equals(this.subAppId, platProductDetailVo.subAppId) &&
        Objects.equals(this.shopId, platProductDetailVo.shopId) &&
        Objects.equals(this.name, platProductDetailVo.name) &&
        Objects.equals(this.subtitle, platProductDetailVo.subtitle) &&
        Objects.equals(this.type, platProductDetailVo.type) &&
        Objects.equals(this.spuState, platProductDetailVo.spuState) &&
        Objects.equals(this.category, platProductDetailVo.category) &&
        Objects.equals(this.attributes, platProductDetailVo.attributes) &&
        Objects.equals(this.supportPayType, platProductDetailVo.supportPayType) &&
        Objects.equals(this.specifications, platProductDetailVo.specifications) &&
        Objects.equals(this.skuList, platProductDetailVo.skuList) &&
        Objects.equals(this.virtualCodeStartTime, platProductDetailVo.virtualCodeStartTime) &&
        Objects.equals(this.virtualCodeEndTime, platProductDetailVo.virtualCodeEndTime) &&
        Objects.equals(this.imageAlbum, platProductDetailVo.imageAlbum) &&
        Objects.equals(this.description, platProductDetailVo.description) &&
        Objects.equals(this.quotation, platProductDetailVo.quotation) &&
        Objects.equals(this.serviceProcess, platProductDetailVo.serviceProcess) &&
        Objects.equals(this.serviceArea, platProductDetailVo.serviceArea) &&
        Objects.equals(this.freightTemplateId, platProductDetailVo.freightTemplateId) &&
        Objects.equals(this.deliveryConfig, platProductDetailVo.deliveryConfig) &&
        Objects.equals(this.price, platProductDetailVo.price) &&
        Objects.equals(this.applyShopIds, platProductDetailVo.applyShopIds) &&
        Objects.equals(this.sendExchangeCode, platProductDetailVo.sendExchangeCode) &&
        Objects.equals(this.exchangeCodeDesc, platProductDetailVo.exchangeCodeDesc) &&
        Objects.equals(this.serviceItem, platProductDetailVo.serviceItem) &&
        Objects.equals(this.limitStock, platProductDetailVo.limitStock) &&
        Objects.equals(this.shopBrandName, platProductDetailVo.shopBrandName) &&
        Objects.equals(this.shopBrandId, platProductDetailVo.shopBrandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spuId, appId, subAppId, shopId, name, subtitle, type, spuState, category, attributes, supportPayType, specifications, skuList, virtualCodeStartTime, virtualCodeEndTime, imageAlbum, description, quotation, serviceProcess, serviceArea, freightTemplateId, deliveryConfig, price, applyShopIds, sendExchangeCode, exchangeCodeDesc, serviceItem, limitStock, shopBrandName, shopBrandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlatProductDetailVo {\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    subAppId: ").append(toIndentedString(subAppId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    spuState: ").append(toIndentedString(spuState)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    supportPayType: ").append(toIndentedString(supportPayType)).append("\n");
    sb.append("    specifications: ").append(toIndentedString(specifications)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    virtualCodeStartTime: ").append(toIndentedString(virtualCodeStartTime)).append("\n");
    sb.append("    virtualCodeEndTime: ").append(toIndentedString(virtualCodeEndTime)).append("\n");
    sb.append("    imageAlbum: ").append(toIndentedString(imageAlbum)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quotation: ").append(toIndentedString(quotation)).append("\n");
    sb.append("    serviceProcess: ").append(toIndentedString(serviceProcess)).append("\n");
    sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
    sb.append("    freightTemplateId: ").append(toIndentedString(freightTemplateId)).append("\n");
    sb.append("    deliveryConfig: ").append(toIndentedString(deliveryConfig)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    applyShopIds: ").append(toIndentedString(applyShopIds)).append("\n");
    sb.append("    sendExchangeCode: ").append(toIndentedString(sendExchangeCode)).append("\n");
    sb.append("    exchangeCodeDesc: ").append(toIndentedString(exchangeCodeDesc)).append("\n");
    sb.append("    serviceItem: ").append(toIndentedString(serviceItem)).append("\n");
    sb.append("    limitStock: ").append(toIndentedString(limitStock)).append("\n");
    sb.append("    shopBrandName: ").append(toIndentedString(shopBrandName)).append("\n");
    sb.append("    shopBrandId: ").append(toIndentedString(shopBrandId)).append("\n");
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

