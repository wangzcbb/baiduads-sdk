"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.searchfeed.model.get_media_package_request import GetMediaPackageRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetMediaPackageRequest'] = GetMediaPackageRequest
from baiduads.searchfeed.model.get_media_packages_request_wrapper import GetMediaPackagesRequestWrapper


class TestGetMediaPackagesRequestWrapper(unittest.TestCase):
    """GetMediaPackagesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMediaPackagesRequestWrapper(self):
        """Test GetMediaPackagesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMediaPackagesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
