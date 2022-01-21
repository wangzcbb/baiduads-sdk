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
from baiduads.campaign.model.add_campaign_request_wrapper import AddCampaignRequestWrapper
from baiduads.campaign.model.add_campaign_response_wrapper import AddCampaignResponseWrapper
from baiduads.campaign.model.delete_campaign_request_wrapper import DeleteCampaignRequestWrapper
from baiduads.campaign.model.delete_campaign_response_wrapper import DeleteCampaignResponseWrapper
from baiduads.campaign.model.get_campaign_request_wrapper import GetCampaignRequestWrapper
from baiduads.campaign.model.get_campaign_response_wrapper import GetCampaignResponseWrapper
from baiduads.campaign.model.update_campaign_request_wrapper import UpdateCampaignRequestWrapper
from baiduads.campaign.model.update_campaign_response_wrapper import UpdateCampaignResponseWrapper


class CampaignService(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client
        self.add_campaign_endpoint = _Endpoint(
            settings={
                'response_type': (AddCampaignResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/CampaignService/addCampaign',
                'operation_id': 'add_campaign',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'add_campaign_request_wrapper',
                ],
                'required': [
                    'add_campaign_request_wrapper',
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
                    'add_campaign_request_wrapper':
                        (AddCampaignRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'add_campaign_request_wrapper': 'body',
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
        self.delete_campaign_endpoint = _Endpoint(
            settings={
                'response_type': (DeleteCampaignResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/CampaignService/deleteCampaign',
                'operation_id': 'delete_campaign',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'delete_campaign_request_wrapper',
                ],
                'required': [
                    'delete_campaign_request_wrapper',
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
                    'delete_campaign_request_wrapper':
                        (DeleteCampaignRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'delete_campaign_request_wrapper': 'body',
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
        self.get_campaign_endpoint = _Endpoint(
            settings={
                'response_type': (GetCampaignResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/CampaignService/getCampaign',
                'operation_id': 'get_campaign',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'get_campaign_request_wrapper',
                ],
                'required': [
                    'get_campaign_request_wrapper',
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
                    'get_campaign_request_wrapper':
                        (GetCampaignRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'get_campaign_request_wrapper': 'body',
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
        self.update_campaign_endpoint = _Endpoint(
            settings={
                'response_type': (UpdateCampaignResponseWrapper,),
                'auth': [],
                'endpoint_path': '/json/sms/service/CampaignService/updateCampaign',
                'operation_id': 'update_campaign',
                'http_method': 'POST',
                'servers': None,
            },
            params_map={
                'all': [
                    'update_campaign_request_wrapper',
                ],
                'required': [
                    'update_campaign_request_wrapper',
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
                    'update_campaign_request_wrapper':
                        (UpdateCampaignRequestWrapper,),
                },
                'attribute_map': {
                },
                'location_map': {
                    'update_campaign_request_wrapper': 'body',
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

    def add_campaign(
        self,
        add_campaign_request_wrapper,
        **kwargs
    ):
        """add_campaign  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.add_campaign(add_campaign_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            add_campaign_request_wrapper (AddCampaignRequestWrapper):

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
            AddCampaignResponseWrapper
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
        kwargs['add_campaign_request_wrapper'] = \
            add_campaign_request_wrapper
        return self.add_campaign_endpoint.call_with_http_info(**kwargs)

    def delete_campaign(
        self,
        delete_campaign_request_wrapper,
        **kwargs
    ):
        """delete_campaign  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.delete_campaign(delete_campaign_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            delete_campaign_request_wrapper (DeleteCampaignRequestWrapper):

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
            DeleteCampaignResponseWrapper
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
        kwargs['delete_campaign_request_wrapper'] = \
            delete_campaign_request_wrapper
        return self.delete_campaign_endpoint.call_with_http_info(**kwargs)

    def get_campaign(
        self,
        get_campaign_request_wrapper,
        **kwargs
    ):
        """get_campaign  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_campaign(get_campaign_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            get_campaign_request_wrapper (GetCampaignRequestWrapper):

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
            GetCampaignResponseWrapper
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
        kwargs['get_campaign_request_wrapper'] = \
            get_campaign_request_wrapper
        return self.get_campaign_endpoint.call_with_http_info(**kwargs)

    def update_campaign(
        self,
        update_campaign_request_wrapper,
        **kwargs
    ):
        """update_campaign  # noqa: E501

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.update_campaign(update_campaign_request_wrapper, async_req=True)
        >>> result = thread.get()

        Args:
            update_campaign_request_wrapper (UpdateCampaignRequestWrapper):

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
            UpdateCampaignResponseWrapper
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
        kwargs['update_campaign_request_wrapper'] = \
            update_campaign_request_wrapper
        return self.update_campaign_endpoint.call_with_http_info(**kwargs)

