"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.fmleadsupdate.model.add_mark_request import AddMarkRequest
globals()['AddMarkRequest'] = AddMarkRequest
globals()['ApiRequestHeader'] = ApiRequestHeader
from baiduads.fmleadsupdate.model.add_mark_request_wrapper import AddMarkRequestWrapper


class TestAddMarkRequestWrapper(unittest.TestCase):
    """AddMarkRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddMarkRequestWrapper(self):
        """Test AddMarkRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddMarkRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
