"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

    The version of the OpenAPI document: 1.0.1-SNAPSHOT
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.livepreview.model.get_live_preview_response_wrapper_body import GetLivePreviewResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetLivePreviewResponseWrapperBody'] = GetLivePreviewResponseWrapperBody
from baiduads.livepreview.model.get_live_preview_response_wrapper import GetLivePreviewResponseWrapper


class TestGetLivePreviewResponseWrapper(unittest.TestCase):
    """GetLivePreviewResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetLivePreviewResponseWrapper(self):
        """Test GetLivePreviewResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetLivePreviewResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
