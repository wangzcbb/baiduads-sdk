"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.videocontent.model.video_content_selector import VideoContentSelector
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['VideoContentSelector'] = VideoContentSelector
from baiduads.videocontent.model.query_content_request_wrapper import QueryContentRequestWrapper


class TestQueryContentRequestWrapper(unittest.TestCase):
    """QueryContentRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testQueryContentRequestWrapper(self):
        """Test QueryContentRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = QueryContentRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
