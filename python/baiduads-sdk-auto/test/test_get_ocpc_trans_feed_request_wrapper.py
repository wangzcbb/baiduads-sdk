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
from baiduads.searchfeed.model.trans_trace_api_request import TransTraceApiRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['TransTraceApiRequest'] = TransTraceApiRequest
from baiduads.searchfeed.model.get_ocpc_trans_feed_request_wrapper import GetOcpcTransFeedRequestWrapper


class TestGetOcpcTransFeedRequestWrapper(unittest.TestCase):
    """GetOcpcTransFeedRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetOcpcTransFeedRequestWrapper(self):
        """Test GetOcpcTransFeedRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetOcpcTransFeedRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
