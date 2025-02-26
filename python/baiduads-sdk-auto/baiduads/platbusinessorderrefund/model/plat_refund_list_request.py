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
    from baiduads.platbusinessorderrefund.model.status_union_case import StatusUnionCase
    globals()['StatusUnionCase'] = StatusUnionCase


class PlatRefundListRequest(ModelNormal):
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
            'ucid': (int,),  # noqa: E501
            'app_id': (int,),  # noqa: E501
            'order_id': (int,),  # noqa: E501
            'shop_id': (int,),  # noqa: E501
            'passport_id': (int,),  # noqa: E501
            'refund_id': (int,),  # noqa: E501
            'refund_type': (int,),  # noqa: E501
            'refund_status': (int,),  # noqa: E501
            'refund_reason': (int,),  # noqa: E501
            'express_phone': (str,),  # noqa: E501
            'page_num': (int,),  # noqa: E501
            'page_count': (int,),  # noqa: E501
            'product_type': (int,),  # noqa: E501
            'start_time': (str,),  # noqa: E501
            'end_time': (str,),  # noqa: E501
            'order_refund_status': ([int],),  # noqa: E501
            'pay_type': (int,),  # noqa: E501
            'complaint_status': ([int],),  # noqa: E501
            'customer_status': ([int],),  # noqa: E501
            'return_status': (int,),  # noqa: E501
            'product_name': (str,),  # noqa: E501
            'express_info': (str,),  # noqa: E501
            'status_list': ([StatusUnionCase],),  # noqa: E501
            'delivery_status': (int,),  # noqa: E501
            'agg_refund_status': ([int],),  # noqa: E501
            'tab_refund_status': ([int],),  # noqa: E501
            'timeout_sort_type': (int,),  # noqa: E501
            'return_goods_status': (int,),  # noqa: E501
            'refund_base_reason': (int,),  # noqa: E501
            'complaint_judge_result': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'ucid': 'ucid',  # noqa: E501
        'app_id': 'appId',  # noqa: E501
        'order_id': 'orderId',  # noqa: E501
        'shop_id': 'shopId',  # noqa: E501
        'passport_id': 'passportId',  # noqa: E501
        'refund_id': 'refundId',  # noqa: E501
        'refund_type': 'refundType',  # noqa: E501
        'refund_status': 'refundStatus',  # noqa: E501
        'refund_reason': 'refundReason',  # noqa: E501
        'express_phone': 'expressPhone',  # noqa: E501
        'page_num': 'pageNum',  # noqa: E501
        'page_count': 'pageCount',  # noqa: E501
        'product_type': 'productType',  # noqa: E501
        'start_time': 'startTime',  # noqa: E501
        'end_time': 'endTime',  # noqa: E501
        'order_refund_status': 'orderRefundStatus',  # noqa: E501
        'pay_type': 'payType',  # noqa: E501
        'complaint_status': 'complaintStatus',  # noqa: E501
        'customer_status': 'customerStatus',  # noqa: E501
        'return_status': 'returnStatus',  # noqa: E501
        'product_name': 'productName',  # noqa: E501
        'express_info': 'expressInfo',  # noqa: E501
        'status_list': 'statusList',  # noqa: E501
        'delivery_status': 'deliveryStatus',  # noqa: E501
        'agg_refund_status': 'aggRefundStatus',  # noqa: E501
        'tab_refund_status': 'tabRefundStatus',  # noqa: E501
        'timeout_sort_type': 'timeoutSortType',  # noqa: E501
        'return_goods_status': 'returnGoodsStatus',  # noqa: E501
        'refund_base_reason': 'refundBaseReason',  # noqa: E501
        'complaint_judge_result': 'complaintJudgeResult',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, *args, **kwargs):  # noqa: E501
        """PlatRefundListRequest - a model defined in OpenAPI

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
            ucid (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            order_id (int): [optional]  # noqa: E501
            shop_id (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
            refund_type (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            refund_reason (int): [optional]  # noqa: E501
            express_phone (str): [optional]  # noqa: E501
            page_num (int): [optional]  # noqa: E501
            page_count (int): [optional]  # noqa: E501
            product_type (int): [optional]  # noqa: E501
            start_time (str): [optional]  # noqa: E501
            end_time (str): [optional]  # noqa: E501
            order_refund_status ([int]): [optional]  # noqa: E501
            pay_type (int): [optional]  # noqa: E501
            complaint_status ([int]): [optional]  # noqa: E501
            customer_status ([int]): [optional]  # noqa: E501
            return_status (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            express_info (str): [optional]  # noqa: E501
            status_list ([StatusUnionCase]): [optional]  # noqa: E501
            delivery_status (int): [optional]  # noqa: E501
            agg_refund_status ([int]): [optional]  # noqa: E501
            tab_refund_status ([int]): [optional]  # noqa: E501
            timeout_sort_type (int): [optional]  # noqa: E501
            return_goods_status (int): [optional]  # noqa: E501
            refund_base_reason (int): [optional]  # noqa: E501
            complaint_judge_result (int): [optional]  # noqa: E501
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
        """PlatRefundListRequest - a model defined in OpenAPI

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
            ucid (int): [optional]  # noqa: E501
            app_id (int): [optional]  # noqa: E501
            order_id (int): [optional]  # noqa: E501
            shop_id (int): [optional]  # noqa: E501
            passport_id (int): [optional]  # noqa: E501
            refund_id (int): [optional]  # noqa: E501
            refund_type (int): [optional]  # noqa: E501
            refund_status (int): [optional]  # noqa: E501
            refund_reason (int): [optional]  # noqa: E501
            express_phone (str): [optional]  # noqa: E501
            page_num (int): [optional]  # noqa: E501
            page_count (int): [optional]  # noqa: E501
            product_type (int): [optional]  # noqa: E501
            start_time (str): [optional]  # noqa: E501
            end_time (str): [optional]  # noqa: E501
            order_refund_status ([int]): [optional]  # noqa: E501
            pay_type (int): [optional]  # noqa: E501
            complaint_status ([int]): [optional]  # noqa: E501
            customer_status ([int]): [optional]  # noqa: E501
            return_status (int): [optional]  # noqa: E501
            product_name (str): [optional]  # noqa: E501
            express_info (str): [optional]  # noqa: E501
            status_list ([StatusUnionCase]): [optional]  # noqa: E501
            delivery_status (int): [optional]  # noqa: E501
            agg_refund_status ([int]): [optional]  # noqa: E501
            tab_refund_status ([int]): [optional]  # noqa: E501
            timeout_sort_type (int): [optional]  # noqa: E501
            return_goods_status (int): [optional]  # noqa: E501
            refund_base_reason (int): [optional]  # noqa: E501
            complaint_judge_result (int): [optional]  # noqa: E501
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
