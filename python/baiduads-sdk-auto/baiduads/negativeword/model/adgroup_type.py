"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from baiduads.exceptions import ApiAttributeError


def lazy_import():
    from baiduads.negativeword.model.adgroup_app_bind_info import AdgroupAppBindInfo
    from baiduads.negativeword.model.adgroup_fine_price_type import AdgroupFinePriceType
    from baiduads.negativeword.model.bce_ad_monitor import BceAdMonitor
    from baiduads.negativeword.model.business_label_type import BusinessLabelType
    from baiduads.negativeword.model.dynamic_creative_grab_url import DynamicCreativeGrabUrl
    from baiduads.negativeword.model.offline_reason import OfflineReason
    from baiduads.negativeword.model.seg_bind_type import SegBindType
    from baiduads.negativeword.model.show_label_type import ShowLabelType
    globals()['AdgroupAppBindInfo'] = AdgroupAppBindInfo
    globals()['AdgroupFinePriceType'] = AdgroupFinePriceType
    globals()['BceAdMonitor'] = BceAdMonitor
    globals()['BusinessLabelType'] = BusinessLabelType
    globals()['DynamicCreativeGrabUrl'] = DynamicCreativeGrabUrl
    globals()['OfflineReason'] = OfflineReason
    globals()['SegBindType'] = SegBindType
    globals()['ShowLabelType'] = ShowLabelType


