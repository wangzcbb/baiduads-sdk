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
from baiduads.dpacreativefeed.model.get_creative_preview_request import GetCreativePreviewRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetCreativePreviewRequest'] = GetCreativePreviewRequest
from baiduads.dpacreativefeed.model.get_creative_preview_request_wrapper import GetCreativePreviewRequestWrapper


class TestGetCreativePreviewRequestWrapper(unittest.TestCase):
    """GetCreativePreviewRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCreativePreviewRequestWrapper(self):
        """Test GetCreativePreviewRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCreativePreviewRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
