"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.dpacreative.model.add_creative_request import AddCreativeRequest
globals()['AddCreativeRequest'] = AddCreativeRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.dpacreative.model.add_creatives_request_wrapper import AddCreativesRequestWrapper


class TestAddCreativesRequestWrapper(unittest.TestCase):
    """AddCreativesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddCreativesRequestWrapper(self):
        """Test AddCreativesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddCreativesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
