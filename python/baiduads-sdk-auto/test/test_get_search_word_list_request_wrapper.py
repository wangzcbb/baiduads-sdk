"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.industrytraffic.model.search_trend_request import SearchTrendRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SearchTrendRequest'] = SearchTrendRequest
from baiduads.industrytraffic.model.get_search_word_list_request_wrapper import GetSearchWordListRequestWrapper


class TestGetSearchWordListRequestWrapper(unittest.TestCase):
    """GetSearchWordListRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetSearchWordListRequestWrapper(self):
        """Test GetSearchWordListRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetSearchWordListRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
