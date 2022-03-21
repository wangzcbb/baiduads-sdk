"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from baiduads.api_client import ApiClient, Endpoint as _Endpoint
from baiduads.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    none_type,
    validate_and_convert_types
)
from baiduads.custommp.model.add_custom_mp_request_wrapper import AddCustomMPRequestWrapper
from baiduads.custommp.model.add_custom_mp_response_wrapper import AddCustomMPResponseWrapper
from baiduads.custommp.model.delete_custom_mp_request_wrapper import DeleteCustomMPRequestWrapper
from baiduads.custommp.model.delete_custom_mp_response_wrapper import DeleteCustomMPResponseWrapper
from baiduads.custommp.model.get_custom_mp_request_wrapper import GetCustomMPRequestWrapper
from baiduads.custommp.model.get_custom_mp_response_wrapper import GetCustomMPResponseWrapper
from baiduads.custommp.model.update_custom_mp_request_wrapper import UpdateCustomMPRequestWrapper
from baiduads.custommp.model.update_custom_mp_response_wrapper import UpdateCustomMPResponseWrapper


class CustomMPService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_custom_mp_endpoint = _Endpoint(
            settings={
                'response_type': (AddCustomMPResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CustomMPService/addCustomMP',
                'operation_id': 'add_custom_mp',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_custom_mp_request_wrapper',
                ],
                'required': [
                    'add_custom_mp_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'add_custom_mp_request_wrapper':
                        (AddCustomMPRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_custom_mp_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.delete_custom_mp_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteCustomMPResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CustomMPService/deleteCustomMP',
                'operation_id': 'delete_custom_mp',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_custom_mp_request_wrapper',
                ],
                'required': [
                    'delete_custom_mp_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'delete_custom_mp_request_wrapper':
                        (DeleteCustomMPRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_custom_mp_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.get_custom_mp_endpoint = _Endpoint(
            settings={
                'response_type': (GetCustomMPResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CustomMPService/getCustomMP',
                'operation_id': 'get_custom_mp',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_custom_mp_request_wrapper',
                ],
                'required': [
                    'get_custom_mp_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'get_custom_mp_request_wrapper':
                        (GetCustomMPRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_custom_mp_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )
        self.update_custom_mp_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateCustomMPResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/CustomMPService/updateCustomMP',
                'operation_id': 'update_custom_mp',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_custom_mp_request_wrapper',
                ],
                'required': [
                    'update_custom_mp_request_wrapper',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'update_custom_mp_request_wrapper':
                        (UpdateCustomMPRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_custom_mp_request_wrapper': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json;charset=UTF-8'
                ],
                'content_type': [
                    'application/json;charset=UTF-8'
                ]
            },
            api_client=api_client
        )

    def add_custom_mp(
        self,
        add_custom_mp_request_wrapper,
        **kwargs
    ):
        """add_custom_mp  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_custom_mp(add_custom_mp_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_custom_mp_request_wrapper (AddCustomMPRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            AddCustomMPResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['add_custom_mp_request_wrapper'] = \
            add_custom_mp_request_wrapper
        return self.add_custom_mp_endpoint.call_with_http_info(**kwargs)

    def delete_custom_mp(
        self,
        delete_custom_mp_request_wrapper,
        **kwargs
    ):
        """delete_custom_mp  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_custom_mp(delete_custom_mp_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_custom_mp_request_wrapper (DeleteCustomMPRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            DeleteCustomMPResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['delete_custom_mp_request_wrapper'] = \
            delete_custom_mp_request_wrapper
        return self.delete_custom_mp_endpoint.call_with_http_info(**kwargs)

    def get_custom_mp(
        self,
        get_custom_mp_request_wrapper,
        **kwargs
    ):
        """get_custom_mp  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_custom_mp(get_custom_mp_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_custom_mp_request_wrapper (GetCustomMPRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            GetCustomMPResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['get_custom_mp_request_wrapper'] = \
            get_custom_mp_request_wrapper
        return self.get_custom_mp_endpoint.call_with_http_info(**kwargs)

    def update_custom_mp(
        self,
        update_custom_mp_request_wrapper,
        **kwargs
    ):
        """update_custom_mp  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_custom_mp(update_custom_mp_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_custom_mp_request_wrapper (UpdateCustomMPRequestWrapper):

        Keyword Args:
            _return_http_data_only (bool): response data without head status
                code and headers. Default is True.
            _preload_content (bool): if False, the urllib3.HTTPResponse object
                will be returned without reading/decoding response data.
                Default is True.
            _request_timeout (int/float/tuple): timeout setting for this request. If
                one number provided, it will be total request timeout. It can also
                be a pair (tuple) of (connection, read) timeouts.
                Default is None.
            _check_input_type (bool): specifies if type checking
                should be done one the data sent to the server.
                Default is True.
            _check_return_type (bool): specifies if type checking
                should be done one the data received from the server.
                Default is True.
            _content_type (str/None): force body content-type.
                Default is None and content-type will be predicted by allowed
                content-types and body.
            _host_index (int/None): specifies the index of the server
                that we want to use.
                Default is read from the configuration.
            async_req (bool): execute request asynchronously

        Returns:
            UpdateCustomMPResponseWrapper
                If the method is called asynchronously, returns the request
                thread.
        """
        kwargs['async_req'] = kwargs.get(
            'async_req', False
        )
        kwargs['_return_http_data_only'] = kwargs.get(
            '_return_http_data_only', True
        )
        kwargs['_preload_content'] = kwargs.get(
            '_preload_content', True
        )
        kwargs['_request_timeout'] = kwargs.get(
            '_request_timeout', None
        )
        kwargs['_check_input_type'] = kwargs.get(
            '_check_input_type', True
        )
        kwargs['_check_return_type'] = kwargs.get(
            '_check_return_type', True
        )
        kwargs['_spec_property_naming'] = kwargs.get(
            '_spec_property_naming', False
        )
        kwargs['_content_type'] = kwargs.get(
            '_content_type')
        kwargs['_host_index'] = kwargs.get('_host_index')
        kwargs['update_custom_mp_request_wrapper'] = \
            update_custom_mp_request_wrapper
        return self.update_custom_mp_endpoint.call_with_http_info(**kwargs)

