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
from baiduads.crowdfeed.model.get_bind_adgroup_request_wrapper_body import GetBindAdgroupRequestWrapperBody
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetBindAdgroupRequestWrapperBody'] = GetBindAdgroupRequestWrapperBody
from baiduads.crowdfeed.model.get_bind_adgroup_request_wrapper import GetBindAdgroupRequestWrapper


class TestGetBindAdgroupRequestWrapper(unittest.TestCase):
    """GetBindAdgroupRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetBindAdgroupRequestWrapper(self):
        """Test GetBindAdgroupRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetBindAdgroupRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
