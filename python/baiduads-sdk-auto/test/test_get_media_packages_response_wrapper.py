"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_response_header import ApiResponseHeader
from baiduads.searchfeed.model.get_media_packages_response_wrapper_body import GetMediaPackagesResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetMediaPackagesResponseWrapperBody'] = GetMediaPackagesResponseWrapperBody
from baiduads.searchfeed.model.get_media_packages_response_wrapper import GetMediaPackagesResponseWrapper


class TestGetMediaPackagesResponseWrapper(unittest.TestCase):
    """GetMediaPackagesResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMediaPackagesResponseWrapper(self):
        """Test GetMediaPackagesResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMediaPackagesResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