class AdgroupType(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
    }

    validations = {
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'adgroup_id': (int,),  # noqa: E501
            'user_id': (int,),  # noqa: E501
            'campaign_id': (int,),  # noqa: E501
            'adgroup_name': (str,),  # noqa: E501
            'max_price': (float,),  # noqa: E501
            'pc_price_ratio': (float,),  # noqa: E501
            'price_ratio': (float,),  # noqa: E501
            'pause': (bool,),  # noqa: E501
            'ad_type': (int,),  # noqa: E501
            'negative_words': ([str],),  # noqa: E501
            'exact_negative_words': ([str],),  # noqa: E501
            'status': (int,),  # noqa: E501
            'offline_reasons': ([OfflineReason],),  # noqa: E501
            'campaign_name': (str,),  # noqa: E501
            'device': (int,),  # noqa: E501
            'bid_prefer': (int,),  # noqa: E501
            'campaign_pc_price_ratio': (float,),  # noqa: E501
            'campaign_price_ratio': (float,),  # noqa: E501
            'extend_bind': (str,),  # noqa: E501
            'adgroup_match': (int,),  # noqa: E501
            'is_delete': (bool,),  # noqa: E501
            'low_price_word_count': (int,),  # noqa: E501
            'dynamic_creative_grab_url': ([DynamicCreativeGrabUrl],),  # noqa: E501
            'jingxiu_price_ratio': (float,),  # noqa: E501
            'match_wide_type': (bool,),  # noqa: E501
            'fine_price_factor': (AdgroupFinePriceType,),  # noqa: E501
            'fine_price_status': (int,),  # noqa: E501
            'auto_targeting_status': (bool,),  # noqa: E501
            'auto_targeting_price': (float,),  # noqa: E501
            'campaign_auto_targeting_price': (float,),  # noqa: E501
            'segment_recommend_status': (bool,),  # noqa: E501
            'bce_ad_monitor': ([BceAdMonitor],),  # noqa: E501
            'ztc_recommend_word_status': (bool,),  # noqa: E501
            'business_point_id': (int,),  # noqa: E501
            'marketing_target_id': (int,),  # noqa: E501
            'ct_bid': (float,),  # noqa: E501
            'content_labels': ([ShowLabelType],),  # noqa: E501
            'mod_time': (str,),  # noqa: E501
            'business_labels': ([BusinessLabelType],),  # noqa: E501
            'segment_binds': ([SegBindType],),  # noqa: E501
            'smart_campaign': (int,),  # noqa: E501
            'advice_id': (int,),  # noqa: E501
            'advice_opt_type': (int,),  # noqa: E501
            'strategy': (int,),  # noqa: E501
            'adgroup_app_binds': (AdgroupAppBindInfo,),  # noqa: E501
            'shop_type': (int,),  # noqa: E501
            'app_shop_direct_status': (int,),  # noqa: E501
            'advice_source': (int,),  # noqa: E501
            'adgroup_cascade_status': (int,),  # noqa: E501
            'recommend_business_point_id': (int,),  # noqa: E501
            'word_property': (str,),  # noqa: E501
            'create_time': (str,),  # noqa: E501
            'adgroup_auto_targeting_status': (bool,),  # noqa: E501
            'pc_final_url': (str,),  # noqa: E501
            'pc_track_param': (str,),  # noqa: E501
            'pc_track_template': (str,),  # noqa: E501
            'shadow_pc_final_url': (str,),  # noqa: E501
            'shadow_pc_track_param': (str,),  # noqa: E501
            'shadow_pc_track_template': (str,),  # noqa: E501
            'mobile_final_url': (str,),  # noqa: E501
            'mobile_track_param': (str,),  # noqa: E501
            'mobile_track_template': (str,),  # noqa: E501
            'shadow_mobile_final_url': (str,),  # noqa: E501
            'shadow_mobile_track_param': (str,),  # noqa: E501
            'shadow_mobile_track_template': (str,),  # noqa: E501
            'shadow_status': (int,),  # noqa: E501
            'guide_price': (float,),  # noqa: E501
            'advice_batch_id': (int,),  # noqa: E501
            'campaign_bid_type': (int,),  # noqa: E501
            'equipment_type': (int,),  # noqa: E501
            'open_product_price': (bool,),  # noqa: E501
            'product_set_id': (int,),  # noqa: E501
            'product_set_name': (str,),  # noqa: E501
            'catalog_id': (int,),  # noqa: E501
            'monitor_url': (str,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'adgroup_id': 'adgroupId',  # noqa: E501
        'user_id': 'userId',  # noqa: E501
        'campaign_id': 'campaignId',  # noqa: E501
        'adgroup_name': 'adgroupName',  # noqa: E501
        'max_price': 'maxPrice',  # noqa: E501
        'pc_price_ratio': 'pcPriceRatio',  # noqa: E501
        'price_ratio': 'priceRatio',  # noqa: E501
        'pause': 'pause',  # noqa: E501
        'ad_type': 'adType',  # noqa: E501
        'negative_words': 'negativeWords',  # noqa: E501
        'exact_negative_words': 'exactNegativeWords',  # noqa: E501
        'status': 'status',  # noqa: E501
        'offline_reasons': 'offlineReasons',  # noqa: E501
        'campaign_name': 'campaignName',  # noqa: E501
        'device': 'device',  # noqa: E501
        'bid_prefer': 'bidPrefer',  # noqa: E501
        'campaign_pc_price_ratio': 'campaignPcPriceRatio',  # noqa: E501
        'campaign_price_ratio': 'campaignPriceRatio',  # noqa: E501
        'extend_bind': 'extendBind',  # noqa: E501
        'adgroup_match': 'adgroupMatch',  # noqa: E501
        'is_delete': 'isDelete',  # noqa: E501
        'low_price_word_count': 'lowPriceWordCount',  # noqa: E501
        'dynamic_creative_grab_url': 'dynamicCreativeGrabUrl',  # noqa: E501
        'jingxiu_price_ratio': 'jingxiuPriceRatio',  # noqa: E501
        'match_wide_type': 'matchWideType',  # noqa: E501
        'fine_price_factor': 'finePriceFactor',  # noqa: E501
        'fine_price_status': 'finePriceStatus',  # noqa: E501
        'auto_targeting_status': 'autoTargetingStatus',  # noqa: E501
        'auto_targeting_price': 'autoTargetingPrice',  # noqa: E501
        'campaign_auto_targeting_price': 'campaignAutoTargetingPrice',  # noqa: E501
        'segment_recommend_status': 'segmentRecommendStatus',  # noqa: E501
        'bce_ad_monitor': 'bceAdMonitor',  # noqa: E501
        'ztc_recommend_word_status': 'ztcRecommendWordStatus',  # noqa: E501
        'business_point_id': 'businessPointId',  # noqa: E501
        'marketing_target_id': 'marketingTargetId',  # noqa: E501
        'ct_bid': 'ctBid',  # noqa: E501
        'content_labels': 'contentLabels',  # noqa: E501
        'mod_time': 'modTime',  # noqa: E501
        'business_labels': 'businessLabels',  # noqa: E501
        'segment_binds': 'segmentBinds',  # noqa: E501
        'smart_campaign': 'smartCampaign',  # noqa: E501
        'advice_id': 'adviceId',  # noqa: E501
        'advice_opt_type': 'adviceOptType',  # noqa: E501
        'strategy': 'strategy',  # noqa: E501
        'adgroup_app_binds': 'adgroupAppBinds',  # noqa: E501
        'shop_type': 'shopType',  # noqa: E501
        'app_shop_direct_status': 'appShopDirectStatus',  # noqa: E501
        'advice_source': 'adviceSource',  # noqa: E501
        'adgroup_cascade_status': 'adgroupCascadeStatus',  # noqa: E501
        'recommend_business_point_id': 'recommendBusinessPointId',  # noqa: E501
        'word_property': 'wordProperty',  # noqa: E501
        'create_time': 'createTime',  # noqa: E501
        'adgroup_auto_targeting_status': 'adgroupAutoTargetingStatus',  # noqa: E501
        'pc_final_url': 'pcFinalUrl',  # noqa: E501
        'pc_track_param': 'pcTrackParam',  # noqa: E501
        'pc_track_template': 'pcTrackTemplate',  # noqa: E501
        'shadow_pc_final_url': 'shadowPcFinalUrl',  # noqa: E501
        'shadow_pc_track_param': 'shadowPcTrackParam',  # noqa: E501
        'shadow_pc_track_template': 'shadowPcTrackTemplate',  # noqa: E501
        'mobile_final_url': 'mobileFinalUrl',  # noqa: E501
        'mobile_track_param': 'mobileTrackParam',  # noqa: E501
        'mobile_track_template': 'mobileTrackTemplate',  # noqa: E501
        'shadow_mobile_final_url': 'shadowMobileFinalUrl',  # noqa: E501
        'shadow_mobile_track_param': 'shadowMobileTrackParam',  # noqa: E501
        'shadow_mobile_track_template': 'shadowMobileTrackTemplate',  # noqa: E501
        'shadow_status': 'shadowStatus',  # noqa: E501
        'guide_price': 'guidePrice',  # noqa: E501
        'advice_batch_id': 'adviceBatchId',  # noqa: E501
        'campaign_bid_type': 'campaignBidType',  # noqa: E501
        'equipment_type': 'equipmentType',  # noqa: E501
        'open_product_price': 'openProductPrice',  # noqa: E501
        'product_set_id': 'productSetId',  # noqa: E501
        'product_set_name': 'productSetName',  # noqa: E501
        'catalog_id': 'catalogId',  # noqa: E501
        'monitor_url': 'monitorUrl',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """AdgroupType - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            adgroup_id (int): [optional]  # noqa: E501
            user_id (int): [optional]  # noqa: E501
            campaign_id (int): [optional]  # noqa: E501
            adgroup_name (str): [optional]  # noqa: E501
            max_price (float): [optional]  # noqa: E501
            pc_price_ratio (float): [optional]  # noqa: E501
            price_ratio (float): [optional]  # noqa: E501
            pause (bool): [optional]  # noqa: E501
            ad_type (int): [optional]  # noqa: E501
            negative_words ([str]): [optional]  # noqa: E501
            exact_negative_words ([str]): [optional]  # noqa: E501
            status (int): [optional]  # noqa: E501
            offline_reasons ([OfflineReason]): [optional]  # noqa: E501
            campaign_name (str): [optional]  # noqa: E501
            device (int): [optional]  # noqa: E501
            bid_prefer (int): [optional]  # noqa: E501
            campaign_pc_price_ratio (float): [optional]  # noqa: E501
            campaign_price_ratio (float): [optional]  # noqa: E501
            extend_bind (str): [optional]  # noqa: E501
            adgroup_match (int): [optional]  # noqa: E501
            is_delete (bool): [optional]  # noqa: E501
            low_price_word_count (int): [optional]  # noqa: E501
            dynamic_creative_grab_url ([DynamicCreativeGrabUrl]): [optional]  # noqa: E501
            jingxiu_price_ratio (float): [optional]  # noqa: E501
            match_wide_type (bool): [optional]  # noqa: E501
            fine_price_factor (AdgroupFinePriceType): [optional]  # noqa: E501
            fine_price_status (int): [optional]  # noqa: E501
            auto_targeting_status (bool): [optional]  # noqa: E501
            auto_targeting_price (float): [optional]  # noqa: E501
            campaign_auto_targeting_price (float): [optional]  # noqa: E501
            segment_recommend_status (bool): [optional]  # noqa: E501
            bce_ad_monitor ([BceAdMonitor]): [optional]  # noqa: E501
            ztc_recommend_word_status (bool): [optional]  # noqa: E501
            business_point_id (int): [optional]  # noqa: E501
            marketing_target_id (int): [optional]  # noqa: E501
            ct_bid (float): [optional]  # noqa: E501
            content_labels ([ShowLabelType]): [optional]  # noqa: E501
            mod_time (str): [optional]  # noqa: E501
            business_labels ([BusinessLabelType]): [optional]  # noqa: E501
            segment_binds ([SegBindType]): [optional]  # noqa: E501
            smart_campaign (int): [optional]  # noqa: E501
            advice_id (int): [optional]  # noqa: E501
            advice_opt_type (int): [optional]  # noqa: E501
            strategy (int): [optional]  # noqa: E501
            adgroup_app_binds (AdgroupAppBindInfo): [optional]  # noqa: E501
            shop_type (int): [optional]  # noqa: E501
            app_shop_direct_status (int): [optional]  # noqa: E501
            advice_source (int): [optional]  # noqa: E501
            adgroup_cascade_status (int): [optional]  # noqa: E501
            recommend_business_point_id (int): [optional]  # noqa: E501
            word_property (str): [optional]  # noqa: E501
            create_time (str): [optional]  # noqa: E501
            adgroup_auto_targeting_status (bool): [optional]  # noqa: E501
            pc_final_url (str): [optional]  # noqa: E501
            pc_track_param (str): [optional]  # noqa: E501
            pc_track_template (str): [optional]  # noqa: E501
            shadow_pc_final_url (str): [optional]  # noqa: E501
            shadow_pc_track_param (str): [optional]  # noqa: E501
            shadow_pc_track_template (str): [optional]  # noqa: E501
            mobile_final_url (str): [optional]  # noqa: E501
            mobile_track_param (str): [optional]  # noqa: E501
            mobile_track_template (str): [optional]  # noqa: E501
            shadow_mobile_final_url (str): [optional]  # noqa: E501
            shadow_mobile_track_param (str): [optional]  # noqa: E501
            shadow_mobile_track_template (str): [optional]  # noqa: E501
            shadow_status (int): [optional]  # noqa: E501
            guide_price (float): [optional]  # noqa: E501
            advice_batch_id (int): [optional]  # noqa: E501
            campaign_bid_type (int): [optional]  # noqa: E501
            equipment_type (int): [optional]  # noqa: E501
            open_product_price (bool): [optional]  # noqa: E501
            product_set_id (int): [optional]  # noqa: E501
            product_set_name (str): [optional]  # noqa: E501
            catalog_id (int): [optional]  # noqa: E501
            monitor_url (str): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, *args, **kwargs):  # noqa: E501
        """AdgroupType - a model defined in OpenAPI

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            adgroup_id (int): [optional]  # noqa: E501
            user_id (int): [optional]  # noqa: E501
            campaign_id (int): [optional]  # noqa: E501
            adgroup_name (str): [optional]  # noqa: E501
            max_price (float): [optional]  # noqa: E501
            pc_price_ratio (float): [optional]  # noqa: E501
            price_ratio (float): [optional]  # noqa: E501
            pause (bool): [optional]  # noqa: E501
            ad_type (int): [optional]  # noqa: E501
            negative_words ([str]): [optional]  # noqa: E501
            exact_negative_words ([str]): [optional]  # noqa: E501
            status (int): [optional]  # noqa: E501
            offline_reasons ([OfflineReason]): [optional]  # noqa: E501
            campaign_name (str): [optional]  # noqa: E501
            device (int): [optional]  # noqa: E501
            bid_prefer (int): [optional]  # noqa: E501
            campaign_pc_price_ratio (float): [optional]  # noqa: E501
            campaign_price_ratio (float): [optional]  # noqa: E501
            extend_bind (str): [optional]  # noqa: E501
            adgroup_match (int): [optional]  # noqa: E501
            is_delete (bool): [optional]  # noqa: E501
            low_price_word_count (int): [optional]  # noqa: E501
            dynamic_creative_grab_url ([DynamicCreativeGrabUrl]): [optional]  # noqa: E501
            jingxiu_price_ratio (float): [optional]  # noqa: E501
            match_wide_type (bool): [optional]  # noqa: E501
            fine_price_factor (AdgroupFinePriceType): [optional]  # noqa: E501
            fine_price_status (int): [optional]  # noqa: E501
            auto_targeting_status (bool): [optional]  # noqa: E501
            auto_targeting_price (float): [optional]  # noqa: E501
            campaign_auto_targeting_price (float): [optional]  # noqa: E501
            segment_recommend_status (bool): [optional]  # noqa: E501
            bce_ad_monitor ([BceAdMonitor]): [optional]  # noqa: E501
            ztc_recommend_word_status (bool): [optional]  # noqa: E501
            business_point_id (int): [optional]  # noqa: E501
            marketing_target_id (int): [optional]  # noqa: E501
            ct_bid (float): [optional]  # noqa: E501
            content_labels ([ShowLabelType]): [optional]  # noqa: E501
            mod_time (str): [optional]  # noqa: E501
            business_labels ([BusinessLabelType]): [optional]  # noqa: E501
            segment_binds ([SegBindType]): [optional]  # noqa: E501
            smart_campaign (int): [optional]  # noqa: E501
            advice_id (int): [optional]  # noqa: E501
            advice_opt_type (int): [optional]  # noqa: E501
            strategy (int): [optional]  # noqa: E501
            adgroup_app_binds (AdgroupAppBindInfo): [optional]  # noqa: E501
            shop_type (int): [optional]  # noqa: E501
            app_shop_direct_status (int): [optional]  # noqa: E501
            advice_source (int): [optional]  # noqa: E501
            adgroup_cascade_status (int): [optional]  # noqa: E501
            recommend_business_point_id (int): [optional]  # noqa: E501
            word_property (str): [optional]  # noqa: E501
            create_time (str): [optional]  # noqa: E501
            adgroup_auto_targeting_status (bool): [optional]  # noqa: E501
            pc_final_url (str): [optional]  # noqa: E501
            pc_track_param (str): [optional]  # noqa: E501
            pc_track_template (str): [optional]  # noqa: E501
            shadow_pc_final_url (str): [optional]  # noqa: E501
            shadow_pc_track_param (str): [optional]  # noqa: E501
            shadow_pc_track_template (str): [optional]  # noqa: E501
            mobile_final_url (str): [optional]  # noqa: E501
            mobile_track_param (str): [optional]  # noqa: E501
            mobile_track_template (str): [optional]  # noqa: E501
            shadow_mobile_final_url (str): [optional]  # noqa: E501
            shadow_mobile_track_param (str): [optional]  # noqa: E501
            shadow_mobile_track_template (str): [optional]  # noqa: E501
            shadow_status (int): [optional]  # noqa: E501
            guide_price (float): [optional]  # noqa: E501
            advice_batch_id (int): [optional]  # noqa: E501
            campaign_bid_type (int): [optional]  # noqa: E501
            equipment_type (int): [optional]  # noqa: E501
            open_product_price (bool): [optional]  # noqa: E501
            product_set_id (int): [optional]  # noqa: E501
            product_set_name (str): [optional]  # noqa: E501
            catalog_id (int): [optional]  # noqa: E501
            monitor_url (str): [optional]  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            raise ApiTypeError(
                "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                    args,
                    self.__class__.__name__,
                ),
                path_to_item=_path_to_item,
                valid_classes=(self.__class__,),
            )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
