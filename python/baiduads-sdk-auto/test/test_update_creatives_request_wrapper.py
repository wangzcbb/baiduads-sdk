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
from baiduads.newcreative.model.add_creative_request import AddCreativeRequest
globals()['AddCreativeRequest'] = AddCreativeRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.newcreative.model.update_creatives_request_wrapper import UpdateCreativesRequestWrapper


class TestUpdateCreativesRequestWrapper(unittest.TestCase):
    """UpdateCreativesRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUpdateCreativesRequestWrapper(self):
        """Test UpdateCreativesRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UpdateCreativesRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
