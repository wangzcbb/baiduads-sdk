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
from baiduads.bulkjobfeed.model.get_all_feed_objects_request_wrapper import GetAllFeedObjectsRequestWrapper
from baiduads.bulkjobfeed.model.get_all_feed_objects_response_wrapper import GetAllFeedObjectsResponseWrapper
from baiduads.bulkjobfeed.model.get_file_path_request_wrapper import GetFilePathRequestWrapper
from baiduads.bulkjobfeed.model.get_file_path_response_wrapper import GetFilePathResponseWrapper
from baiduads.bulkjobfeed.model.get_file_status_request_wrapper import GetFileStatusRequestWrapper
from baiduads.bulkjobfeed.model.get_file_status_response_wrapper import GetFileStatusResponseWrapper


class BulkJobFeedService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.get_all_feed_objects_endpoint = _Endpoint(
            settings={
                'response_type': (GetAllFeedObjectsResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/BulkJobFeedService/getAllFeedObjects',
                'operation_id': 'get_all_feed_objects',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_all_feed_objects_request_wrapper',
                ],
                'required': [
                    'get_all_feed_objects_request_wrapper',
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
                    'get_all_feed_objects_request_wrapper':
                        (GetAllFeedObjectsRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_all_feed_objects_request_wrapper': 'body',
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
        self.get_file_path_endpoint = _Endpoint(
            settings={
                'response_type': (GetFilePathResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/BulkJobFeedService/getFilePath',
                'operation_id': 'get_file_path',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_file_path_request_wrapper',
                ],
                'required': [
                    'get_file_path_request_wrapper',
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
                    'get_file_path_request_wrapper':
                        (GetFilePathRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_file_path_request_wrapper': 'body',
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
        self.get_file_status_endpoint = _Endpoint(
            settings={
                'response_type': (GetFileStatusResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/feed/v1/BulkJobFeedService/getFileStatus',
                'operation_id': 'get_file_status',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_file_status_request_wrapper',
                ],
                'required': [
                    'get_file_status_request_wrapper',
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
                    'get_file_status_request_wrapper':
                        (GetFileStatusRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_file_status_request_wrapper': 'body',
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

    def get_all_feed_objects(
        self,
        get_all_feed_objects_request_wrapper,
        **kwargs
    ):
        """get_all_feed_objects  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_all_feed_objects(get_all_feed_objects_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_all_feed_objects_request_wrapper (GetAllFeedObjectsRequestWrapper):

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
            GetAllFeedObjectsResponseWrapper
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
        kwargs['get_all_feed_objects_request_wrapper'] = \
            get_all_feed_objects_request_wrapper
        return self.get_all_feed_objects_endpoint.call_with_http_info(**kwargs)

    def get_file_path(
        self,
        get_file_path_request_wrapper,
        **kwargs
    ):
        """get_file_path  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_file_path(get_file_path_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_file_path_request_wrapper (GetFilePathRequestWrapper):

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
            GetFilePathResponseWrapper
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
        kwargs['get_file_path_request_wrapper'] = \
            get_file_path_request_wrapper
        return self.get_file_path_endpoint.call_with_http_info(**kwargs)

    def get_file_status(
        self,
        get_file_status_request_wrapper,
        **kwargs
    ):
        """get_file_status  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_file_status(get_file_status_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_file_status_request_wrapper (GetFileStatusRequestWrapper):

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
            GetFileStatusResponseWrapper
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
        kwargs['get_file_status_request_wrapper'] = \
            get_file_status_request_wrapper
        return self.get_file_status_endpoint.call_with_http_info(**kwargs)

