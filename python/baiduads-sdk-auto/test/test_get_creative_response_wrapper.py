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
from baiduads.creative.model.delete_creative_response_wrapper_body import DeleteCreativeResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['DeleteCreativeResponseWrapperBody'] = DeleteCreativeResponseWrapperBody
from baiduads.creative.model.get_creative_response_wrapper import GetCreativeResponseWrapper


class TestGetCreativeResponseWrapper(unittest.TestCase):
    """GetCreativeResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetCreativeResponseWrapper(self):
        """Test GetCreativeResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetCreativeResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
