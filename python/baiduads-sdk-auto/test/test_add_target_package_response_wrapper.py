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
from baiduads.ocpc.model.get_target_package_list_response_wrapper_body import GetTargetPackageListResponseWrapperBody
globals()['ApiResponseHeader'] = ApiResponseHeader
globals()['GetTargetPackageListResponseWrapperBody'] = GetTargetPackageListResponseWrapperBody
from baiduads.ocpc.model.add_target_package_response_wrapper import AddTargetPackageResponseWrapper


class TestAddTargetPackageResponseWrapper(unittest.TestCase):
    """AddTargetPackageResponseWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddTargetPackageResponseWrapper(self):
        """Test AddTargetPackageResponseWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddTargetPackageResponseWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
