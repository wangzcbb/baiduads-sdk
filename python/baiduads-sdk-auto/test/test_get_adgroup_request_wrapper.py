"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.adgroup.model.api_adgroup_query_request import ApiAdgroupQueryRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiAdgroupQueryRequest'] = ApiAdgroupQueryRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.adgroup.model.get_adgroup_request_wrapper import GetAdgroupRequestWrapper


class TestGetAdgroupRequestWrapper(unittest.TestCase):
    """GetAdgroupRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetAdgroupRequestWrapper(self):
        """Test GetAdgroupRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetAdgroupRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
