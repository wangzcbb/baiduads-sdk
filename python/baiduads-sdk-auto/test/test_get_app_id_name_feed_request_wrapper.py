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
from baiduads.searchfeed.model.get_app_id_name_feed_request import GetAppIdNameFeedRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetAppIdNameFeedRequest'] = GetAppIdNameFeedRequest
from baiduads.searchfeed.model.get_app_id_name_feed_request_wrapper import GetAppIdNameFeedRequestWrapper


class TestGetAppIdNameFeedRequestWrapper(unittest.TestCase):
    """GetAppIdNameFeedRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetAppIdNameFeedRequestWrapper(self):
        """Test GetAppIdNameFeedRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetAppIdNameFeedRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
