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
from baiduads.searchfeed.model.search_media_feed_request import SearchMediaFeedRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SearchMediaFeedRequest'] = SearchMediaFeedRequest
from baiduads.searchfeed.model.get_medias_request_wrapper import GetMediasRequestWrapper


class TestGetMediasRequestWrapper(unittest.TestCase):
    """GetMediasRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetMediasRequestWrapper(self):
        """Test GetMediasRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetMediasRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
