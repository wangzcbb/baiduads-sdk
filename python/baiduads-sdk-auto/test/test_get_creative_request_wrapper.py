"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.creative.model.api_creative_query_request import ApiCreativeQueryRequest
globals()['ApiCreativeQueryRequest'] = ApiCreativeQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.creative.model.get_creative_request_wrapper import GetCreativeRequestWrapper


class TestGetCreativeRequestWrapper(unittest.TestCase):
    """GetCreativeRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCreativeRequestWrapper(self):
        """Test GetCreativeRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCreativeRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
