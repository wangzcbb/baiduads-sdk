"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.segmentshield.model.segment_shield_mod_request import SegmentShieldModRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['SegmentShieldModRequest'] = SegmentShieldModRequest
from baiduads.segmentshield.model.add_segment_shield_request_wrapper import AddSegmentShieldRequestWrapper


class TestAddSegmentShieldRequestWrapper(unittest.TestCase):
    """AddSegmentShieldRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddSegmentShieldRequestWrapper(self):
        """Test AddSegmentShieldRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddSegmentShieldRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
